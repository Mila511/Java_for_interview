package com.company.Lesson19;

/**
 * Created by Mila on 3/23/2017.
 * LIFO - last in fist out
 *
 */
public class Test02 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1(){method2();}
    private static void method2(){
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.out.println(element.getMethodName());
        }
    }
}
