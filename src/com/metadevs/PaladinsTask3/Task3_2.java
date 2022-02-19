package com.metadevs.PaladinsTask3;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Напишите название любого месяца: ");
        String month = userInput.nextLine();
        month = month.toLowerCase();

        switch (month) {
            case "январь":
                System.out.println("Это зима");
                break;
            case "февраль":
                System.out.println("Это зима");
                break;
            case "март":
                System.out.println("Это весна");
                break;
            case "апрель":
                System.out.println("Это весна");
                break;
            case "май":
                System.out.println("Это весна");
                break;
            case "июнь":
                System.out.println("Это весна");
                break;
            case "июль":
                System.out.println("Это лето");
                break;
            case "август":
                System.out.println(" Это лето");
                break;
            case "сентябрь":
                System.out.println("Это осень");
                break;
            case "октябрь":
                System.out.println("Это осень");
                break;

            case "ноябрь":
                System.out.println("Это осень");
                break;
            case "декабрь":
                System.out.println("Это зима");
                break;
            default:
                System.out.println("Вы ошиблись!");
        }
    }
}