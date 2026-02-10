package ru.netology.homeworks.basic.task1.optional;

public class Main {
    public static void main(String[] args) {
        int income = 44_000;
        int spending = 30_000;

        System.out.println("Итого (руб):");
        System.out.println(resultSum(income, spending));
    }

    static int resultSum(int a, int b) {
        return a - b;
    }
}