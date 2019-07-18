package com.stackroute.Pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.HashMap;

import static org.junit.Assert.*;

public class FrequencyCountTest {

    FrequencyCount frequencyCount;

    @Before
    public void setUp() {
        frequencyCount = new FrequencyCount();
    }

    @After
    public void tearDown() {
        frequencyCount = null;
    }

    /*Test cases for sucess*/

    @Test
    public void sucessShouldReturnwordCount() {
        HashMap<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("i", 3);
        expectedWordCount.put("am", 1);
        expectedWordCount.put("like", 1);
        expectedWordCount.put("have", 1);
        expectedWordCount.put("a", 2);

        //Asserts
        assertEquals("sucessShouldReturnwordCount: check calculateWordFrequency()",
                expectedWordCount, frequencyCount.calculateWordFrequency("Sample_files/FileDemo.txt"));
    }
    /*Test cases for Failure*/

    @Test
    public void failureReturnNull() {
        //Asserts
        assertNull("failureReturnNull: check calculateWordFrequency(). Should return null.",
                frequencyCount.calculateWordFrequency("File.txt"));
    }
}