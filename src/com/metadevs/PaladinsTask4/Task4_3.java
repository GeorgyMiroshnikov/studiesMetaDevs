package com.metadevs.PaladinsTask4;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {

        arrayRevers();
    }

    static void arrayRevers() {

        Scanner Input = new Scanner(System.in);

        System.out.println("Укажи размер массива: ");
        int arraySize = Input.nextInt();
        String[] setOfString = new String[arraySize];

        System.out.println("Положи слова в массив: ");
        for (int iteration = 0; iteration < arraySize; iteration++) {
            setOfString[iteration] = Input.nextLine();
        }
        for (int iterationRevers = arraySize - 1; iterationRevers >= 0; iterationRevers--) {
            System.out.println(setOfString[iterationRevers]);
        }
    }
}