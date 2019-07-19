package com.stackroute.Pe3;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ConsecutiveSeriesTest {
    private static final List<Long> CONSECUTIVE_SERIES = Arrays.asList(2020L, 2019L, 2021L, 2022L);
    private static final List<Long> REPEATED_SERIES = Arrays.asList(2020L, 2019L, 2021L, 2021L);
    private static final List<Long> NON_CONSECUTIVE_SERIES = Arrays.asList(2019L, 2020L, 2021L, 2023L);
    private ConsecutiveNumbers consecutiveNumbers;

    @Before
    public void setUp() {
        consecutiveNumbers = new ConsecutiveNumbers();
    }

    @Test
    public void testForConsecutiveSeriesSuccess() {
        assertTrue(consecutiveNumbers.isNumbersConsecutive(CONSECUTIVE_SERIES));
    }

    @Test
    public void testForNonConsecutiveSeries() {
        assertFalse(consecutiveNumbers.isNumbersConsecutive(NON_CONSECUTIVE_SERIES));
    }
    @Test
    public void testForSeriesWithRepeatedNumbers() {
        assertFalse(consecutiveNumbers.isNumbersConsecutive(REPEATED_SERIES));
    }

    @Test
    public void testForConsecutiveSeriesForInvalidInput() {
        assertFalse(consecutiveNumbers.isNumbersConsecutive(null));
    }

}