package com.company.Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/13/2017.
 *///Удаление всех чисел больше 5
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Integer> more5 = new ArrayList<>();
        while (true) {
            String nmb = reader.readLine();

            if (nmb.isEmpty()) {
                break;
            }
            more5.add(Integer.parseInt(nmb));

        }

//        for (; true ;) {
//            break;
//        }

        for (int i = 0; i < more5.size();) { // 3 7 9 1 56 -> 3 9 1 56
            if (more5.get(i) > 5) {
                more5.remove(i);
            } else {
                i++;
            }
        }
        for (int i = 0; i < more5.size(); i++) {
            System.out.println(more5.get(i));
        }
    }

}

