package com.company.Lesson20;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 3/31/2017.
 */
/*
///* Исключение при работе с коллекциями List
//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//List<String> list = new ArrayList<String>();
//String s = list.get(18);
//*/
public class Test05 {
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<String>();
            String s = list.get(18);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
