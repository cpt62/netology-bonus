package ru.netology.homeworks.basic.task7;

import java.util.Random;

public class Matrix {

    public static final int SIZE = 8;

    private final int[][] COLORS = new int[SIZE][SIZE];

    public Matrix() {
        matrixInit();
        System.out.println("        Исходная матрица");
        showMatrix(this.COLORS);
    }

    private void matrixInit() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                COLORS[i][j] = random.nextInt(256);
            }
        }
    }

    public void showMatrix(int[][] matrix) {
        System.out.println("---------------------------------");
        for (int[] ints : matrix) {
            for (int i : ints) {
                System.out.format("%4d", i);
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] turn90ClockWise() {
        int[][] turnedMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int k = SIZE - 1, j = 0; k >= 0; k--, j++) {
                turnedMatrix[i][j] = COLORS[k][i];
            }
        }

        return turnedMatrix;
    }

    public int[][] turn180ClockWise() {
        int[][] turnedMatrix = new int[SIZE][SIZE];
        for (int i = SIZE - 1, m = 0; i >= 0; i--, m++) {
            for (int j = SIZE - 1, k = 0; j >= 0; j--, k++) {
                turnedMatrix[m][k] = COLORS[i][j];
            }
        }
        return turnedMatrix;
    }

    public int[][] turn270ClockWise() {
        int[][] turnedMatrix = new int[SIZE][SIZE];
        for (int i = SIZE - 1; i >= 0; i--) {
            for (int j = 0, k = SIZE - 1; j <= SIZE - 1; j++, k--) {
                turnedMatrix[j][i] = COLORS[i][k];
            }
        }
        return turnedMatrix;
    }

}
