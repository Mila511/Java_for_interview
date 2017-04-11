package com.company.Lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 4/6/2017.
 */
///* Метод в try..catch
//Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
//Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader-а)
//этого метода в try..catch.
//Если пользователь ввёл какой-то текст, вместо ввода числа,
//то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
//Числа выводить с новой строки сохраняя порядок ввода.
//*/
public class Test14 {
    public static void main(String[] args) throws IOException {
        readData();
    }

    public static void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbs = new ArrayList<>();
        try {
            while (true) {
                String snumbs = reader.readLine();

                if (snumbs.isEmpty()) {
                    break;
                }

                numbs.add(Integer.parseInt(snumbs));
            }

        } catch (NumberFormatException e) {
            for (Integer numb : numbs) {

                System.out.println(numb);
            }
        }
    }
}

