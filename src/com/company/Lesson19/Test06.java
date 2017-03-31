package com.company.Lesson19;

/**
 * Created by Mila on 3/30/2017.
 */
///* Стек-трейс длиной 10 вызовов
//Напиши код, чтобы получить стек-трейс длиной 10 вызовов.
//*/
public class Test06 {
    public static void main(String[] args) {
        method1();

    }

    public static void  method1 () {
        method2();
        StackTraceElement [] met1 = Thread.currentThread().getStackTrace();

    }
    public static void  method2 () {
        StackTraceElement [] met2 = Thread.currentThread().getStackTrace();
        System.out.println(method3());

    }
    public static  int method3 () {

        StackTraceElement [] met3 = Thread.currentThread().getStackTrace();
        return met3.length;

    }


}
