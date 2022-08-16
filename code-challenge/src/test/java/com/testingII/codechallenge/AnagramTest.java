package com.testingII.codechallenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AnagramTest {
    @Autowired
    public Anagram anagram;
    private String string1 = "cat";
    private String string2 = "tac";
    private String string3 = "tad";
    private String string4 = "tac";
    private String string5 = "tac";
    private String string6 = "taac";

    @Test
    public void twoStringsShouldBeAnagrams() {
        boolean result = this.anagram.isAnagram(string1, string2);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void twoStringsShouldNotBeAnagrams() {
        boolean result = this.anagram.isAnagram(string3, string4);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void twoStringsDifferentLengthShouldNotBeAnagrams() {
        boolean result = this.anagram.isAnagram(string5, string6);
        Assertions.assertEquals(false, result);
    }
}
