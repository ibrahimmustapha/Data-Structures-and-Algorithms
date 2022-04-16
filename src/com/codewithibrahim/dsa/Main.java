package com.codewithibrahim.dsa;

import com.codewithibrahim.dsa.arrays.Array;
import com.codewithibrahim.dsa.binarysearch.BinarySearch;
import com.codewithibrahim.dsa.linkedlist.MyLinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {1, 2, 4, 5, 6, 7, 8};
        int key = 1;
        int high = arr.length - 1;

        BinarySearch search = new BinarySearch();
        int res = search.binarySearch(arr, 0, high, key);

        if (res == -1) {
            System.out.println("Target not found :(");
        } else {
            System.out.println("Target found at index::" + res);
        }

    }
}