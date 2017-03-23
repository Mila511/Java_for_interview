package com.company.Lesson19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mila on 3/23/2017.
 * //
 *//* Задача по алгоритмам
//Задача: Введи с клавиатуры 10 слов и выведи их в алфавитном порядке.
//*/
public class Test01 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] words10 = new String[5];

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            words10[i] = s;
        }

        sort(words10);

        for (int i = 0; i < words10.length; i++) {
            System.out.println(words10[i]);

        }

    }

    public static void sort(String[] words10) {
        for (int i = 0; i < words10.length; i++) {
            for (int j = 0; j < words10.length - 1; j++) {
                if (isGreaterThen(words10[j+1], words10[j])) {
                    String temp = words10[j];
                    words10[j] = words10[j + 1];
                    words10[j + 1] = temp;
                }
            }
        }
    }

    public static boolean isGreaterThen(String now, String next) {
        return next.compareTo(now) > 0;
    }


}
