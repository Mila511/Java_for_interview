package com.company.Lesson06_Arrays;

/**
 * Created by plkff on 12/16/2016.
 */
public class Test02 {
    public static void main(String[] args) {
        int [] array  = new int [10];
        array [0] = 0;
        array [9] = 9;
        System.out.println(array [2]);
        System.out.println(array.length);
        for (int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
