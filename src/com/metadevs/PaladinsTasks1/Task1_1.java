package com.metadevs.PaladinsTasks1;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число : ");
        int value1 = userInputCheck(scan);
        System.out.print("Введите ещё одно число! : ");
        int value2 = userInputCheck(scan);
        int addition = value1 + value2;
        int subtraction = value1 - value2;
        int multiplication = value1 * value2;
        int division = value1 / value2;
        System.out.println(
                "Смотри во что превратились твои числа!" + "\n" +
                        "Сумма: " + addition + "\n" +
                        "Разность: " + subtraction + "\n" +
                        "Произведение: " + multiplication + "\n" +
                        "Частное: " + division);
    }

    public static int userInputCheck(Scanner scan){

        while (!scan.hasNextInt()){
            System.out.println("Введи число!");
            scan.next();
        }
        return scan.nextInt();
    }
}