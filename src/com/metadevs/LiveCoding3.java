package com.metadevs;

import java.util.Scanner;

public class LiveCoding3 {
    public static void main(String[] args) {

        int k = (int) (1 + Math.random() * 99);
        int x = k % 10;

        switch (x) {
            case 1:
                switch (k) {
                    case 11:
                        System.out.println("мне " + k + " лет");
                        break;
                    default:
                        System.out.println("мне " + k + " год");
                        break;
                }
                break;

            case 2:
                switch (k) {
                    case 12:
                        System.out.println("мне " + k + " лет");
                        break;
                    default:
                        System.out.println("мне " + k + " год");
                        break;
                }
                break;

            case 3:
                switch (k) {
                    case 13:
                        System.out.println("мне " + k + " лет");
                        break;
                    default:
                        System.out.println("мне " + k + " год");
                        break;
                }
                break;

            case 4:
                switch (k) {
                    case 14:
                        System.out.println("мне " + k + " лет");
                        break;
                    default:
                        System.out.println("мне " + k + " год");
                        break;
                }
                break;
            default:
                System.out.println("мне " + k + " лет");
                break;
        }
    }
}