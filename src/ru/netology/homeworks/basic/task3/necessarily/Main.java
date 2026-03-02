package ru.netology.homeworks.basic.task3.necessarily;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int yearCheck(int year) {
        /*Пробовал тернарным оператором, но на мой взгляд код получается трудным для восприятия
         * Я бы его применял при самом простом if + else, где нет в условиях операторов &&, ||*/
        if (year % 400 == 0) {
            return 366;
        } else if (year % 100 != 0 && year % 4 == 0) {
            return 366;
        }
        return 365;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("Введите год в формате “yyyy”: ");

        while (true) {
            try {
                year = sc.nextInt();
                sc.close();
                break;
            } catch (InputMismatchException ime) {
                System.err.print("Введите корректное значение в формате “yyyy”: ");
                sc.next();
            }
        }

        System.out.println("Количество дней: " + yearCheck(year));
    }
}
