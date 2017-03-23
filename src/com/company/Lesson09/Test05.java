package com.company.Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/13/2017.
 */
/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/
public class Test05 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> words5 = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            String str = reader.readLine();
            words5.add(str);

        }
        words5.remove(2);
        for (int i = words5.size()-1; i >=0; i--) {
            System.out.println(words5.get(i));
        }

    }
}
