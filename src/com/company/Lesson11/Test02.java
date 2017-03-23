package com.company.Lesson11;

/**
 * Created by Mila on 2/3/2017.
 */
public class Test02 {
    public static void main(String[] args) {
        int a = 5; // 7
        int b = 7; // 9
        int c = 9; // 5
        int tran = a;
        a = b;
        b = c;
        c = tran;
        System.out.println("a=" + a + " b=" + b + " c=" + c);

    }
}
