package com.company.Lesson07_Arrays1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * ввести 10 строк с клавиатуры и вывести их на экран в обратном порядке.
 */
public class Test04 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        List<String> strokilist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strokilist.add(reader.readLine());

        }
        for (int i = strokilist.size()-1; i >= 0 ; i--) {
            System.out.println(strokilist.get(i));
        }
    }

}
