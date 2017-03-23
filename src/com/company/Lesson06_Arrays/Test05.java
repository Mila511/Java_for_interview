package com.company.Lesson06_Arrays;

/**
 * Created by plkff on 12/16/2016.
 */
public class Test05 {
    public static void main(String[] args) {
        int [] array = {12,23,3,54,35,37};
        int min = array[0];
        for (int i = 0; i < 5; i++) {
            if (array [i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

    }
}
