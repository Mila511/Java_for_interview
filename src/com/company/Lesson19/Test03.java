package com.company.Lesson19;

/**
 * Created by Mila on 3/23/2017.
 */
public class Test03 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        StackTraceElement[] part = Thread.currentThread().getStackTrace();
        for (StackTraceElement part1 : part) {
            System.err.println(part1.getMethodName());
        }
    }
}
