package com.company.Lesson06_Arrays;

/**
 * Created by plkff on 12/16/2016.
 */
public class Test07 {
    public static void main(String[] args) {
        int [] array  = {1,2,3,4,5,10};
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum = sum + array [i];

        }
        System.out.println(sum);
    }
}
