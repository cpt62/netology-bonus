package ru.netology.homeworks.basic.task2;

import ru.netology.service.CustomService;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Приветствую Вас, уважаемый преподаватель! Давайте подсчитаем стоимость пошлины?");
        System.out.print("Введите \"да\" или \"нет\" : ");
        while (true) {
            switch (sc.nextLine().toLowerCase()) {
                case ("нет"):
                    System.out.println("Хорошо. Возвращайтесь в другой раз!");
                    return;
                case ("да"):
                    int price, weight;
                    System.out.print("Введите стоимость товара в рублях: ");
                    while (true) {
                        if (sc.hasNextInt()) {
                            price = sc.nextInt();
                            System.out.print("Отлично! Теперь введите вес товара в килограммах: ");
                            while (true) {
                                if (sc.hasNextInt()) {
                                    weight = sc.nextInt();
                                    System.out.println("Начинаем подсчет пошлины...");
                                    break;
                                } else {
                                    System.out.print("Вы ввели не корректное значение, попробуйте ещё раз: ");
                                    sc.next();
                                }
                            }
                        } else {
                            System.out.print("Вы ввели не корректное значение, попробуйте ещё раз: ");
                            sc.next();
                            continue;
                        }
                        break;
                    }
                    CustomService.setDUTY(CustomService.calcDuty(price, weight));
                    System.out.printf("Сумма пошлина составляет %d рублей", CustomService.getDUTY());
                    break;
                default:
                    System.out.print("Вы ввели неверное значение, попробуйте снова: ");
                    continue;
            }
            break;
        }
    }
}

