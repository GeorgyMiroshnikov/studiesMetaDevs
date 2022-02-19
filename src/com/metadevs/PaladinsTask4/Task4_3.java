package com.metadevs.PaladinsTask4;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        arrayRevers();
    }

    static void arrayRevers() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Укажи размер массива: ");
        int arraySize = UserInputCheck(Input);
        String[] setOfString = new String[arraySize+1];
        System.out.println("Положи слова в массив: ");

        for (int i = 0; i < (setOfString.length); i++) {
            setOfString[i] = Input.nextLine();
        }
        for (int i = (setOfString.length-1); i >= 0; i--) {
            System.out.println(setOfString[i]);
        }
    }

    public static int UserInputCheck(Scanner Input) {
        while (!Input.hasNextInt()) {
            System.out.println("Введите число!");
            Input.next();
        }
        return Input.nextInt();
    }
}