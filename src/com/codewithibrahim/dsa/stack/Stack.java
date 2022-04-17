package com.codewithibrahim.dsa.stack;

import java.util.NoSuchElementException;

public class Stack {
    private int size;
    private int[] arr;
    private int top;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // push
    public void push(int item) {
        if (!isFull())
            arr[++top] = item;
        else
            System.out.println("Stack is full.");
    }

    // pop
    public int pop() {
        if (isEmpty())
            throw new NoSuchElementException("Stack is empty");

        return arr[top--];
    }

    // peek
    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException("Stack is empty");
        return arr[top];
    }

    // is full method
    public boolean isFull() {
        return top == size -1;
    }

    // is empty method
    public boolean isEmpty() {
        return top == -1;
    }
}
