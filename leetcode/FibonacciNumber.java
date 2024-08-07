package leetcode;

/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
 */
public class FibonacciNumber {
    public int fib(int n) {
        if (n == 0) return 0;
        int sol[] = new int[n + 1];
        sol[0] = 0;
        sol[1] = 1;
        for (int i = 2; i <= n; i++) {
            sol[i] = sol[i - 2] + sol[i - 1];
        }
        return sol[n];
    }
}
