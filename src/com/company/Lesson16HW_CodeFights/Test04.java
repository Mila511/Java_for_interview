package com.company.Lesson16HW_CodeFights;

/**
 * Created by Mila on 3/3/2017.
 */
public class Test04 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {10, 20, 30, 40};
        int v = 42;
        sumOfTwo(a, b, v);

    }

    public static boolean sumOfTwo(int[] a, int[] b, int v) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] + b[j] == v) {
                    System.out.println(a[i] + b[j]);
                    return true;
                }
            }
        }
        return false;
    }
}
