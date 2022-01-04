package com.mambure.projecteuler;
/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class SumOfMultiples {

    public static void solution() {
        int sumOfMultiples = 0;
        for (int x = 1; x < 1000; x++) {
            if (x % 3 == 0 || x % 5 == 0){
                sumOfMultiples += x;
            }
        }
        System.out.println("Sum of multiples of 3 or 5 below 1000 is " + sumOfMultiples);
    }
}