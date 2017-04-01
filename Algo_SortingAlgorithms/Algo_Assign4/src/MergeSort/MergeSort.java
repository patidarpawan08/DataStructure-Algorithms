package MergeSort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pawan
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MergeSort {

    private int[] array;
    private int[] tempMergArr;
    private int length;

    public static void main(String args[]) {
        long startTime = 0;

        MergeSort mms = new MergeSort();
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
                                int a = inputArray[index];
                                inputArray[index] = inputArray[k];
                                inputArray[k] = a;
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
//                    for (int i : inputArr) {
//                        System.out.print(i);
//                        System.out.print(" ");
//                    }
//                    System.out.println(" ");
//                    stopTime = System.currentTimeMillis();
//                    elapsedTime = stopTime - startTime;
//                    System.out.println(elapsedTime);
//                    break;
                    
                    case 2:

//                    Scanner input = new Scanner(System.in);
//                    System.out.println("Enter array size :  ");
//                    int inputSize = in.nextInt();
                    int inputSize = 100;
                    inputArr = new int[inputSize];
                    for (int i = 0; i < 10; i++) {
                        int min = 1, max = 1000;
                        inputArr[i] = (min + (int) (Math.random() * max));
                        inputSize = 100;
                    }
                    inputSize = inputSize + 100;
                    System.out.println("Array before sorting : ");
                    for (int i : inputArr) {
                        System.out.print(i);
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                    System.out.println("Array after sorting : ");
                    startTime = System.currentTimeMillis();
                    mms.sort(inputArr);
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
                    mms.sort(inputArr);
                    for (int i : inputArr) {
                        System.out.print(i);
                        System.out.print(" ");
                    }
                    stopTime = System.currentTimeMillis();
                    elapsedTime = stopTime - startTime;
                    System.out.println(elapsedTime);
                    break;

                default:
                    System.out.println("Enter correct ID");
                    break;

            }
            System.out.println("Do you wish to continue(yes/no)?");
                    Scanner enter = new Scanner(System.in);
                    s = enter.nextLine();
            }
            while (s.equals("yes"));

        }

    

    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }
}
