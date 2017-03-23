package com.company.Lesson02;

/**
 * Created by plkff on 11/18/2016.
 */
public class Test05_IfElse {
    public static void main(String[] args) {
        int a = 47;
        int b = 27;
        // < > ==
        // && - AND true true
        // || - OR true false

        if (a > 50 && a < 100) {
            System.out.println("Ok");
        } else {
            System.out.println("Not");
        }

        if (b < 50 || b > 100) {
            System.out.println("Ok");
        } else {
            System.out.println("Not");
        }
    }
}
