package com.company.Lesson05_Cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.
*/
public class Test10 {
    public static void main (String[] args)throws IOException {
        int a = 0;
        int s = 0;
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            a = Integer.parseInt(reader.readLine());
            s = s + a;
        }

        while (a != -1);
        System.out.println(s);
    }


}
