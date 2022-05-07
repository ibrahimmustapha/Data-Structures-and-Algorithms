package com.codewithibrahim.dsa;

import com.codewithibrahim.dsa.shellsort.ShellSort;

public class Main {

    public static void main(String[] args){
        ShellSort sort = new ShellSort();

        int[] nums = {0, 3, -6, -8, 2, 1};
        sort.shellSort(nums);
        sort.printArray(nums);
    }
}