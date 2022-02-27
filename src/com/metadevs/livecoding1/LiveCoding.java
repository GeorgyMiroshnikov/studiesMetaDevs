package com.metadevs.livecoding1;

import java.util.Scanner;

public class LiveCoding {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Введи первое число: ");
        int value1 = userInputCheck(userInput);
        System.out.print("Введи второе число: ");
        int value2 = userInputCheck(userInput);

        dataProcessingSwitch(value1, value2);
        dataProcessingIfEls(value1, value2);
    }

    public static int userInputCheck(Scanner userInput) {
        while (!userInput.hasNextInt()) {
            System.out.println("Введите число!");
            userInput.next();
        }
        return userInput.nextInt();
    }

    static void dataProcessingIfEls(int x, int y) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Выбери действие которое хочешь сделать: " + "\n" + "1: Сложение" + "\n" + "2: Умножение" + "\n" + "3: Вычитание");
        int choiceOfOption = userInputCheck(userInput);
        int result;

        if (choiceOfOption == 1) {
            result = x + y;
            System.out.println("Ответ: " + result);
        } else if (choiceOfOption == 2) {
            result = x * y;
            System.out.println("Ответ: " + result);
        } else if (choiceOfOption == 3) {
            result = x - y;
            System.out.println("Ответ: " + result);
        } else {
            System.out.println("Такое действие не предусмотено");
        }
    }

    static void dataProcessingSwitch(int x, int y) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Выбери действие которое хочешь сделать: " + "\n" + "1: Сложение" + "\n" + "2: Умножение" + "\n" + "3: Вычитание");

        int choiceOfOption = userInputCheck(userInput);
        switch (choiceOfOption) {
            case 1:
                System.out.println("Ответ: " + (x + y));
                break;
            case 2:
                System.out.println("Ответ: " + (x * y));
                break;
            case 3:
                System.out.println("Ответ: " + (x - y));
                break;
            default:
                System.out.println("Такой вариант не обозначен");
                break;
        }
    }
}