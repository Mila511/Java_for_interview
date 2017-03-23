package com.company.Lesson16HW_CodeFights;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Mila on 3/9/2017.
 */
//Note: Write a solution with O(n2) time complexity, since this is what you would be asked to do during a real interview.
//        You have an array a composed of exactly n elements. Given a number x, determine whether or not a contains three elements for which the sum is exactly x.
//        Example
//        For x = 15 and a = [14, 1, 2, 3, 8, 15, 3], the output should be
//        tripletSum(x, a) = false;
//        For x = 8 and a = [1, 1, 2, 5, 3], the output should be
//        tripletSum(x, a) = true.
//        The given array contains the elements 1,2, and 5, which add up to 8.
//        Input/Output
//        [time limit] 3000ms (java)
//        [input] integer x
//        Constraints:
//        1 ≤ x ≤ 3000.
//        [input] array.integer a
//        Constraints:
//        3 ≤ a.length ≤ 1000,
//
//        1 ≤ a[i] ≤ 1000.
//        [output] boolean
//        Return true if the array contains three elements that add up to x and false otherwise.
public class Test06 {
    public static void main(String[] args) {
        //int [] a = {1, 1, 2, 5, 3};
        int[] a = {14, 1, 2, 3, 8, 15, 3};
        int x = 13;
        tripletSum(x, a);
    }

    public static boolean tripletSum(int x, int[] a) {
        Arrays.sort(a);
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    summa = a[i] + a[j] + a[k];
                    if (summa == x) {
                        System.out.println("true" + summa + " " + a[i] + a[j] + a[k]);
                        summa = 0;
                        return true;

                    }
                }

            }
        }
        return false;
    }
}
