package ru.netology.homeworks.basic.task6;


import java.util.Scanner;

public class Main {
    private static final String[] PRODUCTS = {"Хлеб", "Яблоки", "Молоко"};
    private static final int[] PRICE = {100, 200, 300};

    public static void main(String[] args) {
        int totalPrice = 0;
        int[] counterProducts = new int[PRODUCTS.length];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите идентификатор, и количество товара");
            String input = scanner.nextLine();
            if (input.equals("end")) break;
            String[] pair = input.split(" ");
            counterProducts[Integer.parseInt(pair[0])-1] += Integer.parseInt(pair[1]);
        }

        System.out.println("Ваша корзина:");
        for (int i = 0; i < PRODUCTS.length; i++) {
            System.out.printf("%s %d шт %d руб/шт %d руб в сумме"
                    , PRODUCTS[i]
                    , counterProducts[i]
                    , PRICE[i]
                    , counterProducts[i] * PRICE[i]);
            totalPrice += counterProducts[i] * PRICE[i];
        }
        System.out.printf("Итого %d руб", totalPrice);
    }
}
