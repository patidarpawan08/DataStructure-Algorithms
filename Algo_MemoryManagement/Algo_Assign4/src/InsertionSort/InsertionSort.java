/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Pawan
 */
public class InsertionSort {

    public static void main(String a[]) {

        int[] arr2;
        long startTime = 0;

        InsertionSort mms = new InsertionSort();
        int[] inputArr;
        long stopTime = 0;
        long elapsedTime = 0;

        String s;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter case Value :  ");
            int caseType = in.nextInt();
            int[] inputArray;
            switch (caseType) {
//                case 1:
//
//                    inputArr = new int[]{45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
//
//                    System.out.println("Array before sorting : ");
//                    for (int i : inputArr) {
//                        System.out.print(i);
//                        System.out.print(" ");
//                    }
//                    System.out.println(" ");
//                    System.out.println("Array after sorting : ");
//                    startTime = System.currentTimeMillis();
//                    arr2 = mms.doInsertionSort(inputArr);
//                    stopTime = System.currentTimeMillis();
//                    elapsedTime = stopTime - startTime;
//                    System.out.println("Time taken to sort :" + elapsedTime);
//                    for (int i : arr2) {
//                        System.out.print(i);
//                        System.out.print(" ");
//                    }
//                    System.out.println(" ");
//                   
//                    break;
                case 1:

                    int input = 10000;
                    for (int i = 1; i <= 100; i++) {
                        inputArray = new int[input];
                        for (int j = 0; j < inputArray.length; j++) {
                            inputArray[j] = j;
                        }
                        long avgelapsedTime = 0;
                        for (int m = 0; m < 10; m++) {
                            Random rnd = ThreadLocalRandom.current();
                            for (int k = inputArray.length - 1; k > 0; k--) {
                                int index = rnd.nextInt(k + 1);
                               
                                int b = inputArray[index];
                                inputArray[index] = inputArray[k];
                                inputArray[k] = b;
                            }
//                            System.out.println("");
//                            System.out.println("Array before sorting : ");
//                            for (int n : inputArray) {
//                                System.out.print(n);
//                                System.out.print(" ");
//                            }
//                            System.out.println("");
                                startTime = System.currentTimeMillis();
                                mms.doInsertionSort(inputArray);
                                stopTime = System.currentTimeMillis();
                                elapsedTime = stopTime - startTime;
                                avgelapsedTime = avgelapsedTime + elapsedTime;
                               
//                                 System.out.println("Array after sorting : ");
//                                 
//                             for (int n : inputArray) {
//                                System.out.print(n);
//                                System.out.print(" ");
//                            }
                            }
                            float average = avgelapsedTime / 10;
                             //System.out.println("");
                            System.out.println("Average time :" + average);
                            System.out.println("Input array size :" + input);
                            //System.out.print(" ");
                            input = input + 10000;

                        }
                        break;

                case 2:

                    Scanner caseNumber = new Scanner(System.in);
                    System.out.println("Enter array size :  ");
                    int inputSize = in.nextInt();
                    inputArr = new int[inputSize];
                    for (int i = 0; i < inputSize; i++) {
                        int min = 1, max = 1000;
                        inputArr[i] = (min + (int) (Math.random() * max));
                    }
                    System.out.println("Array before sorting : ");
                    for (int i : inputArr) {
                        System.out.print(i);
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                    System.out.println("Array after sorting : ");
                    startTime = System.currentTimeMillis();
                    arr2 = mms.doInsertionSort(inputArr);
                    stopTime = System.currentTimeMillis();
                    elapsedTime = stopTime - startTime;
                    System.out.println("Time taken to sort :" + elapsedTime);
                    for (int i : arr2) {
                        System.out.print(i);
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                    break;
                case 3:

                    inputArr = new int[]{1, 2, 3, 4, 8, 9, 16, 20, 30, 45};

                    System.out.println("Array before sorting : ");
                    for (int i : inputArr) {
                        System.out.print(i);
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                    System.out.println("Array after sorting : ");
                    startTime = System.currentTimeMillis();
                    arr2 = mms.doInsertionSort(inputArr);
                    stopTime = System.currentTimeMillis();
                    elapsedTime = stopTime - startTime;
                    System.out.println("Time taken to sort :" + elapsedTime);
                    for (int i : arr2) {
                        System.out.print(i);
                        System.out.print(" ");
                    }
                    break;

                default:
                    System.out.println("Enter correct ID");
                    break;

            }
            System.out.println("Do you wish to continue(yes/no)?");
            Scanner enter = new Scanner(System.in);
            s = enter.nextLine();
        } while (s.equals("yes"));

    }

    public int[] doInsertionSort(int[] input) {

        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }
}


