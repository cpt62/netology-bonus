package ru.netology.homeworks.basic.task6;

import java.util.Arrays;
import java.util.Random;

public class Matrix {

    private static final int SIZE = 8;

    private final int[][] COLORS = new int[SIZE][SIZE];

    public Matrix() {
        matrixInit();
    }

    private void matrixInit() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                COLORS[i][j] = random.nextInt(256);
            }
        }
    }

    public void getMatrix() {
        System.out.println();
        System.out.println("-----Исходная матрица:------");
        for (int[] ints : COLORS) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
    }



}
