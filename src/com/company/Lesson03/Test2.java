package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Реализовать метод closeToTen.
 * Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
 * Например, среди чисел 8 и 11 ближайшее к десяти 11.
 * Если оба числа на равной длине к 10, то вывести на экран любое из них.
 * Created by plkff on 11/25/2016.
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        closer(a, b);
    }

    public static void closer(int a, int b) { // 15 21
        int dest1 = abs(10 - a); // - 5
        int dest2 = abs(10 - b); // - 11

        if (dest1 < dest2) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }

    private static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}

