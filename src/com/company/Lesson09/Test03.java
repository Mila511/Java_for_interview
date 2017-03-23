package com.company.Lesson09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mila on 1/13/2017.
 */
public class Test03 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 45, 32, 45, 65, 76);
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 45, 32, 45, 65, 76);

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);

        for (Integer integer : list3) {
            System.out.println(integer);
        }
    }
}
