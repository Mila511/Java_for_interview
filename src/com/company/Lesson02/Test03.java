package com.company.Lesson02;

/**
 * Created by plkff on 11/18/2016.
 */ // swap -> a=5, b=7 -> a=7, b=5
public class Test03 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println(a + " " + b);
        swap(a, b);
    }

    public static void swap (int a, int b) {
        int c=a;
        a=b;
        b=c;
        System.out.println(a + " " + b);
    }
}
