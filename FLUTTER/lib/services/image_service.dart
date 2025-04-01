import 'dart:convert';
import 'dart:io';
import 'package:image_picker/image_picker.dart';
import 'package:cloud_firestore/cloud_firestore.dart';

class ImageService {
  final ImagePicker picker = ImagePicker();

  Future<void> uploadImageToFirestore(String petName, String breed, String description) async {
    final pickedFile = await picker.pickImage(source: ImageSource.gallery);
    if (pickedFile == null) return;

    File imageFile = File(pickedFile.path);
    List<int> imageBytes = await imageFile.readAsBytes();
    String base64String = base64Encode(imageBytes);

    await FirebaseFirestore.instance.collection('pets').add({
      'pet_name': petName,
      'breed': breed,
      'description': description,
      'image': base64String,
    });

    print("Image uploaded to Firestore as Base64");
  }
}
