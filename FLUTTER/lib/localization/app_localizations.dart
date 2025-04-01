import 'package:flutter/material.dart';
import 'app_localizations_en.dart';
import 'app_localizations_es.dart';
import 'app_localizations_fr.dart';

class AppLocalizations {
  static Map<String, Map<String, String>> localizedValues = {
    'en': en,
    'es': es,
    'fr': fr,
  };

  static String translate(BuildContext context, String key) {
    return localizedValues[Localizations.localeOf(context).languageCode]?[key] ?? key;
  }
}
