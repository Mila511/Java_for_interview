package com.company.Lesson16HW_CodeFights;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Mila on 4/21/2017.
 */
//Given an array of integers, find the maximum possible sum you can get from one of its contiguous subarrays.
// The subarray from which this sum comes must contain at least 1 element.
//
//        Example
//
//        For inputArray = [-2, 2, 5, -11, 6], the output should be
//        arrayMaxConsecutiveSum2(inputArray) = 7.
//
//        The contiguous subarray that gives the maximum possible sum is [2, 5], with a sum of 7.
public class Test17_arrayMaxConsecutiveSum2 {

    public static void main(String[] args) {
        // Integer [] inputArray = {-2, 2, 5, -11, 6};
        Integer[] inputArray = {-2, 2, 5, -11, 6};
        arrayMaxConsecutiveSum2(inputArray);
    }

    public static int arrayMaxConsecutiveSum2(Integer inputArray[]) {
        int maxOfarr = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > maxOfarr) {
                maxOfarr = inputArray[i];
            }
        }
        int[] arrSum = new int[inputArray.length + 1];
        arrSum[0] = maxOfarr;
        int sum = 0;
        int maxsum = 0;
        int k = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            sum = inputArray[i];
            for (int j = i; j < inputArray.length - 1; j++) {

                if (inputArray[j + 1] > inputArray[j]) {
                    sum += inputArray[j + 1];
                } else {
                    k++;
                    arrSum[k] = sum;
                    sum = 0;
                    break;
                }
            }
        }
        int max = arrSum[0];
        for (int i = 0; i < arrSum.length; i++) {
            if (arrSum[i] >= max) {
                max = arrSum[i];
            }
        }
        return max;
    }
}
