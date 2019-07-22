package com.stackroute.Pe3;

public class AdditionOfMatrices {
    /**
     * Adds two matrices
     * @param firstMatrix First summand matrix
     * @param secondMatrix Second summand matrix
     * @param numberOfRows number of rows in the matrtix
     * @param numberOfColoumns number of coloumns in the matrix
     * @return Sum of two matrices
     */
    int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix, int numberOfRows, int numberOfColoumns) {
        if (firstMatrix == null || secondMatrix == null || numberOfColoumns == 0 || numberOfRows == 0) {
            return null;
        }
        int[][] result = new int[numberOfRows][numberOfColoumns];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColoumns; j++) {
                result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return result;
    }
}
