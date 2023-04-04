package vsuet.mtrx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n = console.nextInt();

        Matrix matrix = new Matrix(n);

        System.out.println(matrix);

        System.out.println("Product of diagonal elements: " + matrix.getProductOfDiagonalElements());

        System.out.println("Sum of elements above diagonal: " + matrix.getSumOfElementsAboveDiagonal());

        System.out.println("Difference of elements below diagonal: " + matrix.getDifferenceOfElementsBelowDiagonal());
    }
}
