package com.metadevs.PaladinsTasks2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        task_2a();
        task_2b();
        task_2c();
        task_2d();
        task_2e();
        task_2f();
        task_2g();
        task_2h();
    }

    static void task_2a() {
        int a = 10;
        int b = 5;
        boolean statement = a > b;
        System.out.println(statement);
    }

    static void task_2b() {
        int a = 50;
        int b = 25;
        boolean statement = a > b;
        System.out.println(statement);
    }

    static void task_2c() {
        int a = 67;
        int b = 23;
        boolean statement = a < b;
        System.out.println(statement);
    }

    static void task_2d() {
        int a = 90;
        int b = 80;
        boolean statement = (a == b);
        System.out.println(statement);
    }

    static void task_2e() {
        Scanner numInput = new Scanner(System.in);
        System.out.print("Введи любое число: ");
        int a = numInput.nextInt();
        int b = 60;
        boolean statement = (a == b);
        System.out.println(statement);
    }

    static void task_2f() {
        Scanner numInput = new Scanner(System.in);
        int a = 100;
        System.out.print("Введи любое число: ");
        int b = numInput.nextInt();
        if (b <= a) {
            b = 101;
        }
        boolean statement = a < b;
        System.out.println(statement);
    }

    static void task_2g() {
        Scanner numInput = new Scanner(System.in);
        int b = 60;
        System.out.print("Введи любое число: ");
        int a = numInput.nextInt() + b / 2;

        if (a != b) {
            a = b;
        }

        boolean statement = (a == b);
        System.out.println(statement);
    }

    static void task_2h() {
        Scanner numInput = new Scanner(System.in);
        System.out.print("Введи любое число: ");
        int b = 60;
        int a = numInput.nextInt() + b / 2;

        if (a != b) {
            a = b;
        }
        boolean statement = (a == b);

        System.out.println(statement);
    }
}