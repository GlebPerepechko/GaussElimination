package org.example;

import org.example.model.Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = MatrixOperations.readMatrixFromFile("matrix.txt");
        MatrixOperations.printMatrix(matrix);
    }
}