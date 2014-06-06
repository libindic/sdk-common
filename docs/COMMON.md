Usage
=====

### Note :
This module is still under development and this document presently shows only currently available utilities.


#### Character Map : 
```
int cmp = CharacterMap.charCompare('ॐ', 'ॐ');
```

The above function `CharacterMap.charCompare(char, char);` accepts two unicode characters and returns :

 ```
 0  - if both characters are same
 1  - if both characters are similar but from different language
 -1 - if any one or both characters are not found
 ```


#### Language detect
```
String lang = LanguageDetect.detectLanguage("बॆंगलूरु").get("बॆंगलूरु");
```

The above function `LanguageDetect.detectLanguage(String);` accepts unicode string and returns a map <Text, Language>
 values are :

```
"hi_IN" -  HINDI 
"bn_IN" -  BENGALI 
"pa_IN" -  PUNJABI 
"gu_IN" -  GUJARATI 
"or_IN" -  ORIYA 
"ta_IN" -  TAMIL 
"te_IN" -  TELUGU
"kn_IN" -  KANNADA 
"ml_IN" -  MALAYALAM 
"en_US" -  ENGLISH_US 
```

#### To run tests

  - Select test to run
  - Right Click -> Run Test -> Run as Android Test

