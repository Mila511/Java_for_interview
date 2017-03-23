package com.company.Lesson013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mila on 2/14/2017.
 */
/* Максимальное среди массива на 10 чисел
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/
public class Test06 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] arrayN = initializeArray(10);
        int maxval = max(arrayN);
        System.out.println(maxval);
    }

    private static int[] initializeArray(int n) throws IOException {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(reader.readLine());

        return array;
    }

    private static int max(int[] array) {
        int mx = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mx) {
                mx = array[i];
            }
        }
        return mx;
    }
}

