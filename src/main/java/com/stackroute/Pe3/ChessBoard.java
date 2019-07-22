package com.stackroute.Pe3;

/*
* Write a program to create a ChessBoard pattern with the help of multidimensional array,
* where WWrepresents white color and BB represents Black color.
*      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|

* */

public class ChessBoard {
    public String[][] display(int rows, int cols) {
        {
            String output[][] = new String[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (((i + j) % 2) == 0) {
                        output[i][j] = "WW";
                    } else {
                        output[i][j] = "BB";
                    }

                }


            }

            return output;
        }
    }
}
