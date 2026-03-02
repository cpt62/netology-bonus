package ru.netology.homeworks.basic.task3.optional;

import ru.netology.homeworks.basic.task3.necessarily.Main;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Game {

    static Set<Integer> set = new HashSet<>();

    static int score;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, days;
        while (true) {
            while (true) {
                System.out.println("Введите год: ");
                try {
                    year = sc.nextInt();
                    if (!set.contains(year)) {
                        set.add(year);
                    } else {
                        System.err.println("Неплохая попытка, но " + year + " год был введен ранее...");
                        continue;
                    }
                    break;
                } catch (InputMismatchException ime) {
                    System.err.println("Введено некорректное значение в формате “yyyy”!");
                    sc.next();
                }
            }
            while (true) {
                System.out.println("Введите количество дней: ");
                try {
                    days = sc.nextInt();
                    break;
                } catch (InputMismatchException inputMismatchException) {
                    System.err.println("Введено некорректное значение количества дней!");
                    sc.next();
                }
            }
            int validValue = Main.yearCheck(year);
            if (days == validValue) {
                score++;
            } else {
                System.out.println("---------------------------");
                System.out.println("Неправильно! В этом году " + validValue + " дней!");
                System.out.println("Набрано очков: " + score);
                break;
            }
        }
        sc.close();
    }
}
