package com.codewithibrahim.dsa.sorting;

public class CountingSort {

    public static void sort(int[] arr, int min, int max) {
        int[] tempCount = new int[(max - min) + 1];

        for (int i = 0; i < arr.length; i++)
            tempCount[arr[i] - min]++;

        int j = 0;
        for (int i = min; i <= max; i++)
            while(tempCount[i - min] > 0) {
                arr[j++] = i;
                tempCount[i - min]--;
            }
    }
}
