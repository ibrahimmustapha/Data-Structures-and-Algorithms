package com.codewithibrahim.dsa.sorting;

import java.util.Arrays;

public class MergeSort {

    // merge arrays
    public static void sort(int[] arr, int start, int end) {

        if (end - start < 2) // return if there's only 1 element in the array
            return;

        int mid = (start + end) / 2;   // create a mid-point for partitioning
        sort(arr, start, mid);         // partition the left partition array
        sort(arr, mid, end);          // partition the right partition array
        merge(arr, start, mid, end);  // merge left + right partition
    }

    // sort array
    public static void merge(int[] arr, int start, int mid, int end) {
        if (arr[mid - 1] <= arr[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end)
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];

        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, arr, start, tempIndex);
    }
}
