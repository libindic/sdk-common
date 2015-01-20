package org.libindic.sdk.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sujith on 27/5/14.
 */
public class LanguageDetect {

    private static final String PUNCTUATIONS_REGEX = "[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~\\\\]";

    public static Map<String, String> detectLanguage(String text) {

        String[] words = text.split(" ");
        int wordCount = words.length;
        int wordIter = 0;
        Map<String, String> resultDict = new HashMap<String, String>();

        while (wordIter < wordCount) {
            String word = words[wordIter];
            if (word != null && word.length() != 0) {
                String origWord = word;
                word = word.replaceAll(LanguageDetect.PUNCTUATIONS_REGEX, "");
                int length = word.length();
                int index = 0;

                while (index < length) {
                    char letter = word.charAt(index);
                    if (!Character.isLetter(letter)) {
                        index = index + 1;
                        continue;
                    }

                    if (letter >= 0x0D00 && letter <= 0x0D7F) {
                        resultDict.put(origWord, "ml_IN");
                        break;
                    }
                    if (letter >= 0x0980 && letter <= 0x09FF) {
                        resultDict.put(origWord, "bn_IN");
                        break;
                    }
                    if (letter >= 0x0900 && letter <= 0x097F) {
                        resultDict.put(origWord, "hi_IN");
                        break;
                    }
                    if (letter >= 0x0A80 && letter <= 0x0AFF) {
                        resultDict.put(origWord, "gu_IN");
                        break;
                    }
                    if (letter >= 0x0A00 && letter <= 0x0A7F) {
                        resultDict.put(origWord, "pa_IN");
                        break;
                    }
                    if (letter >= 0x0C80 && letter <= 0x0CFF) {
                        resultDict.put(origWord, "kn_IN");
                        break;
                    }
                    if (letter >= 0x0B00 && letter <= 0x0B7F) {
                        resultDict.put(origWord, "or_IN");
                        break;
                    }
                    if (letter >= 0x0B80 && letter <= 0x0BFF) {
                        resultDict.put(origWord, "ta_IN");
                        break;
                    }
                    if (letter >= 0x0C00 && letter <= 0x0C7F) {
                        resultDict.put(origWord, "te_IN");
                        break;
                    }
                    if (letter <= 'z') {
                        resultDict.put(origWord, "en_US");
                        break;
                    }
                    index = index + 1;
                }
            }
            wordIter = wordIter + 1;
        }
        return resultDict;
    }
}
