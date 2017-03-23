package com.company.Lesson06_Arrays;

/* Максимальное среди массива на 10 чисел
1. В методе initializeArray():
        1.1. Создайте массив на 10 чисел
        1.2. Считайте с консоли 10 чисел и заполните ими массив
        2. Метод max(int[] array) должен находить максимальное число из элементов массива
        */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test08 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] array1 = initializeArray();
        int maxNumber = max (array1);
        System.out.println(maxNumber);
    }

    private static int[] initializeArray() throws IOException {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(reader.readLine());

        return array;
    }

    private static int max(int[] array) {
        int maxx = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxx) {
                maxx = array[i];
            }
        }
        return maxx;
    }
}

