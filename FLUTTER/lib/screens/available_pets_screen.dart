import 'package:flutter/material.dart';
import 'package:cached_network_image/cached_network_image.dart';
import 'package:petapp/gen_l10n/app_localizations.dart';
import '../services/firebase_service.dart';
import '../models/pet_model.dart';
import 'pet_details_screen.dart';

class AvailablePetsScreen extends StatelessWidget {
  final FirebaseService _firebaseService = FirebaseService();
  final void Function(Locale) changeLanguage; // Passed from main.dart

  AvailablePetsScreen({super.key, required this.changeLanguage});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(AppLocalizations.of(context).availablePets),
        actions: [
          IconButton(
            icon: const Icon(Icons.language),
            onPressed: () {
              Locale newLocale = Localizations.localeOf(context).languageCode == 'en'
                  ? const Locale('es') // Change to Spanish (or another language)
                  : const Locale('en');
              changeLanguage(newLocale);
            },
          ),
        ],
      ),
      body: StreamBuilder<List<Pet>>(
        stream: _firebaseService.getPets(),
        builder: (context, snapshot) {
          if (snapshot.connectionState == ConnectionState.waiting) {
            return const Center(child: CircularProgressIndicator());
          }

          if (snapshot.hasError) {
            return Center(
              child: Text(
                AppLocalizations.of(context).errorLoadingPets,
                style: const TextStyle(color: Colors.red, fontSize: 16),
              ),
            );
          }

          if (!snapshot.hasData || snapshot.data!.isEmpty) {
            return Center(
              child: Text(
                AppLocalizations.of(context).noPetsAvailable,
                style: const TextStyle(fontSize: 18, fontWeight: FontWeight.w500),
              ),
            );
          }

          List<Pet> pets = snapshot.data!;

          return RefreshIndicator(
            onRefresh: () async {
              await Future.delayed(const Duration(seconds: 1));
            },
            child: ListView.builder(
              itemCount: pets.length,
              itemBuilder: (context, index) {
                Pet pet = pets[index];

                return Card(
                  margin: const EdgeInsets.symmetric(horizontal: 10, vertical: 5),
                  elevation: 3,
                  shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(10)),
                  child: ListTile(
                    contentPadding: const EdgeInsets.all(10),
                    leading: ClipRRect(
                      borderRadius: BorderRadius.circular(30),
                      child: pet.imageUrl.isNotEmpty
                          ?CachedNetworkImage(
  imageUrl: pet.imageUrl,
  width: 60,
  height: 60,
  fit: BoxFit.cover,
  placeholder: (context, url) => Container(
    width: 60,
    height: 60,
    alignment: Alignment.center,
    child: CircularProgressIndicator(),
  ),
  errorWidget: (context, url, error) => Icon(
    Icons.broken_image,
    size: 40,
    color: Colors.grey,
  ),
)
                          : const Icon(Icons.pets, size: 40, color: Colors.grey),
                    ),
                    title: Text(
                      pet.name,
                      style: const TextStyle(fontWeight: FontWeight.bold, fontSize: 18),
                    ),
                    subtitle: Text(
                      pet.breed,
                      style: const TextStyle(color: Colors.grey, fontSize: 14),
                    ),
                    trailing: const Icon(Icons.arrow_forward_ios, size: 18),
                    onTap: () {
                      Navigator.push(
                        context,
                        MaterialPageRoute(builder: (context) => PetDetailsScreen(pet)),
                      );
                    },
                  ),
                );
              },
            ),
          );
        },
      ),
    );
  }
}
