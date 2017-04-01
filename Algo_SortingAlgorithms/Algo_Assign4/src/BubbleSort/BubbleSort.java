/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BubbleSort;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Pawan
 */
public class BubbleSort {
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            //printNumbers(array);
            
            }
           
        }
    }
 
    private static void swapNumbers(int i, int j, int[] array) {
 
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
 
    private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
 
    public static void main(String[] args) {
       long startTime = 0;
       int input;

        BubbleSort mms = new BubbleSort();
        int[] inputArr;
        long stopTime = 0;
        long elapsedTime = 0;
        int[]inputArray;

        String s;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter case Value :  ");
            int caseType = in.nextInt();
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
//                    mms.bubble_srt(inputArr);
//                    for (int i : inputArr) {
//                        System.out.print(i);
//                        System.out.print(" ");
//                    }
//                    System.out.println(" ");
//                    stopTime = System.currentTimeMillis();
//                    elapsedTime = stopTime - startTime;
//                    System.out.println(elapsedTime);
//                    break;
                case 1:

                    input = 10000;
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
                                // Simple swap
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
                                mms.bubble_srt(inputArray);
                                stopTime = System.currentTimeMillis();
                                elapsedTime = stopTime - startTime;
                                avgelapsedTime = avgelapsedTime + elapsedTime;
                               
//                                 System.out.println("Array after sorting : ");
//                                 
//                             for (int n : inputArray) {
//                                System.out.print(n);
//                                System.out.print( " ");
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
                     mms.bubble_srt(inputArr);
                    for (int i : inputArr) {
                        System.out.print(i);
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                    stopTime = System.currentTimeMillis();
                    elapsedTime = stopTime - startTime;
                    System.out.println(elapsedTime);

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
                     mms.bubble_srt(inputArr);
                    for (int i : inputArr) {
                        System.out.print(i);
                        System.out.print(" ");
                    }
                    stopTime = System.currentTimeMillis();
                    elapsedTime = stopTime - startTime;
                    System.out.println(elapsedTime);
                    break;
                     
                case 4:

                    input = 10000;
                    for (int i = 1; i <= 100; i++) {
                        inputArray = new int[input];
                       
                        long avgelapsedTime = 0;
                        for (int m = 0; m < 10; m++) {
                           for (int j = 0; j < inputArray.length; j++) {
                            inputArray[j] = (1 + (int) (Math.random() * 10000));
                            }
//                            System.out.println("");
//                            System.out.println("Array before sorting : ");
//                            for (int n : inputArray) {
//                                System.out.print(n);
//                                System.out.print(" ");
//                            }
//                            System.out.println("");
                                startTime = System.currentTimeMillis();
                                mms.bubble_srt(inputArray);
                                stopTime = System.currentTimeMillis();
                                elapsedTime = stopTime - startTime;
                                avgelapsedTime = avgelapsedTime + elapsedTime;
                               
//                                 System.out.println("Array after sorting : ");
//                                 
//                             for (int n : inputArray) {
//                                System.out.print(n);
//                                System.out.print( " ");
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

                default:
                    System.out.println("Enter correct ID");
                    break;

            }
            System.out.println("Do you wish to continue(yes/no)?");
            Scanner enter = new Scanner(System.in);
            s = enter.nextLine();
        } while (s.equals("yes"));

 
    }
}
