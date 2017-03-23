package com.company.Lesson12;

import java.util.*;

/**
 * Created by Mila on 2/5/2017.
 */
public class Test03 {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (Integer i : list) {

            System.out.println(i);
        }

        System.out.println("============================");

        Set<Integer> set = new HashSet();
        set.add(3);
        set.add(4);
        for (Integer i : set) {
            System.out.println(i);
        }
        System.out.println("============================");

        Map<Integer, String> map = new HashMap();
        map.put(1, "A");
        map.put(2, "B");
        for (Map.Entry<Integer, String> j : map.entrySet()) {
            System.out.println(j);
        }


    }
}
