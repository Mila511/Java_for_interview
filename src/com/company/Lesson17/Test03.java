package com.company.Lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**ВВести 5 строк и отсорт в алф порядке
 * Created by Mila on 3/16/2017.
 */
public class Test03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] strok5 = new String[5];
        for (int i = 0; i < strok5.length; i++) {
            strok5[i] = reader.readLine();
        }
        sort(strok5);
        for (int i = 0; i < strok5.length ; i++) {
            System.out.println(strok5[i]);
        }

    }

    public static void sort(String[] array) {
        //String [] abcsort = new String[];
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                String s1 = array[i];
                String s2 = array[j];
                if (isGreaterThen(s1, s2)) {
                    array[i] = s2;
                    array[j] = s1;
                }
            }
        }
    }

    public static boolean isGreaterThen(String s1, String s2) { // barsik agaf -> agaf barsik
        return s1.compareTo(s2) > 0;
    }
}
