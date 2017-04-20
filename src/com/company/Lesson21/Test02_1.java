package com.company.Lesson21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//import static com.company.Lesson21.Test02_1.sorty;

/**
 * Created by Mila on 4/19/2017.
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
    public static void main(String[] args) {
        String[] arr = {"Вишня", "1", "Боб", "3", "Яблоко", "2", "0", "Арбуз"};
        sorty(arr);
        for (String s : arr)
            System.out.println(s);
    }
    static boolean isNumber(String incomingString) {  // проверка на Число/Строка
        try {
            Integer.parseInt((String) incomingString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public static String[] sorty (String arr[]) {// СОРТИРОВКИ
        int nmbcount = 0;
        int strcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isNumber(arr[i].toString())) {
                nmbcount++;
            } else {
                strcount++;
            }
        }
        Integer[] nmbarr = new Integer[nmbcount];
        List<String> liststrarr = new ArrayList<>();
        nmbcount = -1;
        strcount = -1;
        for (int i = 0; i < arr.length; i++) {
            if (isNumber(arr[i].toString())) {// числа складываем в []
                nmbcount++;
                nmbarr[nmbcount] = (Integer.parseInt(arr[i]));
            } else {// НЕчисла складываем в List
              liststrarr.add(arr[i]);
            }
        }
//======================================================================
        int minnmb = nmbarr[0];
        for (int i = 0; i < nmbarr.length - 1; i++) {
            for (int j = 0; j < nmbarr.length - 1; j++) {// сортировка [] чисел по убыванию
                if (nmbarr[j] < nmbarr[j + 1]) {
                    minnmb = nmbarr[j];
                    nmbarr[j] = nmbarr[j + 1];
                    nmbarr[j + 1] = minnmb;
                }
            }
        }
//==========================================================================

        String maxstrlist = "";
        for (int i = 0; i < liststrarr.size() - 1; i++) {//  сортировка List строк по возрастанию
            for (int j = 0; j < liststrarr.size() - 1; j++) {
                if (liststrarr.get(j).compareTo(liststrarr.get(j + 1)) < 0) {
                } else {
                    maxstrlist = liststrarr.get(j);
                    liststrarr.remove(j);
                    liststrarr.add(maxstrlist);
                }
            }
        }
        //===========================================================
        for (int i = 0; i < arr.length; i++) { //из List<String> и int [] -> в старый String массив в Новом порядке
            if (isNumber(arr[i])) {
                while (nmbarr[i] != 0) {
                    arr[i] = nmbarr[i].toString();
                    nmbarr[i] = 0;
                }
            } else {
                arr[i] = liststrarr.get(0);
                liststrarr.remove(0);
            }
        }
        return arr;
    }
}

