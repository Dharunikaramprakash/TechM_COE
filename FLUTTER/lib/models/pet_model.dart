class Pet {
  final String id;
  final String name;
  final String breed;
  final String imageUrl;
  final String description;
  final String giverName; // ✅ New field
  final String giverAddress; // ✅ New field
  final String giverContact;
  final double price; // ✅ New field

  Pet({
    required this.id,
    required this.name,
    required this.breed,
    required this.imageUrl,
    required this.description,
    required this.giverName,
    required this.giverAddress,
    required this.giverContact,
    required this.price,
  });

  /// ✅ Convert Pet object to JSON for Firestore
  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'name': name,
      'breed': breed,
      'imageUrl': imageUrl,
      'description': description,
      'giverName': giverName,
      'giverAddress': giverAddress,
      'giverContact': giverContact,
      'price': price,
    };
  }

  /// ✅ Create Pet object from JSON
  factory Pet.fromJson(Map<String, dynamic> json, {String? id}) {
    return Pet(
      id: id ?? '', // Use provided ID or empty string
      name: json['name'] ?? '',
      breed: json['breed'] ?? '',
      imageUrl: json['imageUrl'] ?? '',
      description: json['description'] ?? '',
      giverName: json['giverName'] ?? '',
      giverAddress: json['giverAddress'] ?? '',
      giverContact: json['giverContact'] ?? '',
      price: (json['price'] is num) ? (json['price'] as num).toDouble() : 0.0, 
    );
  }

  /// ✅ Helper method to update an existing Pet object
  Pet copyWith({
    String? id,
    String? name,
    String? breed,
    String? imageUrl,
    String? description,
    String? giverName,
    String? giverAddress,
    String? giverContact,
     double? price,
  }) {
    return Pet(
      id: id ?? this.id,
      name: name ?? this.name,
      breed: breed ?? this.breed,
      imageUrl: imageUrl ?? this.imageUrl,
      description: description ?? this.description,
      giverName: giverName ?? this.giverName,
      giverAddress: giverAddress ?? this.giverAddress,
      giverContact: giverContact ?? this.giverContact,
       price: price ?? this.price,
    );
  }
}
