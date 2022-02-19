package com.metadevs.PaladinsTask4;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введи певрое число: ");
        int UserInput1 = scanInt(scan);
        System.out.print("А теперь второе число: ");
        int UserInput2 = scanInt(scan);
        System.out.println("А вот все четные числа из диапазона введённых тобою числел: ");
        RangCalculator(UserInput1, UserInput2);
    }

    public static int scanInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Введи число!");
            scan.next();
        }
        return scan.nextInt();
    }

    static void RangCalculator(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}