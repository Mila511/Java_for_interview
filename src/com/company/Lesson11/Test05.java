package com.company.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 2/3/2017.
 */
/* Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/
public class Test05 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> str = new ArrayList<>();
        while (true) {
            String str1 = reader.readLine();
            if (str1.isEmpty()) break;
            str.add(str1);

        }
        List<String> strx2x3 = new ArrayList<>();
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() % 2 == 0) {
                strx2x3.add(str.get(i) + " " + str.get(i));

            } else {
                strx2x3.add(str.get(i) + " " + str.get(i) + " " + str.get(i));

            }


        }
        for (int i = 0; i < strx2x3.size(); i++) {
            System.out.println(strx2x3.get(i));
        }
    }
}
