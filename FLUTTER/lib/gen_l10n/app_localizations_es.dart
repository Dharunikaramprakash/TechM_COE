// ignore: unused_import
import 'package:intl/intl.dart' as intl;
import 'app_localizations.dart';

// ignore_for_file: type=lint

/// The translations for Spanish Castilian (`es`).
class AppLocalizationsEs extends AppLocalizations {
  AppLocalizationsEs([String locale = 'es']) : super(locale);

  @override
  String get title => 'Adopción de Mascotas';

  @override
  String get welcomeMessage => '¡Bienvenido a la aplicación de adopción de mascotas!';

  @override
  String get addPet => 'Agregar Mascota';

  @override
  String get addedSuccessfully => '¡Mascota agregada con éxito!';

  @override
  String get errorLoadingPets => 'Error al cargar mascotas. Inténtalo de nuevo.';

  @override
  String get noPetsAvailable => 'No hay mascotas disponibles.';

  @override
  String get name => 'Nombre';

  @override
  String get breed => 'Raza';

  @override
  String get imageUrl => 'URL de la imagen';

  @override
  String get description => 'Descripción';

  @override
  String get enterName => 'Ingrese el nombre de la mascota';

  @override
  String get enterBreed => 'Ingrese la raza de la mascota';

  @override
  String get enterImageUrl => 'Ingrese la URL de la imagen';

  @override
  String get enterDescription => 'Ingrese la descripción de la mascota';

  @override
  String get chooseLanguage => 'Elige un idioma';

  @override
  String get english => 'English';

  @override
  String get spanish => 'Spanish';

  @override
  String get arabic => 'العربية';

  @override
  String get mainMenu => 'Menú Principal';

  @override
  String get goToHome => 'Ir a Inicio';

  @override
  String get availablePets => 'Mascotas Disponibles';

  @override
  String get petName => 'Nombre de la Mascota';

  @override
  String get petBreed => 'Raza';

  @override
  String get petDescription => 'Descripción';

  @override
  String get selectImage => 'Seleccionar Imagen';

  @override
  String get noImageSelected => 'Ninguna imagen seleccionada';

  @override
  String get fillAllFields => 'Por favor, complete todos los campos y seleccione una imagen';

  @override
  String get imageUploadFailed => 'Error al subir la imagen';

  @override
  String get giverName => 'Nombre del Dador';

  @override
  String get giverAddress => 'Dirección del Dador';

  @override
  String get giverContact => 'Contacto del Dador';

  @override
  String get price => 'Precio';

  @override
  String get noDescription => 'No hay descripción disponible';

  @override
  String get back => 'Atrás';
}
