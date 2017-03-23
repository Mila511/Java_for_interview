package com.company.Lesson01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by plkff on 11/11/2016.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String i = reader.readLine();
        System.out.println("Stroka: " + i);

        System.out.println("Enter number:");
        String a = reader.readLine();
        int number = Integer.parseInt(a);
        System.out.println(a.length());
        System.out.println(number*number);
    }
}
