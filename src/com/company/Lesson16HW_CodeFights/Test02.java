package com.company.Lesson16HW_CodeFights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**по убыванию
 * Created by Mila on 3/10/2017.
 */
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] num5 = new int[5];
        for (int i = 0; i < num5.length; i++) {
            num5[i] = Integer.parseInt(reader.readLine());
        }
        sortdecrease(num5);
        for (int i : num5) {
            System.out.println(i);
        }
    }


    public static void sortdecrease(int[] num5) {
        int[] sortnum5 = new int[5];
        int min = num5[0];
        for (int i = 0; i < num5.length - 1; i++) {
            for (int j = 0; j < num5.length - 1; j++) {
                if (num5[j] < num5[j + 1]) {
                    int trans = num5[j];
                    num5[j] = num5[j + 1];
                    num5[j + 1] = trans;
                }

            }


        }
    }
}
