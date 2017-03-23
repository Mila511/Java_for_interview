package com.company.Lesson05_Cycle;

/**
 * Created by plkff on 12/9/2016.
 */
public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            System.out.println("text " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println(j);
            }
        }


        System.out.println("-------------");

        int a = 0;
        while(a < 10){
            System.out.println("text " + a);
            a++;
        }
        System.out.println("-------------");

        int b = 0;
        do{
            System.out.println("text " + b);
            b++;
        }while (b < 10);


    }
}
