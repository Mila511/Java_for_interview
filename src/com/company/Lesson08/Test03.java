package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/6/2017.
 */
/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Test03 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> fivestr = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            fivestr.add(reader.readLine());


        }
        for (int i = 0; i < 13; i++) {
            String tras  = fivestr.remove(4);
            fivestr.add(0,tras);
        }

        for (String s : fivestr) {
            System.out.println(s);
        }
    }
}
