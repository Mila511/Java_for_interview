package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/6/2017.
 */
/* 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> tenstr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            tenstr.add(0, reader.readLine());
        }
        for (int i = 0; i < tenstr.size(); i++) {
            System.out.println(tenstr.get(i));
        }

    }
}
