package com.codewithibrahim.dsa;

import com.codewithibrahim.dsa.sorting.CountingSort;

public class Main {

    public static void main(String[] args){
        int[] arr = {2, 5, 1, 1, 3};

//        MergeSort.sort(arr, 0, arr.length);

        CountingSort.sort(arr, 1, 5);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}