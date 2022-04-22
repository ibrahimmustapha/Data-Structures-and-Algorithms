package com.codewithibrahim.dsa;

import com.codewithibrahim.dsa.quicksort.QuickSort;
import com.codewithibrahim.dsa.recursion.Recursion;

public class Main {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        int[] arr = {1, 5, -23, 11, 3, 10, 17};
        int fact = recursion.factorial(0);

        recursion.displayNumbers(1, 5);

//        System.out.println(fact);
//        System.out.println(recursion.sum(10, 2));
    }
}