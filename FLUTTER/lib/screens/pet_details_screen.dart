import 'package:flutter/material.dart';
import '../models/pet_model.dart';
import 'package:petapp/gen_l10n/app_localizations.dart';

class PetDetailsScreen extends StatelessWidget {
  final Pet pet;

  const PetDetailsScreen(this.pet, {super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(pet.name),
      ),
      body: SingleChildScrollView(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            // Pet Image with Placeholder Handling
            SizedBox(
              width: double.infinity,
              height: 250,
              child: pet.imageUrl.isNotEmpty
                  ? Image.network(
                      pet.imageUrl,
                      fit: BoxFit.cover,
                      errorBuilder: (context, error, stackTrace) =>
                          _buildPlaceholder(),
                    )
                  : _buildPlaceholder(),
            ),
            const SizedBox(height: 10),

            // Pet Name
            Text(
              pet.name,
              style: const TextStyle(
                  fontSize: 24, fontWeight: FontWeight.bold),
            ),

            // Pet Breed
            Text(
              pet.breed,
              style: const TextStyle(fontSize: 18, color: Colors.grey),
            ),
            const SizedBox(height: 10),

            // Pet Description
            Padding(
              padding: const EdgeInsets.symmetric(horizontal: 16.0),
              child: Text(
                pet.description.isNotEmpty
                    ? pet.description
                    : AppLocalizations.of(context).noDescription,
                textAlign: TextAlign.center,
                style: const TextStyle(fontSize: 16),
              ),
            ),

            const SizedBox(height: 20),

            // Price Display
            Container(
              padding: const EdgeInsets.all(12),
              margin: const EdgeInsets.symmetric(vertical: 10),
              decoration: BoxDecoration(
                color: Colors.green.shade100,
                borderRadius: BorderRadius.circular(8),
              ),
              child: Text(
                "${AppLocalizations.of(context).price}: \$${pet.price.toStringAsFixed(2)}",
                style: const TextStyle(
                  fontSize: 20,
                  fontWeight: FontWeight.bold,
                  color: Colors.green,
                ),
              ),
            ),

            // Divider
            const Divider(thickness: 1),

            // Giver's Details Section
            const Text(
              "Giver's Information",
              style: TextStyle(
                  fontSize: 20, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 10),

            _buildGiverDetail(AppLocalizations.of(context).giverName, pet.giverName),
            _buildGiverDetail(AppLocalizations.of(context).giverAddress, pet.giverAddress),
            _buildGiverDetail(AppLocalizations.of(context).giverContact, pet.giverContact),

            const SizedBox(height: 20),

            // Back Button
            ElevatedButton.icon(
              onPressed: () => Navigator.pop(context),
              icon: const Icon(Icons.arrow_back),
              label: Text(AppLocalizations.of(context).back),
              style: ElevatedButton.styleFrom(
                padding:
                    const EdgeInsets.symmetric(horizontal: 20, vertical: 10),
              ),
            ),

            const SizedBox(height: 20),
          ],
        ),
      ),
    );
  }

  // Placeholder Image
  Widget _buildPlaceholder() {
    return Container(
      width: double.infinity,
      height: 250,
      color: Colors.grey[300],
      child: const Center(
        child: Icon(Icons.pets, size: 80, color: Colors.white),
      ),
    );
  }

  // Helper Widget for Giver Details
  Widget _buildGiverDetail(String title, String value) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 4.0),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.start,
        children: [
          Text(
            "$title: ",
            style: const TextStyle(
                fontSize: 16, fontWeight: FontWeight.bold),
          ),
          Expanded(
            child: Text(
              value.isNotEmpty ? value : "Not available",
              style: const TextStyle(fontSize: 16),
            ),
          ),
        ],
      ),
    );
  }
}
