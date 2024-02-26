package org.example.model;

public class Matrix {
    private double[][] matrix;
    private int rows;
    private int cols;

    public Matrix(){
        this.rows=0;
        this.cols=0;
        this.matrix = null;
    }

    public Matrix(int rows, int cols){
        this.rows=rows;
        this.cols=cols;
        this.matrix = new double[rows][cols];
    }

    // Установить значение в клетке
    public void setElement(int row, int col, double value) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IllegalArgumentException("Некорректные индексы строки или столбца");
        }
        matrix[row][col] = value;
    }

    // Получить значение из клетки
    public double getElement(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IllegalArgumentException("Некорректные индексы строки или столбца");
        }
        return matrix[row][col];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
