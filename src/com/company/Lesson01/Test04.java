package com.company.Lesson01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Created by plkff on 11/11/2016.
 */
//hrthrthrth

public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String w = reader.readLine();
        System.out.println(w);

        int number = Integer.parseInt(reader.readLine());
        System.out.println(number * number);

    }

}
