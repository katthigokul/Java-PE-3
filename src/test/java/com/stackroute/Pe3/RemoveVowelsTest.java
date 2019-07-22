package com.stackroute.Pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    private static final List<String> VALID = Arrays.asList("India", "United States", "Germany","Egypt","czechoslovakia");
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
        assertEquals(Arrays.asList("Ind", "Untd Stts", "Grmny","Egypt","czchslvk"), removeLowerCaseVowels.removeLowerCaseVowels(VALID));
    }

}