package com.stackroute.Pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    private static final List<String> VALID = Arrays.asList("Selena", "Katherine", "Utopia");
    RemoveVowels removeVowels;
    @Before
    public void setUp() {
        removeVowels = new RemoveVowels();
    }

    @After
    public void tearDown() {
        removeVowels = null;
    }



    @Test
    public void testForRemovingLowerCaseVowels() {
        RemoveVowels removeLowerCaseVowels = new RemoveVowels();
        assertEquals(Arrays.asList("Sln", "Kthrn", "Utp"), removeLowerCaseVowels.removeLowerCaseVowels(VALID));
    }
}