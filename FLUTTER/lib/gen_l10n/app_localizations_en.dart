// ignore: unused_import
import 'package:intl/intl.dart' as intl;
import 'app_localizations.dart';

// ignore_for_file: type=lint

/// The translations for English (`en`).
class AppLocalizationsEn extends AppLocalizations {
  AppLocalizationsEn([String locale = 'en']) : super(locale);

  @override
  String get title => 'Pet Adoption';

  @override
  String get welcomeMessage => 'Welcome to iAdopt The Pet Adoption App!';

  @override
  String get addPet => 'Donate a Pet';

  @override
  String get addedSuccessfully => 'Pet added successfully!';

  @override
  String get errorLoadingPets => 'Error loading pets. Please try again.';

  @override
  String get noPetsAvailable => 'No pets available.';

  @override
  String get name => 'Name';

  @override
  String get breed => 'Breed';

  @override
  String get imageUrl => 'Image URL';

  @override
  String get description => 'Description';

  @override
  String get enterName => 'Enter pet\'s name';

  @override
  String get enterBreed => 'Enter pet\'s breed';

  @override
  String get enterImageUrl => 'Enter image URL';

  @override
  String get enterDescription => 'Enter pet\'s description';

  @override
  String get chooseLanguage => 'Choose a Language';

  @override
  String get english => 'English';

  @override
  String get spanish => 'Español';

  @override
  String get arabic => 'العربية';

  @override
  String get mainMenu => 'iAdopt';

  @override
  String get goToHome => 'Go to Home';

  @override
  String get availablePets => 'Available Pets for Adoption';

  @override
  String get petName => 'Pet Name';

  @override
  String get petBreed => 'Breed';

  @override
  String get petDescription => 'Description';

  @override
  String get selectImage => 'Select Image';

  @override
  String get noImageSelected => 'No image selected';

  @override
  String get fillAllFields => 'Please fill all fields and select an image';

  @override
  String get imageUploadFailed => 'Failed to upload image';

  @override
  String get giverName => 'Giver\'s Name';

  @override
  String get giverAddress => 'Giver\'s Address';

  @override
  String get giverContact => 'Giver\'s Contact';

  @override
  String get price => 'Price';

  @override
  String get noDescription => 'No description available';

  @override
  String get back => 'Back';
}
