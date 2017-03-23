package com.company.Lesson02;

/**
 * Created by plkff on 11/18/2016.
 */
public class Test04_IfElse {
    public static void main(String[] args) {
        int a = 15;
        int b = 15;

        if(a > b){
            System.out.println("Max is " + a);
        } else if(a < b){
            System.out.println("Max is " + b);
        } else {
            System.out.println("Equals");
        }
    }
}
