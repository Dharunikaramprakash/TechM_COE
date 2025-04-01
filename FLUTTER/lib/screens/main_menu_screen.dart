import 'package:flutter/material.dart';
import 'package:petapp/gen_l10n/app_localizations.dart';
import 'available_pets_screen.dart'; // New screen for pets list
import 'add_pet_screen.dart';

class MainMenuScreen extends StatelessWidget {
  final void Function(Locale) changeLanguage; // Language change function

  const MainMenuScreen({super.key, required this.changeLanguage});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(AppLocalizations.of(context).mainMenu),
        centerTitle: true,
        leading: IconButton(
          icon: const Icon(Icons.arrow_back),
          onPressed: () => Navigator.pop(context),
        ),
        actions: [
          IconButton(
            icon: const Icon(Icons.language),
            onPressed: () => _showLanguageSelection(context),
          ),
        ],
      ),
      body: Stack(
        fit: StackFit.expand,
        children: [
          // 🌟 Background Image
          Image.asset(
            'assets/images/images.png', // Make sure the image exists in assets
            fit: BoxFit.cover,
          ),

          // 🌟 Content Overlay
          Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                _buildButton(
                  text: AppLocalizations.of(context).availablePets,
                  onTap: () {
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                          builder: (context) => AvailablePetsScreen(changeLanguage: changeLanguage)),
                    );
                  },
                ),
                const SizedBox(height: 20),
                _buildButton(
                  text: AppLocalizations.of(context).addPet,
                  onTap: () {
                    Navigator.push(
                      context,
                      MaterialPageRoute(builder: (context) => const AddPetScreen()),
                    );
                  },
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }

  /// **Reusable Button Widget**
  Widget _buildButton({required String text, required VoidCallback onTap}) {
    return ElevatedButton(
      style: ElevatedButton.styleFrom(
        backgroundColor: Colors.white.withOpacity(0.8), // Semi-transparent white
        foregroundColor: Colors.purple, // Text color
        padding: const EdgeInsets.symmetric(vertical: 14, horizontal: 24),
        textStyle: const TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
      ),
      onPressed: onTap,
      child: Text(text),
    );
  }

  /// **🔹 Shows a language selection popup**
  void _showLanguageSelection(BuildContext context) {
    showDialog(
      context: context,
      builder: (BuildContext context) {
        return AlertDialog(
          title: Text(AppLocalizations.of(context).chooseLanguage),
          content: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              _buildLanguageOption(context, AppLocalizations.of(context).english, const Locale('en')),
              _buildLanguageOption(context, AppLocalizations.of(context).spanish, const Locale('es')),
              _buildLanguageOption(context, AppLocalizations.of(context).arabic, const Locale('ar')),
            ],
          ),
        );
      },
    );
  }

  /// **Reusable Language Selection Tile**
  Widget _buildLanguageOption(BuildContext context, String languageName, Locale locale) {
    return ListTile(
      title: Text(languageName),
      onTap: () {
        changeLanguage(locale);
        Navigator.pop(context);
      },
    );
  }
}
