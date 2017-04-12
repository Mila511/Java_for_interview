package com.company.Lesson21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 4/12/2017.
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
public class Test02_1 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // List<String> strlist = new ArrayList<>();
        List<String> strlist = new ArrayList<>();
        strlist.add("Вишня");
        strlist.add("1");
        strlist.add("Боб");
        strlist.add("3");
        strlist.add("Яблоко");
        strlist.add("2");
        strlist.add("0");
        strlist.add("Арбуз");

//        while (true) {
//            String instr = reader.readLine();
//            if (instr.isEmpty()) {
//                break;
//            } else {
//                strlist.add(instr);
//            }
//        }
        String[] strarr = strlist.toArray(new String[strlist.size()]);
        sortarr(strarr);
        for (String s : strarr) {
            System.out.println(s);
        }
    }

    public static void sortarr(String[] strarr) {
        int countW = 0;
        int countN = 0;
        for (int i = 0; i < strarr.length; i++) {
            if (isnumber(strarr[i])) {
                countN++;
            } else {
                countW++;
            }
        }
        String[] arrW = new String[countW];
        String[] arrN = new String[countN];
        countN = countW = 0;
        for (int i = 0; i < strarr.length; i++) {
            if (isnumber(strarr[i])) {
                arrN[countN] = strarr[i];
                countN++;
            } else {
                arrW[countW] = strarr[i];
                countW++;
            }
        }
    }

    public static boolean isGreaterThen(String s1, String s2) {
        return s1.compareTo(s2) > 0;
    }

    public static boolean isnumber(String s) {
        if (s.length() == 0) return false;
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c) && c != '-') return false;
        }
        return true;
    }
}

