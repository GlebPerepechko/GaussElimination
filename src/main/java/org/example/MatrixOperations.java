package org.example;

import org.example.model.Matrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatrixOperations {

    // Чтение матрицы с файла
    public static Matrix readMatrixFromFile(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));

            int rows = scanner.nextInt();
            int cols = scanner.nextInt();

            Matrix matrix = new Matrix(rows,cols);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix.setElement(i, j, scanner.nextDouble());
                }
            }
            scanner.close();
            return matrix;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            return null;
        }
    }

    // Вывод матрицы
    public static void printMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getCols(); j++) {
                System.out.print(matrix.getElement(i,j) + " ");
            }
            System.out.println();
        }
    }

}
