package com.company.Lesson07_Arrays1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * /* Один большой массив и два маленьких
 * 1. Создать массив на 10 чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Создать два массива на 5 чисел каждый.
 * 4. Скопировать большой массив в два маленьких:
 * половину чисел в первый маленький, вторую половину во второй маленький.
 * 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 */

public class Test03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] numbers = new int[10];
        int[] numbers1 = new int[5];
        int[] numbers2 = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());

        }
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = numbers[i];
            numbers2[i] = numbers[i + numbers1.length];
            System.out.println(numbers2[i]);

        }

    }

}

