package com.stackroute.Pe3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * Write a program to set up an array of places, Loop round and remove the vowels. Display the new words in console
 * */

public class RemoveVowels {
    private static final List<Character> LOWERCASE_VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

    /**
     * Removes lower case vowels
     *
     * @param places
     * @return Returns a list of strings with lowercase vowels removed
     */
    List<String> removeLowerCaseVowels(List<String> places) {
        List<String> result = new ArrayList<>();
        for (String item : places) {
            StringBuilder stringBuilder = new StringBuilder(item);
            for (int j = 0; j < stringBuilder.length(); ) {
                if (LOWERCASE_VOWELS.contains(stringBuilder.charAt(j))) {
                    stringBuilder.deleteCharAt(j);
                } else {
                    j += 1;
                }
            }
            result.add(stringBuilder.toString());
        }
        return result;
    }
}
