package com.codewithibrahim.dsa;

import com.codewithibrahim.dsa.arrays.Array;
import com.codewithibrahim.dsa.binarysearch.BinarySearch;
import com.codewithibrahim.dsa.linearsearch.LinearSearch;
import com.codewithibrahim.dsa.linkedlist.MyLinkedList;
import com.codewithibrahim.dsa.stack.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();

        System.out.println(stack.peek());

        while(!stack.isEmpty()) {
            int data = stack.pop();
            System.out.println(data);
        }
    }
}