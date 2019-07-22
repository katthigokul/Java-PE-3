package com.stackroute.Pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class FirstAndLastDateOfWeekTest {

    FirstAndLastDateOfWeek md;

    @BeforeClass
    public static void setUpOnce() {
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce() {
        System.out.println("Inside teardown once");

    }

    @Before
    public void setUp() {
        System.out.println("Inside setup");
        md = new FirstAndLastDateOfWeek();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        md = null;
    }

    @Test
    public void startDate() {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = md.startDate();
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void endDate() {
        //Arrange
        boolean expectedValue1 = true;
        //Act
        boolean actualValue1 = md.endDate();
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
    }


}