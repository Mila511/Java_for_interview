package com.company.Lesson07_Arrays1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 5 различных строчек в списке
 * 1. Создай список строк.
 * 2. Добавь в него 5 различных строчек.
 * 3. Выведи его размер на экран.
 * 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
 */

public class Test05 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        public static void main(String[] args) throws IOException {
            List<String> stroki5 = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                stroki5.add(reader.readLine());

            }
            System.out.println(stroki5.size());
            for (int i = 0; i < stroki5.size(); i++) {
                System.out.println(stroki5.get(i));

            }
    }
}
