package com.metadevs.PaladinsTask4;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Введи певрое число: ");
        int UserInput1 = Scan.nextInt();
        System.out.print("А теперь второе число: ");
        int UserInput2 = Scan.nextInt();
        System.out.println("А вот все четные числа из диапазона введённых тобою числел: ");
        RangCalculator(UserInput1, UserInput2);
    }

    static void RangCalculator(int x, int y) {
        for (int iteration = x; iteration <= y; iteration++) {
            if (iteration % 2 == 0) {
                System.out.println(iteration);
            }
        }
    }
}