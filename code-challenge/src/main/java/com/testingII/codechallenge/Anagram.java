package com.testingII.codechallenge;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Anagram {

    public boolean isAnagram(String string1, String string2) {
        if(string1.length() != string2.length()) {
            return false;
        }
        char[] string1chars = string1.toCharArray();
        char[] string2chars = string2.toCharArray();
        Arrays.sort(string1chars);
        Arrays.sort(string2chars);
        if(Arrays.equals(string1chars, string2chars)) {
            return true;
        }
        return false;
    }
}
