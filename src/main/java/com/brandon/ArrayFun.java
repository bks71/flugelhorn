package com.brandon;

public class ArrayFun {

    // https://codingbat.com/prob/p158767
    boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            for (int k = i; k < nums.length; k++) {
                rightSum += nums[k];
            }

            if (leftSum == rightSum)
                return true;
        }
        return false;
    }

    // https://codingbat.com/prob/p155405
    boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) {
            return true;
        }

        int innerIndex = 0;

        for (int outerIndex = 0; outerIndex < outer.length; outerIndex++) {

            if (outer[outerIndex] < inner[innerIndex]) {
                continue;
            }
            if (outer[outerIndex] == inner[innerIndex]) {
                innerIndex++;
                if (innerIndex >= inner.length) {
                    return true;
                }
                continue;
            }
            return false;
        }
        return false;
    }

}
