package Math;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 10;

        System.out.println(fibonacciRecursive(n));
        System.out.println(fibonacciIterative(n));
        System.out.println(fibonacciMemoization(n));
        System.out.println(fibonacciGoldenRatio(n));
    }

    // Using Recursion
    static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Using Iteration
    static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 0, current = 1, next;

        for (int i = 2; i <= n; i++) {
            next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }

    // Using Memoization (Optimized Recursion)
    static Map<Integer, Integer> memo = new HashMap<>();

    static int fibonacciMemoization(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fibonacciMemoization(n - 1) + fibonacciMemoization(n - 2);
        memo.put(n, result);

        return result;
    }

    // Using Golden Ratio
    static int fibonacciGoldenRatio(int n) {
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(goldenRatio, n) / Math.sqrt(5));
    }

}
