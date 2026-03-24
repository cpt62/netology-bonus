package ru.netology.homeworks.basic.task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int[][] resultMatrix;

        System.out.println("Выберите действие с матрицей:");
        System.out.println("1 - транспонирование исходной матрицы на 90° по часовой стрелке");
        System.out.println("2 - транспонирование исходной матрицы на 180° по часовой стрелке");
        System.out.println("3 - транспонирование исходной матрицы на 270° по часовой стрелке");
        System.out.println("end - завершить работу программы");
        System.out.println();

        Scanner s = new Scanner(System.in);

        while (true) {
            String input = s.nextLine().toLowerCase();
            if (input.equals("end")) return;
            try {
                switch (Integer.parseInt(input)) {
                    case 1 -> {
                        System.out.println("Транспонируем исходную матрицу на 90° по часовой");
                        resultMatrix = matrix.turn90ClockWise();
                        matrix.showMatrix(resultMatrix);
                    }
                    case 2 -> {
                        System.out.println("Транспонируем исходную матрицу на 180° по часовой стрелке");
                        resultMatrix = matrix.turn180ClockWise();
                        matrix.showMatrix(resultMatrix);
                    }
                    case 3 -> {
                        System.out.println("Транспонируем исходную матрицу на 270° по часовой");
                        resultMatrix = matrix.turn270ClockWise();
                        matrix.showMatrix(resultMatrix);
                    }
                    default -> {
                        System.out.println("Введите корректное значение действия!");
                        System.out.println();
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное значение действия!");
                System.out.println();
            }
        }
    }
}
