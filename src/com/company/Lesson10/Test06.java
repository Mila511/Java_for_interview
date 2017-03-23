package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/27/2017.
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
public class Test06 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> stroki = new ArrayList<>();
        while (true){
            String s = reader.readLine();
            if(s.isEmpty()) break;
            stroki.add(s);
        }
        List<String> strx2x3 = new ArrayList<>();

        for (int i = 0; i < stroki.size(); i++) {
            if (stroki.get(i).length()%2==0){
                strx2x3.add(stroki.get(i) + " " + stroki.get(i));
            }
            if (stroki.get(i).length()%2>0) {
                strx2x3.add(stroki.get(i) + " " + stroki.get(i) + " " + stroki.get(i));
            }

        }
        for (int i = 0; i < strx2x3.size() ; i++) {
            System.out.println(strx2x3.get(i));
        }

    }
}
