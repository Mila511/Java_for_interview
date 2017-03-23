package com.company.Lesson16HW_CodeFights;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Mila on 3/16/2017.
 */
//**
//        * Created by Mila on 3/16/2017.   С Коллекциями    SET
//        */
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
public class Test05_1 {
    public static void main(String[] args) {

        // int a[] = {1, 2, 3, 1};
        int a[] = {3, 1};


        containsDuplicates(a);
        //System.out.println(a);
    }

    public static boolean containsDuplicates(int[] a) {
        Arrays.sort(a);
        Set<Integer> seta = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            seta.add(a[i]);
            System.out.println(a[i]);
        }
//        if (a.length > seta.size()) {
//            System.out.println("true");
//            return true;
//        }
//        System.out.println("false");
//        return false;
        return seta.size() != a.length;

    }
}

