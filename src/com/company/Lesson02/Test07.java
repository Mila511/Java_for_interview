package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by plkff on 11/18/2016.
 */// BR - 3 numbers - min
public class Test07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a < b && a < c) {
            System.out.println("Min=" + a);

        } else if (b < a && b < c) {
            System.out.println("Min=" + b);
        } else if (c < a && c < b) {
            System.out.println("Min=" + c);

        }
    }
}


