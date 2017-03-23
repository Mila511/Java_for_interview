package com.company.Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/13/2017.
 */
/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/
public class Test04 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Integer> lists = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> restlist = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {

            String nmb = reader.readLine();
            lists.add(Integer.parseInt(nmb));
        }
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i) % 3 == 0) {
                list3.add(lists.get(i));
            }
            if (lists.get(i) % 2 == 0) {
                list2.add(lists.get(i));
            }
            if (lists.get(i) % 3 != 0 && lists.get(i) % 2 != 0) {
                restlist.add(lists.get(i));
            }
        }

        printList(list3);
        System.out.println("-------");

        printList(list2);
        System.out.println("-------");

        printList(restlist);

    }

    public static void printList(List anylist) {
        for (int i = 0; i < anylist.size(); i++) {
            System.out.println(anylist.get(i));
        }

    }


}

