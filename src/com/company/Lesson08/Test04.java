package com.company.Lesson08;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/6/2017.
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        while(true){
            String s = reader.readLine();
            if(s.isEmpty()) break;
            list.add(s);
        }

        for (String ss : list) {
            System.out.println(ss);
        }

        System.out.println("-------------------------------");

        while(true){
            String s1 = reader.readLine();
            if(s1.isEmpty()) break;
            list1.add(Integer.parseInt(s1));
        }

        for (Integer i : list1) {
            System.out.println(i);
        }

    }
}
