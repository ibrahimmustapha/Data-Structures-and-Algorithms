package com.codewithibrahim.dsa;

import com.codewithibrahim.dsa.arrays.Array;
import com.codewithibrahim.dsa.binarysearch.BinarySearch;
import com.codewithibrahim.dsa.linearsearch.LinearSearch;
import com.codewithibrahim.dsa.linkedlist.MyLinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {1, 2, 4, 5, 6, 7, 8};
        int key = 8;

        LinearSearch search = new LinearSearch();
        int res = search.linearSearch(arr, key);

        if (res == -1)
            System.out.println("Target not found");
        else
            System.out.println("Target found at index::" + res);
    }
}