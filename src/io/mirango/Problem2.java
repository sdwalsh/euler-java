package io.mirango;

public class Problem2 {
    public static long answer() {
        return sumOfEvenFibonacciNumbers();
    }

    private static long sumOfEvenFibonacciNumbers() {
        long fib_1 = 1;
        long fib_2 = 0;
        long total = 0;

        while(fib_1 <= 4000000) {
            if(fib_1 % 2 == 0) {
                total += fib_1;
            }

            long temp = fib_1;
            fib_1 = fib_1 + fib_2;
            fib_2 = temp;
        }

        return total;
    }
}
