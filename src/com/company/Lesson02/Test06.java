package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by plkff on 11/18/2016.
 */ // BR - 2 numbers - min
public class Test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a < b) {
            System.out.print("Min = " + a);
        } else {
            System.out.println("Min = " + b);
        }
    }

}
