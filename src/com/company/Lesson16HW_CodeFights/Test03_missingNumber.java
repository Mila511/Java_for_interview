package com.company.Lesson16HW_CodeFights;

/**
 * Created by Mila on 3/9/2017.
 */


import java.io.IOException;
import java.util.*;


/**
 * Created by Mila on 3/3/2017.
 * You are supposed to label a bunch of boxes with numbers from 0 to n, and all the labels are stored in the array arr.
 * Unfortunately one of the labels is missing. Your task is to find it.
 * Example
 * For arr = [3, 1, 0], the output should be
 * missingNumber(arr) = 2.
 * Input/Output
 * [time limit] 3000ms (java)
 * [input] array.integer arr
 * An unsorted array consisting of different integers from 0 to n inclusive, with only one of them missing.
 * Constraints:
 * 1 ≤ arr.length ≤ 1000,
 * 0 ≤ arr[i] ≤ arr.length.
 * [output] integer
 * <p>
 * The missing number.
 */

public class Test03_missingNumber {


    public static void main(String[] args) throws IOException {
        int[] arr = {2, 1, 0};//0,1,2
        System.out.println(missingNumber(arr));

    }

    public static int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int x = 0;
        for (int i : arr) {
            if(i != x){
                break;
            }
            x++;
        }
        return x;

//      Arrays.sort(arr);
//
//
//        for ( int i=0; i < arr.length-1; i++) {
//            if(arr[i]!=arr[i+1]-1){
//                return arr[i+1]-1;
//            }
//        }
//        if(arr[0] != 0){
//            return 0;
//        } else {
//            return arr[arr.length-1]+1;
//        }
    }
}
