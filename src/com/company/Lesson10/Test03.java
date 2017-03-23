package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/20/2017.
 */
/* Удвой слова
1. Введи с клавиатуры 5 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/
public class Test03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> words = createList();
        words = doubleValues(words);
        for (int i = 0; i < words.size(); i++) {

            System.out.println(words.get(i));

        }
    }
    public static List createList() throws IOException {
        List<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            words.add(reader.readLine());
        }
        return words;
    }

    public static List doubleValues(List<String> list) {
        List<String> words2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            words2.add(list.get(i));
            words2.add(list.get(i));

        }
        return words2;

    }

}

