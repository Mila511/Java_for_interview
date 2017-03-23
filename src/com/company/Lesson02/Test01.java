package com.company.Lesson02;

/**
 * Created by plkff on 11/18/2016.
 */ // 4 method --- + - * /
public class Test01 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(vych(20,10));
        System.out.println(multi (10,20));
        System.out.println(div (25,12));
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int vych(int a, int b) {
        int c = a - b;
        return c;
    }

    public static int multi(int a, int b) {
        int c = a * b;
        return c;
    }

    public static double div(double a, double b) {
        double c = a / b;
        return c;
    }
}
