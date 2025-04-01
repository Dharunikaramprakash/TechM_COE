import 'package:cloud_firestore/cloud_firestore.dart';
import '../models/pet_model.dart';

class FirebaseService {
  final CollectionReference petsCollection =
      FirebaseFirestore.instance.collection('pets');

  Future<void> addPet(Pet pet) async {
    await petsCollection.add(pet.toJson()); // ✅ Changed to use `toJson()`
  }

  Stream<List<Pet>> getPets() {
    return petsCollection.snapshots().map((snapshot) => snapshot.docs
        .map((doc) => Pet.fromJson(doc.data() as Map<String, dynamic>).copyWith(id: doc.id))
        .toList());
  }
}
