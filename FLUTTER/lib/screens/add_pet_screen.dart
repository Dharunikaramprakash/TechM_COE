import 'package:flutter/material.dart';
import '../services/firebase_service.dart';
import '../models/pet_model.dart';
import 'package:petapp/gen_l10n/app_localizations.dart';

class AddPetScreen extends StatefulWidget {
  const AddPetScreen({super.key});

  @override
  _AddPetScreenState createState() => _AddPetScreenState();
}

class _AddPetScreenState extends State<AddPetScreen> {
  final TextEditingController nameController = TextEditingController();
  final TextEditingController breedController = TextEditingController();
  final TextEditingController imageUrlController = TextEditingController();
  final TextEditingController descriptionController = TextEditingController();
  final TextEditingController giverNameController = TextEditingController();
  final TextEditingController giverAddressController = TextEditingController();
  final TextEditingController giverContactController = TextEditingController();
  final TextEditingController priceController = TextEditingController(); // ✅ New Price Field

  final FirebaseService _firebaseService = FirebaseService();

  void addPet() {
    Pet newPet = Pet(
      id: '',
      name: nameController.text,
      breed: breedController.text,
      imageUrl: imageUrlController.text,
      description: descriptionController.text,
      giverName: giverNameController.text,
      giverAddress: giverAddressController.text,
      giverContact: giverContactController.text,
      price: double.tryParse(priceController.text) ?? 0.0, // ✅ Convert price to double
    );

    _firebaseService.addPet(newPet);
    Navigator.pop(context);
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(AppLocalizations.of(context).addPet), // ✅ Localized title
      ),
      body: SingleChildScrollView(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            TextField(
              controller: nameController,
              decoration: InputDecoration(
                labelText: AppLocalizations.of(context).name, // ✅ Localized
              ),
            ),
            TextField(
              controller: breedController,
              decoration: InputDecoration(
                labelText: AppLocalizations.of(context).breed, // ✅ Localized
              ),
            ),
            TextField(
              controller: imageUrlController,
              decoration: InputDecoration(
                labelText: AppLocalizations.of(context).imageUrl, // ✅ Localized
              ),
            ),
            TextField(
              controller: descriptionController,
              decoration: InputDecoration(
                labelText: AppLocalizations.of(context).description, // ✅ Localized
              ),
            ),
            const SizedBox(height: 10),
            TextField(
              controller: giverNameController,
              decoration: InputDecoration(
                labelText: AppLocalizations.of(context).giverName, // ✅ New Field
              ),
            ),
            TextField(
              controller: giverAddressController,
              decoration: InputDecoration(
                labelText: AppLocalizations.of(context).giverAddress, // ✅ New Field
              ),
            ),
            TextField(
              controller: giverContactController,
              decoration: InputDecoration(
                labelText: AppLocalizations.of(context).giverContact, // ✅ New Field
              ),
              keyboardType: TextInputType.phone,
            ),
            TextField(
              controller: priceController,
              decoration: InputDecoration(
                labelText: AppLocalizations.of(context).price, // ✅ New Field
              ),
              keyboardType: TextInputType.number, // ✅ Numeric input for price
            ),
            const SizedBox(height: 20),
            ElevatedButton(
              onPressed: addPet,
              child: Text(AppLocalizations.of(context).addPet), // ✅ Localized button text
            ),
          ],
        ),
      ),
    );
  }
}
