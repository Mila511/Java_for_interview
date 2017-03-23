package com.company.Lesson02;

/**
 * Created by plkff on 11/18/2016.
 */// method0 - kvadrat
// method1 - convert usd -> uah ( 27.02 )
// method2 - 10 -> 11
// method3 - print string 4 times
public class Test02 {
    public static void main (String [] args) {
        System.out.println(kvad(10));
        System.out.println(griv(10));
        System.out.println(plus10per(10));
        prinx4("text");
    }


    public static double kvad(double a) {
        double c=a*a;
        return c;
    }

    public static double griv(double a) {
        double c=a*27.02;
        return c;
    }

    public static double plus10per(double a) {
        double c=a+a*0.1;
        return c;
    }

    public static void prinx4 (String x4) {
        System.out.println(x4);
        System.out.println(x4);
        System.out.println(x4);
        System.out.println(x4);
    }
}
