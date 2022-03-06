package com.metadevs.PaladinsTask3;

import java.util.Scanner;

public class Task3_a {
    public static void main(String[] args) {
        Scanner valueImput = new Scanner(System.in);
        System.out.print("Введи число: ");
        int number = valueImput.nextInt();
        System.out.print("Введи еще одно число: ");
        int i = valueImput.nextInt();
        if (number > i || number == i)
            System.out.println("Первое число больше,или равно второму.Цикл не запустится");
        for (int iteration = number; iteration < i; iteration++) {
            if (number < i) {
                System.out.println("Цикл");
            }
        }
    }
}