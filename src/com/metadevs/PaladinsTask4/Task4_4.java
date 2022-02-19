package com.metadevs.PaladinsTask4;

public class Task4_4 {
    public static void main(String[] args) {
        int[][] array = {{7, 3, 3, 1}, {8, 8, 4, 1}};
        int [][] reversArray=new int[2][4];

        for (int row = 0; row < array.length; row++) {
            System.out.println();
            for (int col = 0; col < array[row].length; col++) {
                int rowIndex = array.length - 1 - row;
                int colIndex = array[row].length - 1 - col;
                reversArray[row][col] = array[rowIndex][colIndex];
                System.out.print(reversArray[row][col] + " ");
            }
        }
    }
}