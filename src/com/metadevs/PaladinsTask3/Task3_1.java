package com.metadevs.PaladinsTask3;

public class Task3_1 {
    public static void main(String[] args) {
        int months = (int) (1 + Math.random() * 12);
        System.out.println(months);
        switch (months) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Лето");
                break;
            case 10:
                System.out.println("Лето");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Вы ошиблись!");
        }
    }
}