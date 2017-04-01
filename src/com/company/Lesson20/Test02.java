package com.company.Lesson20;

/**
 * Created by Mila on 3/31/2017.
 */
///* Исключение при работе с числами
//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//int a = 42 / 0;
//*/
public class Test02 {
    public static void main(String[] args) {
        try {

            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getSuppressed());
        }
    }
}
