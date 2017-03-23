package com.company.Lesson06_Arrays;

/**
 * Created by plkff on 12/16/2016.
 * a[6]
 * array - 0[78]1[]2[68]3[]4[]
 */
public class Test01 {
    public static void main(String[] args) {
        int a = 6;
        int[] array = new int[5];
        array[2] = 68;
        array[0] = 78;

        System.out.println(array[2]);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
