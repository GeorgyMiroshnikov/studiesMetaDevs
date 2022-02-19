package com.metadevs.PaladinsTasks2;

import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {

        Scanner ans = new Scanner(System.in);
        System.out.print("Что говорит кошка Жука?: ");
        String intAnswer = ans.nextLine();

        if (intAnswer.equalsIgnoreCase("мяу")) {
            System.out.println("Верно!");
        } else {
            System.out.println("Не верно ! Жука бы такого не сказала..");
        }
    }
}