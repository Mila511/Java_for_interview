package com.company.Lesson18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



/**
 * Created by Mila on 3/17/2017.
 */
//  /* Задача по алгоритмам
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
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> symbols = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            symbols.add(reader.readLine());
        }

        String[] array = symbols.toArray(new String[symbols.size()]);

    }

    public static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
