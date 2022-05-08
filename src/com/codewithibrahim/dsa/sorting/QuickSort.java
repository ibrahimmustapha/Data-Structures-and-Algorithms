package com.codewithibrahim.dsa.sorting;

import java.util.Arrays;

public class QuickSort {

    public void partition(int[] arr, int start, int end) {
    }

    public void quickSort(int[] arr, int lowIndex, int highIndex) {
        int pivot = arr[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(arr, leftPointer, rightPointer);
        }

        swap(arr, leftPointer, highIndex);

        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    public void swap(int[] arr, int index1, int index2) {
        int temp = index1;
        index1 = index2;
        index2 = temp;
    }

    public void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
