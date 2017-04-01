package com.company.Lesson20;

/**
 * Created by Mila on 3/31/2017.
 * //
 *//* Исключение при работе со строками
//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//String s = null;
//String m = s.toLowerCase();
//*/
public class Test03 {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();

        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
