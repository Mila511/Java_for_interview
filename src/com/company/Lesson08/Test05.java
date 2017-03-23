package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/6/2017.
 * Создать список из строк
 * Вводить и добавлять в него строки, пока не введена пустая строка
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nonempty= new ArrayList<>();
        while(true){
            String s = reader.readLine();
            if (s.isEmpty())break;
            nonempty.add(Integer.parseInt(s));
        }
    //if(number % 2 == 0)


        for (Integer i:nonempty  ) {
            System.out.println(i);

        }

    }
}
