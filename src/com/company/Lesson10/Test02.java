package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/20/2017.
 */
/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Integer> num10 = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            num10.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = num10.size()-1; i >= 0  ; i--) {
            System.out.println(num10.get(i));
        }
    }


}
