package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/6/2017.
 */
/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> minstr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            minstr.add(reader.readLine());

        }

        int minl = minstr.get(0).length();
        for (int i = 1; i < 5; i++) {
            if (minstr.get(i).length() < minl) {
                minl = minstr.get(i).length();
            }
        }

        for (int i = 0; i < minstr.size(); i++) {
            if (minstr.get(i).length() == minl) {
                System.out.println(minstr.get(i));
            }
        }
    }


}

