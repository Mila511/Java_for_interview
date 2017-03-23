package com.company.Lesson06_Arrays;

/**
 * Created by plkff on 12/16/2016.
 */
public class Test03 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = array.length-i;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
