package com.codewithibrahim.dsa.recursion;

public class Recursion {

    public int sum(int start, int end) {
        if (start < end)
            return end + sum(start, end - 1);
        else
        return end;
    }

    public int factorial(int n) {
        if (n != 0)
            return n * (n - 1);
        else
            return 1;
    }

    public void displayNumbers(int start, int end) {
        if (start > end)
            System.out.println(end);
        else
            if (end > start)
            displayNumbers(start, end - 1);

        System.out.println(end);
    }
}
