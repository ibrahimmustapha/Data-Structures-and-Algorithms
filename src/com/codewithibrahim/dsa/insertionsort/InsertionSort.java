package com.codewithibrahim.dsa.insertionsort;

public class InsertionSort {

    public void sort(int[] arr,  int n) {
        n = arr.length;

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < n; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;
        }
    }

    public void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
