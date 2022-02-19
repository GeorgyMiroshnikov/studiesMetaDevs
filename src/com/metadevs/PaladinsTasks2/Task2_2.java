package com.metadevs.PaladinsTasks2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        task_2a(a, b);
        task_2b(a, b);
        task_2c(a, b);
        task_2d(a, b);
        task_2e(a, b);
        task_2f(a, b);
        task_2g(a, b);
        task_2h(a, b);
    }

    static void task_2a(int a, int b) {
        a = 10;
        b = 5;
        boolean statement = a > b;
        System.out.println(statement);
    }

    static void task_2b(int a, int b) {
        a = 50;
        b = 25;
        boolean statement = a > b;
        System.out.println(statement);
    }

    static void task_2c(int a, int b) {
        a = 67;
        b = 23;
        boolean statement = a < b;
        System.out.println(statement);
    }

    static void task_2d(int a, int b) {
        a = 90;
        b = 80;
        boolean statement = a == b;
        System.out.println(statement);
    }

    static void task_2e(int a, int b) {
        Scanner numInput = new Scanner(System.in);
        System.out.print("Введи любое число: ");
        a = numInput.nextInt();
        b = 60;
        boolean statement = a == b;
        System.out.println(statement);
    }

    static void task_2f(int a, int b) {
        Scanner numInput = new Scanner(System.in);
        a = 100;
        System.out.print("Введи любое число: ");
        b = numInput.nextInt();
        boolean statement = a < b;
        System.out.println(statement);
    }

    static void task_2g(int a, int b) {
        Scanner numInput = new Scanner(System.in);
        b = 60;
        System.out.print("Введи любое число: ");
        a = numInput.nextInt() + b / 2;

        if (a != b) {
            a = b;
        }

        boolean statement = a == b;
        System.out.println(statement);
    }

    static void task_2h(int a, int b) {
        Scanner numInput = new Scanner(System.in);
        System.out.print("Введи любое число: ");
        a = numInput.nextInt() + b / 2;
        b = 60;
        if (a != b) {
            a = b;
        }
        boolean statement = a == b;

        System.out.println(statement);
    }
}