package com.metadevs.PaladinsTasks2;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value = input.nextInt();

        if (value > 10) {
            System.out.println("Число больше десяти!");
        }
        if (value < 10) {
            System.out.println("Число меньше десяти!");
        } else {
            System.out.println("Число равно десяти!");
        }
    }
}