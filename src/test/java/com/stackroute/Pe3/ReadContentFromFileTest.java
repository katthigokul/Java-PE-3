package com.stackroute.Pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class ReadContentFromFileTest {
    ReadContentFromFile readContentFromFile;
    @Before
    public void setUp() {
        readContentFromFile = new ReadContentFromFile();
    }

    @After
    public void tearDown() {
        readContentFromFile = null;
    }

    /* Test cases for Success*/
    @Test
    public void givenFileNameAndExtensionShouldReturnByteArray() {
        String testString = "Hello. This is a test string";
        byte[] testByteArray = testString.getBytes();
        //Asserts
        assertArrayEquals("successGivenFileNameAndExtensionShouldReturnByteArray: check readFile()",
                testByteArray, readContentFromFile.readFile("sample", "txt"));
    }

    /* Test cases for failures*/

    @Test(expected = FileNotFoundException.class)
    public void givenFileNameAndExtensionShouldReturnFileNotFoundException() {
        readContentFromFile.readFile("sample", "txt");
    }


}