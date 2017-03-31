package com.company.Lesson19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mila on 3/30/2017.
 * //
 */
//сорт в возраст порядке
public class Test07 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] increase = new int[10];
        for (int i = 0; i < increase.length; i++) {
            increase[i] = Integer.parseInt(reader.readLine());

        }


        for (int i = 0; i < increase.length - 1; i++) {
            for (int j = 0; j < increase.length - 1; j++) {
                if (increase[j] > increase[j + 1]) {
                    int max = increase[j];
                    increase[j] = increase[j + 1];
                    increase[j + 1] = max;
                }
            }
        }

        for (int i : increase) {
            System.out.println(i);
        }

    }
}
