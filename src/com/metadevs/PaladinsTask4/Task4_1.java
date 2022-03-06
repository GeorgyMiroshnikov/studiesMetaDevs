package com.metadevs.PaladinsTask4;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        System.out.print("Введите число: ");
        int imputFactorial = scanNum.nextInt();
        System.out.println("Факториал вашего числа: " + factorial(imputFactorial));
    }

    public static int factorial(int x) {
        int y = 1;
        for (int i = 0; i < x; i++) {

            y = y + y * i;
        }
        return y;
    }
}