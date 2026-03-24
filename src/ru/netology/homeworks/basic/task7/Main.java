package ru.netology.homeworks.basic.task7;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int[][] resultMatrix;

        System.out.println("Транспонируем матрицу на 90° по часовой");
        resultMatrix = matrix.turn90ClockWise();
        matrix.showMatrix(resultMatrix);

        System.out.println("Транспонируем матрицу на 180° по часовой");
        resultMatrix = matrix.turn180ClockWise();
        matrix.showMatrix(resultMatrix);

        System.out.println("Транспонируем матрицу на 270° по часовой");
        resultMatrix = matrix.turn270ClockWise();
        matrix.showMatrix(resultMatrix);
    }
}
