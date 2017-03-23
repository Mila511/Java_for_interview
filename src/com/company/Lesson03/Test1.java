package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
 * Если число отрицательное, то прибавить единицу. Вывести результат на экран.
 * <p>
 * Created by plkff on 11/25/2016.
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
            // BF

        System.out.println(posneg());

    }

    private static int posneg() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a > 0) {
            a = a * 2;
        } else if (a < 0) {
            a = a + 1;
        }
        return a;
    }
}