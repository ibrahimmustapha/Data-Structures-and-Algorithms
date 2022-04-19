package com.codewithibrahim.dsa.queue;

public class Queue {
    private final int MAX;
    private int[] arr;
    private int front;
    private int rear;
    private int itemCount;

    public Queue(int size) {
        MAX = size;
        arr = new int[MAX];
        front = 0;
        rear = -1;
        itemCount = 0;
    }

    // insert new item into the queue
    public void insert(int item) {
        if (!isFull()) {
            if (rear == MAX -1) {
                rear = -1;
            }

            arr[++rear] = item;
            itemCount++;
            System.out.println("Inserted " + item);
        }
    }

    // remove item from queue
    public int remove() {
        int item = arr[front++];
        if (front == MAX)
            front = 0;

        itemCount--;
        return item;
    }

    // peek first item in queue
    public int peek() {
        return arr[front];
    }

    // display all items in a queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            for (int i = front; i <= rear; i++)
                System.out.println(arr[i]);
        }
    }

    // is full method
    public boolean isFull() {
        return front == 0 && rear == MAX -1;
    }

    // is empty method
    public boolean isEmpty() {
        return front == -1;
    }
}
