package com.company.Lesson07_Arrays1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by plkff on 12/23/2016.
 */
public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(); // int[] list = new int[-]
        System.out.println(list1.size());

        list1.add(45); // list[1] = 45; -       // Dobavlenie
        list1.add(65); // list[2] = 65; -
        list1.add(0, 231); // list[0] = 231;   // Vstavka

        System.out.println(list1.size());  // list.length;

        list1.set(1, 234); // list[1] = 234;

        System.out.println(list1.size());

        list1.remove(2);

        System.out.println(list1.size());

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
