package com.codewithibrahim.dsa.stack;

public class Stack {
    private int size;
    private int[] arr;
    private int top;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // push item on top of the stack
    public void push(int item) {
        if (!isFull())
            arr[++top] = item;
        else
            System.out.println("Stack is full.");
    }

    // pop item on the stack
    public int pop() {
        return arr[top--];
    }

    // view data on top
    public int peek() {
        return arr[top];
    }
    public boolean isFull() {
        return top == size -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
