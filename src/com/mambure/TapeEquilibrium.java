package com.mambure;

import java.util.*;

/*
A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
We can split this tape in four places:

P = 1, difference = |3 − 10| = 7
P = 2, difference = |4 − 9| = 5
P = 3, difference = |6 − 7| = 1
P = 4, difference = |10 − 3| = 7
Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
For example, given:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
the function should return 1, as explained above.
 */
public class TapeEquilibrium {

    public static int solution(int[] arr) {
        if (arr.length == 0) return 0;
        List<Integer> sums = new ArrayList<>();
        int sumFirstPart = Math.abs(arr[0]);
        int sumTotal = sumFirstPart;
        int curr;

        for (int x = 1; x < arr.length; x++) {
            curr = Math.abs(arr[x]);
            sumTotal += curr;
            if (curr > 0 && arr.length > curr) {
                sums.add(sumFirstPart);
            }
            sumFirstPart += curr;
        }

        int min = Math.abs(sums.get(0) - (sumTotal - sums.get(0)));
        for (int x = 1; x < sums.size(); x++) {
            min = Math.min(min, Math.abs(sums.get(x) - (sumTotal - sums.get(x))));
        }
        return min;
    }
}
