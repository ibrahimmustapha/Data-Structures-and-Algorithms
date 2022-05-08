package com.codewithibrahim.dsa.recursion;

public class Recursion {

    public int sum(int start, int end) {
        if (start < end)
            return end + sum(start, end - 1);
        else
        return end;
    }

    public static int recursiveFactorial(int n) {
        if (n == 0)
            return 1;

        return n * recursiveFactorial(n - 1);
    }

    public static int iterativeFactorial(int num) {
        if (num == 0)
            return 1;

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
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
