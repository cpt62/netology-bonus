package ru.netology.service;

public class CustomService {

    //Вынес ставку пошлины в отдельную статическую переменную
    private static final int DUTY = 100;

    public static int calcDuty(int price, int weight) {
        return price / 100 + weight * DUTY;
    }
}
