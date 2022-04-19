package com.codewithibrahim.dsa.binarysearch;

public class BinarySearch {

    public int binarySearch(int[] arr, int first, int last, int key) {
        if (last >= first) {
            int mid = first + (last - first) / 2;

            if (arr[mid] == key) return mid;

            if (arr[mid] > key)
                binarySearch(arr, first, mid -1, key);
            else
                binarySearch(arr, mid +1, last, key);
        }

        return -1;
    }
}

// 776*777#