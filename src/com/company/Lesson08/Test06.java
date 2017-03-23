package com.company.Lesson08;

/**
 * Created by Mila on 1/6/2017.
 * <p>
 * Created by Mila on 1/6/2017.
 * Создать список из строк
 * Вводить и добавлять в него строки, пока не введена пустая строка
 */
/**
 * Created by Mila on 1/6/2017.
 * Создать список из чисел\строк
 * Вводить и добавлять в него числа\строки, пока не введена пустая строка
 * чётные числа добавляются в конец списка, нечётные – в начало.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test06 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Integer> chetnechet = new ArrayList<>();
        while (true) {
            System.out.println("ВВЕДИТЕ ЦЕЛОЕ ЧИСЛО : ");
            String nmb = reader.readLine();
               if (nmb.isEmpty()){
                System.out.println("ВВОД ОКОНЧЕН ! ");
                   System.out.println("РЕЗУЛЬТАТ : ");
                break;
            }
            int x = Integer.parseInt(nmb);
            if (x % 2 == 0) {
                chetnechet.add(x);
           } else {
                chetnechet.add(0, x);
            }
        }
        for (Integer i : chetnechet) {
            System.out.println(i);
        }
    }
}
