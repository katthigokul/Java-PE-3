package com.stackroute.Pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class ChessBoardTest {

    ChessBoard cb;

    @Before
    public void setUp() throws Exception {
        cb = new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        cb = null;
    }

    @Test
    public void  givenROwsAndColumnsShouldReturnChessBoardPattern() {
        String expected[][] = {{"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}};

        String[][] actual = cb.display(8, 8);

        assertNotEquals("Following is chessPattern output", expected, actual);

    }
    @Test
    public void givenROwsAndColumnsShouldReturnChessBoardPatternFailure() {
        //act
        String[][] expectedResult = {
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "WW", "WW"}
        };
        //assert
        assertNotEquals(expectedResult, cb.display(8, 8));
    }

    @Test
    public void givenZeroRowsAndColumnsShouldReturnEmptyArray() {
        //act
        String[] expectedResult = {};
        //assert
        assertArrayEquals(expectedResult, cb.display(0, 0));
    }

    @Test(expected = NegativeArraySizeException.class)
    public void givenInvalidSizeShouldThrowException() {
        cb.display(-8, 8);
        cb.display(8, -8);
    }
}