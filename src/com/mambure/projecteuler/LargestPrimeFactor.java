package com.mambure.projecteuler;

public class LargestPrimeFactor {
    // 1,3,5,7,11,13,17,19,23,27,29,31
    // 2,2,2,4,2,4,2,4,4,2,2
    public static void solution(long num) {
        long maxPrimeFactor = 1;
        double sqrt = Math.sqrt(num);
        for (long x = 3; x <= num; x++) {
            System.out.println("Current x = " + x);
            if (num % x == 0){
                System.out.println("Found multiple " + x);
                maxPrimeFactor = Math.max(maxPrimeFactor, x);
            }
        }
        System.out.println(String.format("Largest prime factor of %d is %d", num, maxPrimeFactor));
    }

    private static boolean isPrime(long num) {
        int multiple = 0;
        for (int x = 1; x <= num; x++) {
            if (num % x == 0) multiple++;
        }
        return multiple == 2;
    }
}
