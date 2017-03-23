package com.company.Lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mila on 2/5/2017.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {

        int[] mass5 = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            mass5[i] = Integer.parseInt(reader.readLine());

        }
        sort(mass5);
        for (int i : mass5) {
            System.out.println(i);
        }

    }

    public static void sort(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    max = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = max;

                }
            }
        }
    }
}
