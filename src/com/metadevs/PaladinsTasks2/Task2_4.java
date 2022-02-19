package com.metadevs.PaladinsTasks2;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value1 = numbers.nextInt();
        System.out.print("И ещё одно: ");
        int value2 = numbers.nextInt();
        boolean statement1 = value1 > value2;
        boolean statement2 = value1 < value2;

        if (statement1) {
            System.out.println("Первое введённое число больше второго");
        }
        if (statement2) {
            System.out.println("Первое введённое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }
    }
}