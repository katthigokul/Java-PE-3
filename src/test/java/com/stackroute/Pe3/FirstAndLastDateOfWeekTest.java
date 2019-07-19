package com.stackroute.Pe3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDateOfWeekTest {

    @Before
    public void setUp() {
        firstAndLastDateOfWeek = new FirstAndLastDateOfWeek();
    }

    @Test
    public void testForFirstDayOfWeek() {
        assertEquals("15 / 1 / 2019", firstAndLastDateOfWeek.getFirstDayOfWeek(3, 1, 2019));
    }

    @Test
    public void testForLastDayOfWeek() {
        assertEquals("21 / 1 / 2019", firstAndLastDateOfWeek.getLastDayOfWeek(3, 1, 2019));
    }

}