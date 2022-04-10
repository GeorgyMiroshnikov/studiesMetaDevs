package com.metadevs.GameGuessNumber;

import java.util.Scanner;

public class GameGuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Я загадала число от 1 до 100. У вас есть 10 попыток,угадай его!");
        int randomNum = (int) (1 + Math.random() * 100);
        System.out.print("Введите свой вариант: ");
        int numberOfAttempts = 8;
        int userInput = userInputCheck(scan);
        for (int iteration = numberOfAttempts; iteration >= 0; iteration--) {
            if (userInput > randomNum) {
                System.out.print("Ваше число больше загаданного,попробуйте ещё раз: ");
                userInput = userInputCheck(scan);
                System.out.println("Колличество оставшихся попыток: " + iteration);
            }
            if (userInput < randomNum) {
                System.out.print("Ваше число меньше загаданного,попробуйте ещё раз: ");
                userInput = userInputCheck(scan);
                System.out.println("Колличество оставшихся попыток: " + iteration);
            }
            if (iteration == 0) {
                System.out.println("Ваши попытки закончились загаданным числом было " + randomNum);
                System.out.println("Что бы попробовать ещё раз, нужно запустить программау сначала");
            } else if (userInput == randomNum) {
                System.out.println("Ура! У вас получилось ! Загаданное число было: " + randomNum);
                break;
            }
        }
    }
    public static int userInputCheck(Scanner number){
        while (!number.hasNextInt()) {
            System.out.println("Введи число!");
            number.next();
        }
        return number.nextInt();
    }
}