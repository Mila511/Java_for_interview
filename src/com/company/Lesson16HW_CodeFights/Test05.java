package com.company.Lesson16HW_CodeFights;

import java.util.Arrays;

/**
 * Created by Mila on 3/16/2017.   С Коллекциями    SET
 */
//Example
//
//        For a=[1,2,3,1],the output should be
//        containsDuplicates(a)=true.
//
//        There are two 1s in the given array.
//
//        For a=[3,1],the output should be
//        containsDuplicates(a)=false.
//
//        The given array contains no duplicates.

public class Test05 {
    public static void main(String[] args) {
        //int a []  = {3,1};
        int a[] = {1, 2, 3, 1};

        containsDuplicates(a);
    }

    public static boolean containsDuplicates(int[] a) {

        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    // System.out.println(a[i]+" "+a[j]);
                    // System.out.println("true");
                    return true;
                }
            }
        }
        // System.out.println("false");
        return false;

    }
}
