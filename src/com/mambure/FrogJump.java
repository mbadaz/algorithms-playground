package com.mambure;

import java.util.HashSet;
import java.util.Set;

public class FrogJump {

    public static int solution(int X, int[] A) {
        // write your code in Java SE 8
        Set<Integer> posSet = new HashSet<>();
        int xPos = -1;

        for (int x = 0; x < A.length; x++){
            int curr = A[x];
            posSet.add(curr);
            if (posSet.size() == X) {
                return x;
            }
        }

        return -1;
    }
}
