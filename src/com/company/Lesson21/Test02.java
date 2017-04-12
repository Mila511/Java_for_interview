package com.company.Lesson21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 4/7/2017.
 */
  /* Задача по алгоритмам
//        Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
//        Пример ввода:
//        Вишня
//        1
//        Боб
//        3
//        Яблоко
//        2
//        0
//        Арбуз
//        Пример вывода:
//        Арбуз
//        3
//        Боб
//        2
//        Вишня
//        1
//        0
//        Яблоко
//        */
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> liststr = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            liststr.add(s);
        }
        String[] toarr = liststr.toArray(new String[liststr.size()]);
        //       isgreat(s1, s2);
        //     isnmb(s1);
        //   sortnew(String[]toarr, s);
    }

    public static boolean isgreat(String s1, String s2) {
        return s1.compareTo(s2) > 0;
    }


    public static boolean isnmb(String s1) {
        try {
            Integer.parseInt(s1);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void sortnew(String[] toarr, String s) {
        for (int i = 0; i < toarr.length; i++) {
            String s1 = toarr[i];
            if (!isnmb(s1)) {//str
                for (int j = i + 1; j < toarr.length; j++) {
                    String s2 = toarr[j];
                    if (!isnmb(s2)) {//str

                        if (!isgreat(s1, s2)) {//стр возрас

                        }
                    }
                }
            } else {
//                for (int j = 0; j <; j++) {
////                    if(){
////                        if(   ){
////
////                        }
////                    }
//                }
            }
        }

    }
}

