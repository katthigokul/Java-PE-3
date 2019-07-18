package com.stackroute.Pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    ChessBoard cb;

    @Before
    public void setUp() throws Exception {
        cb = new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};

        String [][] actual = cb.display(8,8);

        assertNotEquals("Following is chessPattern output",expected,actual);
    }

}