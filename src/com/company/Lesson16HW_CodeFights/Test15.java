package com.company.Lesson16HW_CodeFights;

import java.util.Arrays;

/**
 * Created by Mila on 4/13/2017.
 */
//Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number
// for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers,
// return the number for which the second occurrence has a smaller index than the second occurrence of the other number does.
// If there are no such elements, return -1.
//
//        Example
//
//        For a = [2, 3, 3, 1, 5, 2], the output should be
//        firstDuplicate(a) = 3.
//
//        There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than than second occurrence of 2 does, so the answer is 3.
//
//        For a = [2, 4, 3, 5, 1], the output should be
//        firstDuplicate(a) = -1.

public class Test15 {
    public static void main(String[] args) {
        Integer[] a = {2, 3, 3, 1, 5, 2};
        Integer[] b = new Integer[a.length];
        System.arraycopy(a,a.length,b,0,b.length-1);
        Arrays.sort(b);
        for (int n:b)
              {
                  System.out.println(n);
                  System.out.printf("");;
                  System.out.println();
                  System.out.println();

        }
        System.out.println();
       // for (int i = 0; i <a.length; i++) {


        //}
    }
}
