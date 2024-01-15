package Math;

import java.util.stream.LongStream;
import java.math.BigInteger;

/**
 * Factorial
 */
public class Factorial {

    public static void main(String[] args) {

        int n = 10;

        System.out.println(factorialIterative(n));
        System.out.println(factorialIterativeWithBigInteger(n));
        System.out.println(factorialRecursive(n));
        System.out.println(factorialStream(n));
        System.out.println(factorialTailRecursive(n));
    }

    // Using Iteration (Loop)
    static long factorialIterative(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    static BigInteger factorialIterativeWithBigInteger(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    // Using Recursion
    static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

    // Using Stream
    static long factorialStream(int n) {
        return LongStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }

    // Using Tail Recursion
    static long factorialTailRecursive(int n) {
        return factorialHelper(n, 1);
    }

    static long factorialHelper(int n, int acc) {
        if (n <= 1) {
            return acc;
        }

        return factorialHelper(n - 1, n * acc);
    }
}