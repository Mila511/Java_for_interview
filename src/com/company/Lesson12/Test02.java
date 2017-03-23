package com.company.Lesson12;

import java.util.*;

/**
 * Created by Mila on 2/5/2017.
 * List - ArrayList, LinkedList, Vector(!)
 * Set  - HashSet, TreeSet ( уникальные значения - множество )
 * Map  - HashMap, TreeMap ( набор пар - ключ-значение )
 */
public class Test02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(56);
        list.add(51);
        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("----------------");

        Set<Integer> set = new HashSet<>();
        set.add(56);
        set.add(56);
        set.add(51);
        set.add(59);
        for (Integer integer : set) {
            System.out.println(integer);
        }

        System.out.println("----------------");

        Map<String, Integer> map = new HashMap<>();
        map.put("text1", 50);
        map.put("text1", 55);
        map.put("text3", 50);
        map.put("text4", 50);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
