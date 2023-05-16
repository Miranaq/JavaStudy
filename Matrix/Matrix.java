package vsuet.mtrx;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private final int[][] matrix;

    public Matrix(int n) {
        matrix = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(9) + 1;
            }
        }
    }

    public int getProductOfDiagonalElements() {
        int product = 1;
        for (int i = 0; i < matrix.length; i++) {
            product *= matrix[i][i];
        }
        return product;
    }

    public int getSumOfElementsAboveDiagonal() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public int getDifferenceOfElementsBelowDiagonal() {
        int diff = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                diff -= matrix[i][j];
            }
        }
        return diff;
    }

    @Override
    public String toString() {
        String str = Arrays.deepToString(matrix)
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]");
        return "---Matrix---\n" + str;
    }
}
