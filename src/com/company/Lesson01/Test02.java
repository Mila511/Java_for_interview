package com.company.Lesson01;

/**
 * Created by plkff on 11/11/2016.
 */
public class Test02 {
    public static void main(String[] args) {
        int a = 5; // 7
        int b = 7; // 2
        int c = 2; // 5
        int d = a; // 5
        System.out.println(a + " " + b + " " + c);
        a = b;
        b = c;
        c = d;
        System.out.println(a + " " + b + " " + c);
    }
}
