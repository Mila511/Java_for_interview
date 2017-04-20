package com.company.Lesson21;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 4/19/2017.
 */
public class Test00001 {
    public static void main(String[] args) {
        String[] strarr = {"Вишня", "Яблоко", "Боб", "Арбуз"};

        String maxstr = "";
        for (int i = 0; i < strarr.length - 1; i++) {
            for (int j = 0; j < strarr.length - 1; j++) {
                if (strarr[j].compareTo(strarr[j + 1]) > 0) {
                    maxstr = strarr[j];
                    strarr[j] = strarr[j + 1];
                    strarr[j + 1] = maxstr;

                }
            }

        }
        for (String s : strarr
                ) {


            System.out.println(s);
        }
//================================================================================
        List<String> liststrarr = new ArrayList<>();
        liststrarr.add("Вишня");
        liststrarr.add("Яблоко");
        liststrarr.add("Боб");
        liststrarr.add("Арбуз");


        String maxstrlist = "";
        for (int i = 0; i < liststrarr.size() - 1; i++) {
            for (int j = 0; j < liststrarr.size()-1; j++) {
                if (liststrarr.get(j).compareTo(liststrarr.get(j + 1)) < 0) {
                }else {
                    maxstrlist=liststrarr.get(j);
                    liststrarr.remove(j);
                    liststrarr.add(maxstrlist);


                }
            }

        }
        for (String s : liststrarr
                ) {


            System.out.println("List"+s);
        }



        Integer[] nmbarr = {2, 3, 1, 5};
        int minnmb = nmbarr[0];
        for (int i = 0; i < nmbarr.length - 1; i++) {
            for (int j = 0; j < nmbarr.length - 1; j++) {// сортировка цифровых по убыванию
                if (nmbarr[j] < nmbarr[j + 1]) {
                    minnmb = nmbarr[j];
                    nmbarr[j] = nmbarr[j + 1];
                    nmbarr[j + 1] = minnmb;
                }

            }
        }
        for (int n : nmbarr
                ) {


            System.out.println(n);
        }
    }
}
