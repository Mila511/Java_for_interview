package com.company.Lesson20;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

/**
 * Created by Mila on 4/6/2017.
// /* Перехват unchecked исключений
// В методе processExceptions обработайте все unchecked исключения.
// Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
// Можно использовать только один блок try..
// */


public class Test11 {
    public static void main(String[] args) {
        processExceptions();

    }

    public static void processExceptions() {
        try {
            method1();
            method2();
            method3();
        } catch (NullPointerException | ArithmeticException | IndexOutOfBoundsException e) {
printStack(e);
        }
    }

    public static void printStack(Throwable trws) {
        StackTraceElement [] met1 = trws.getStackTrace();
        for (StackTraceElement stackTraceElement : met1) {
            System.out.println(stackTraceElement);
        }

    }

    public static void method1() {
        throw new NullPointerException();
    }

    public static void method2() {
        throw new ArithmeticException();
    }

    public static void method3() {
        throw new IndexOutOfBoundsException();
    }
}

