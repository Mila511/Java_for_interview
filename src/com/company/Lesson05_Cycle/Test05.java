package com.company.Lesson05_Cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/
public class Test05 {
    public static void main (String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= a; i++){
            System.out.println();
            for (int j = 1; j <=b; j++){
                System.out.print("8");
            }
        }

    }
}
