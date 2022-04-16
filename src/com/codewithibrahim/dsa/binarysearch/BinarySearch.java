package com.codewithibrahim.dsa.binarysearch;

public class BinarySearch {

    public int binarySearch(int[] arr, int first, int last, int target) {

        if (last >= first) {
            int mid = first + (last - first) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] > target)
                return binarySearch(arr, first, mid -1, target);
            else
                return binarySearch(arr, mid +1, last, target);
        }
        return -1;
    }
}
