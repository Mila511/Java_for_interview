package com.company.Lesson02;

/**
 * Created by plkff on 11/24/2016.
 */
public class Test08 {

    public static void main(String[] args){
        int b = 50;
        int c = 100;
        int a = 30;

        System.out.println("Число " + checkinterval(a, b ,c) + " содержится в интервале.");
    }

    public static String checkinterval(int a, int b, int c) {
        String s = null;
         if (a >= b && a <= c) {
             s = "";
 //            System.out.println("Число " + a + " не содержится в интервале.");
        } else {
             s =  "не";
 //            System.out.println("Число " + a + " содержится в интервале.");
        }
       return s;
    }
}




