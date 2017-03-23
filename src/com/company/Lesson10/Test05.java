package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/27/2017.
 */
/* Максимальное и минимальное числа в массиве
Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/
public class Test05 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Integer> num10 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            num10.add(Integer.parseInt(reader.readLine()));

        }
       int minnum10 = num10.get(0);
       int maxnum10 = num10.get(0);
        for (int i = 0; i < num10.size(); i++) {
            if (num10.get(i) < minnum10) {
                minnum10 = num10.get(i);
            }
            if (num10.get(i) > maxnum10) {
                maxnum10 = num10.get(i);


            }


        }
        System.out.println(maxnum10 + " " + minnum10);
    }

}
