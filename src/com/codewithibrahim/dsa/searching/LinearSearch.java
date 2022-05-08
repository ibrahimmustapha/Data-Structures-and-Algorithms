package com.codewithibrahim.dsa.searching;

public class LinearSearch {

    public int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) return i;
        }
        return -1;
    }
}
