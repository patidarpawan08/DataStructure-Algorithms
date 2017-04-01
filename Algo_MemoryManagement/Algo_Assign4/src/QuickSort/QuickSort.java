/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Pawan
 */
public class QuickSort {
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
       
        int[] arr2;
        long startTime = 0;

        QuickSort mms = new QuickSort();
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
//                    mms.sort(inputArr);
//                    stopTime = System.currentTimeMillis();
//                    elapsedTime = stopTime - startTime;
//                    System.out.println("Time taken to sort :" + elapsedTime);
//                    
//                    for (int i : inputArr) {
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
                                mms.sort(inputArray);
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
                    mms.sort(inputArr);
                    stopTime = System.currentTimeMillis();
                    elapsedTime = stopTime - startTime;
                    System.out.println("Time taken to sort :" + elapsedTime);
                    for (int i : inputArr) {
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
                    mms.sort(inputArr);
                    stopTime = System.currentTimeMillis();
                    elapsedTime = stopTime - startTime;
                    System.out.println("Time taken to sort :" + elapsedTime);
                    for (int i : inputArr) {
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

}
