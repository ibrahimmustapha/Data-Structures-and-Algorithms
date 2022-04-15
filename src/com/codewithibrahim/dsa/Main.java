package com.codewithibrahim.dsa;

import com.codewithibrahim.dsa.arrays.Array;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Array numbers = new Array(4);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(0);
        numbers.print();
    }
}