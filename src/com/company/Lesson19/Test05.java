package com.company.Lesson19;

/**
 * Created by Mila on 3/30/2017.
 *//* Метод должен вернуть номер строки кода, из которого вызвали этот метод
//Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода, из которого вызвали этот метод.
// В оспользуйся функцией: element.getLineNumber().
// /* Метод должен возвращать результат – глубину его стек-трейса
//Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем (количество элементов
в списке). Это же число метод должен выводить на экран.
//*/
//*/
public class Test05 {
    public static void main(String[] args) {
        method1();
    }

    public static int method1 () {
        method2();
        StackTraceElement [] met1 = Thread.currentThread().getStackTrace();
        int nomstr = met1[2].getLineNumber();
        System.out.println(met1.length);
        return nomstr;
    }

    public static int method2 () {
        method3();
        StackTraceElement [] met2 = Thread.currentThread().getStackTrace();
        int nomstr = met2[2].getLineNumber();
        System.out.println(met2.length);
        return nomstr;
    }
    public static int method3 () {
        method4();
        StackTraceElement [] met3 = Thread.currentThread().getStackTrace();
        int nomstr = met3[2].getLineNumber();
        System.out.println(met3.length);
        return nomstr;
    }

    public static int method4 () {
        StackTraceElement [] met4 = Thread.currentThread().getStackTrace();
        int nomstr = met4[2].getLineNumber();
        System.out.println(met4.length);
        return nomstr;
    }
}
