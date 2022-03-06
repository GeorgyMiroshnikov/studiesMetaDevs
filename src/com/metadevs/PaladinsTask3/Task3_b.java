package com.metadevs.PaladinsTask3;

import java.util.Scanner;

public class Task3_b {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введи число: ");
        double a = userInput.nextInt();
        a = (a == 0 || a == 2) ? a + 7 : a / 10;
        System.out.println(a);

        System.out.print("Введи число: ");
        a = userInput.nextInt();
        String answer = (a > 0 && a < 5) ? "Верно" : "Не верно";
        System.out.println(answer);
    }
}