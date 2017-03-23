package com.company.Lesson07_Arrays1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * /* 2 массива
 1. Создать массив на 10 строк. [0] = "text"
 2. Создать массив на 10 чисел. [0] = 4
 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 4. В каждую ячейку массива чисел записать длину строки
 из массива строк, индекс/номер ячейки которой совпадает
 с текущим индексом из массива чисел. Вывести содержимое
 массива чисел на экран, каждое значение выводить с новой строки.
 */

public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
//        String a = "jkbekjfbrjke";
//        System.out.println(a.length());
        String [] stroki = new String[10];
        int [] numbers = new int [10];
        for (int i = 0; i < stroki.length; i++) {
            stroki [i] = reader.readLine();

        }
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = stroki[i].length();

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(stroki[i] + " - " +numbers [i]);
        }
    }



}
