package com.company.Lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Mila on 3/9/2017.
 */
/* Пять наибольших чисел
Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/
public class Test04 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Integer[] mass10 = new Integer[10];
        for (int i = 0; i < mass10.length; i++) {
            mass10[i] = Integer.parseInt(reader.readLine());
        }
        massort10(mass10);
    }

    public static void massort10(Integer[] mass10) throws IOException {


        Arrays.sort(mass10, Collections.reverseOrder());

        for (int i = 0; i <= 4; i++) {
            System.out.println(mass10[i]);
        }
    }

}

