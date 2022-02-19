package com.metadevs.PaladinsTasks1;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свою фамилию: ");
        String SecondName = userInputCheck(scanner);
        System.out.print("Введите своё имя: ");
        String name = userInputCheck(scanner);
        System.out.print("Введите свой возраст: ");
        int age = userInputCheckAge(scanner);

        System.out.println("Спасибо!" + "\n" + "Фамилия: " + SecondName + "\n" + "Имя: " + name + "\n" + "Возраст: " + age);
    }

    public static String userInputCheck(Scanner scanner) {
        while (scanner.hasNextInt()) {
            System.out.println("Введи буквы!");
            scanner.nextLine();
        }
        return scanner.nextLine();
    }

    public static int userInputCheckAge(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Введи число!");
            scanner.next();
        }
        return scanner.nextInt();
    }
}