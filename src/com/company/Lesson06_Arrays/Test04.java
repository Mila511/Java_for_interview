package com.company.Lesson06_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by plkff on 12/16/2016.
 */
public class Test04 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] lines = new String[5];

        for (int i = 0; i < 5; i++) lines[i] = reader.readLine();
        for (int i = 0; i < 5; i++) {
            System.out.println(lines[i]);
        }

        method1();
        }


    public static void method1 () throws IOException {
        int[] numb = new int[5];
        for (int i = 0; i < 5; i++) numb [i] = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 5; i++) {
            System.out.println(numb[i]);

        }

    }

}
