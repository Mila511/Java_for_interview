package com.company.Lesson07_Arrays1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * /* Массив из строчек в обратном порядке
 1. Создать массив на 10 строчек.
 2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
 */

public class Test01 {
    static BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
    public static void main(String[] args) throws IOException {
        String [] stroki = new String[10];
        for (int i = 0; i < stroki.length - 2; i++) {
            stroki[i] = reader.readLine();

        }
        for (int i = stroki.length-1; i >=0 ; i--) {

            System.out.println(stroki[i]);
        }
    }

}
