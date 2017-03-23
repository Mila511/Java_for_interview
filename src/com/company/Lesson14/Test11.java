package com.company.Lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Mila on 2/17/2017.
 */
/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
При помощи метода  removeAllNumbersMoreThan10 удалить из множества все числа больше 10.
*/
public class Test11 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Set<Integer> num10 = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            num10.add(Integer.parseInt(reader.readLine()));
        }

        removeAllNumbersMoreThan10(num10);

    }

    public static void removeAllNumbersMoreThan10(Set<Integer> num10) {
        Iterator<Integer> iternum10 = num10.iterator();
        while (iternum10.hasNext()) {
            //Integer num = iternum10.next();
            if (iternum10.next() > 10) {
                iternum10.remove();
            }
        }

        for (Integer integer : num10) {
            System.out.println(integer);
        }
        }

    }
