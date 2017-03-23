package com.company.Lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Mila on 2/24/2017.
 */
/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
При помощи метода  removeAllNumbersMoreThan10 удалить из множества все числа больше 10.
*/
public class Test11_1 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Set<Integer> more10 = new HashSet<>();
        for (int i = 0; i < 10; i++) {

            more10.add(Integer.parseInt(reader.readLine()));

        }

        removeAllNumbersMoreThan10(more10);
    }

    public static void removeAllNumbersMoreThan10(Set<Integer> more10) {

        Iterator<Integer> itermore10 = more10.iterator();
        while (itermore10.hasNext()) {
            if (itermore10.next() > 10) {
                itermore10.remove();

            }

        }
        for (Integer integer : more10) {
            System.out.println(integer);
        }

        //while (itermore10.hasNext()){
        //    System.out.println(itermore10.next());
       // }
     //   while (itermore10.hasNext()) {
     //       System.out.println(itermore10);
    //    }
    }
}
