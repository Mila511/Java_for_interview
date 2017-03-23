package com.company.Lesson07_Arrays1;

/* Самая длинная строка

 1. Создай список строк.
 2. Считай с клавиатуры 5 строк и добавь в список.
 3. Используя цикл, найди самую длинную строку в списке.
 4. Выведи найденную строку на экран.
 5. Если таких строк несколько, выведи каждую с новой строки.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test06 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> maxistr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
          maxistr.add(reader.readLine());
        }
        int maxilength = 0;

            for (int i = 0; i < 5 ; i++) {
            if (i == 0) {
                    maxilength = maxistr.get(i).length();
            }else
                if (i>0 && maxistr.get(i).length() >= maxilength) {

                    maxilength = maxistr.get(i).length();
            }
        }

                for (int i = 0; i < maxistr.size(); i++) {
                if(maxistr.get(i).length() == maxilength){

                    System.out.println(maxistr.get(i));
                }
        }
    }
}






