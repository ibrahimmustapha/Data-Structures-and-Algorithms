package com.codewithibrahim.dsa;

import com.codewithibrahim.dsa.arrays.Array;
import com.codewithibrahim.dsa.binarysearch.BinarySearch;
import com.codewithibrahim.dsa.linearsearch.LinearSearch;
import com.codewithibrahim.dsa.linkedlist.MyLinkedList;
import com.codewithibrahim.dsa.queue.Queue;
import com.codewithibrahim.dsa.stack.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Queue queue = new Queue(4);
        queue.insert(16);
        queue.insert(12);
        queue.insert(45);
        queue.insert(34);

        queue.remove();
        System.out.println(queue.peek());

        queue.display();
    }
}