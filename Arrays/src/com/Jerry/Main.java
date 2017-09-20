package com.Jerry;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = getIntegers(5);
        int[] sorted = sortIntegers(myIntArray);
        printArray(sorted);
    }

    public static int[] getIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Please enter " + number + " numbers");

        for(int i=0;i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for(int i=0; i< array.length; i++) {
            System.out.println("The element at  " + i + " is " + array[i]);
        }
     }

     public static int[] sortIntegers(int[] arr) {
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        boolean notSorted = true;
        while(notSorted) {
            notSorted = false;
            for(int j=0; j<arr.length-1; j++) {
                int temp;
                if(sortedArray[j] < sortedArray[j+1]) {
                    temp = sortedArray[j+1];
                    sortedArray[j+1] = sortedArray[j];
                    sortedArray[j] = temp;
                    notSorted = true;
                }
            }
        }
        return sortedArray;
     }
}
