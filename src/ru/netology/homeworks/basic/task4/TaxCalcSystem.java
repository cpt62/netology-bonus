package ru.netology.homeworks.basic.task4;

import java.util.Scanner;

public class TaxCalcSystem {

    static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }

    static int taxEarnings(int earnings) {
        return earnings * 6 / 100;
    }

    public static void main(String[] args) {

        int earnings = 0;    // доходы
        int spendings = 0;   // расходы

        //Создаем scanner - объект, который будет считывать из стандартного потока ввода/вывода (console)
        Scanner scanner = new Scanner(System.in);

        //Цикл будет работать, пока пользователь не введет `end`
        while (true) {
            // Выводим информацию о возможных операциях пользователю
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогооблажения");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            try {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1: {
                        System.out.println("Введите сумму дохода:");
                        String moneyStr = scanner.nextLine(); // Не используйте тут nextInt (!)
                        int money = Integer.parseInt(moneyStr);
                        earnings += money;
                        break;
                    }
                    case 2:
                        // действия при выборе второй операции
                    {
                        System.out.println("Введите сумму расхода:");
                        String moneyStr = scanner.nextLine(); // Не используйте тут nextInt (!)
                        int money = Integer.parseInt(moneyStr);
                        spendings += money;
                        break;
                    }
                    case 3:
                        // действия при выборе третьей операции
                    {
                        int taxEarning = taxEarnings(earnings);
                        int taxEarnMinSpen = taxEarningsMinusSpendings(earnings, spendings);
                        // Здесь какой-то код получается избыточный, но в голову ничего умнее не пришло
                        if (taxEarning < taxEarnMinSpen) {
                            System.out.println("Мы советуем вам УСН доходы");
                            System.out.printf("Ваш налог составит: %d рублей\n", taxEarning);
                            System.out.printf("Налог на другой системе: %d рублей\n", taxEarnMinSpen);
                            System.out.printf("Экономия: %d рублей\n", taxEarnMinSpen - taxEarning);
                        } else if (taxEarnMinSpen < taxEarning) {
                            System.out.println("Мы советуем вам УСН доходы - минус расходы");
                            System.out.printf("Ваш налог составит: %d рублей\n", taxEarning);
                            System.out.printf("Налог на другой системе: %d рублей\n", taxEarnMinSpen);
                            System.out.printf("Экономия: %d рублей\n", taxEarning - taxEarnMinSpen);
                        } else {
                            System.out.println("Можете выбрать любую систему налогообложения");
                        }
                        break;
                    }
                    default:
                        System.out.println("Такой операции нет");
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Введите корректное значение, согласно условию!");
            }
        }
        System.out.println("Программа завершена!");
    }
}
