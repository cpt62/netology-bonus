package ru.netology.service;

public class CustomService {

    //Вынес ставку пошлины в отдельную статическую переменную
    private static int DUTY;

    public static int calcDuty(int price, int weight) {
        return price / 100 + weight * 100;
    }

    public static void setDUTY(int DUTY) {
        CustomService.DUTY = DUTY;
    }

    public static int getDUTY() {
        return DUTY;
    }
}
