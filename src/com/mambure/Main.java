package com.mambure;

import com.mambure.projecteuler.Fibonacci;
import com.mambure.projecteuler.LargestPrimeFactor;
import com.mambure.projecteuler.SumOfMultiples;

public class Main {

    public static void main(String[] args) {
        LargestPrimeFactor.solution(600851475143L);
    }

    // [7,3,7,3,1,3,4,1]
    public static int solution(int[] arr, int S) {
        int result = 0;
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            int count = 0;
            for(int y = x; y < arr.length; y++){
                count++;
                sum += arr[y];
                int average = sum / count;
                int remainder = sum % count;
                if (average == S && remainder == 0){
                    result++;
                }
            }
            sum = 0;
        }
        return result;
    }
}
