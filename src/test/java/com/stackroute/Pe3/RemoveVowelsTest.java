package com.stackroute.Pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    private static final List<String> VALID = Arrays.asList("Selena", "Katherine", "Utopia");

    @Test
    public void testForRemovingLowerCaseVowels() {
        RemoveVowels removeLowerCaseVowels = new RemoveVowels();
        assertEquals(Arrays.asList("Sln", "Kthrn", "Utp"), removeLowerCaseVowels.removeLowerCaseVowels(VALID));
    }
}