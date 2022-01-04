package com.mambure.projecteuler;

public class Fibonacci {

    public static void sumOfEven() {
        int first = 1;
        int second = 2;
        System.out.println(first);
        System.out.println(second);
        int sum = 2;
        while (first + second < 4000000) {
            second = first + second;
            first = second - first;
            if(second % 2 == 0) sum += second;
            System.out.println(second);
        }
        System.out.println("Sum of even numbers is " + sum);
    }
}
