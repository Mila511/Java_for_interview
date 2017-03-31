package com.company.Lesson19;

/**
 * Created by Mila on 3/30/2017.
 */
///* И снова StackTrace
//Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его,
// полученное с помощью StackTrace.
//*/
public class Test04 {
    public static void main(String[] args) {
        method1();
    }

    public static String method1 () {
        method2();
        StackTraceElement [] met1 = Thread.currentThread().getStackTrace();
        String element = met1[2].getMethodName();
        System.out.println(element);
        return element;//
    }

    public static String method2 () {
        method3();
        StackTraceElement [] met2 = Thread.currentThread().getStackTrace();
        String element = met2[2].getMethodName();
        System.out.println(element);
        return element; //method1
    }
    public static String method3 () {
        StackTraceElement [] met3 = Thread.currentThread().getStackTrace();
        String element = met3[2].getMethodName();
        System.out.println(element);
        return element;//method2
    }

}
