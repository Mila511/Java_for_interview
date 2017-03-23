package com.company.Lesson12;

import java.util.*;

/**
 * Created by Mila on 2/9/2017.
 */
public class Test5_1 {
    public static void main(String[] args) {
        List<Integer> lis = new ArrayList<>();
        lis.add(11);
        lis.add(22);
        Iterator<Integer> i_lis = lis.iterator();
        while (i_lis.hasNext()) {
            System.out.println(i_lis.next());
        }
        System.out.println("============================");
        Set<Integer> se = new HashSet<>();
        se.add(33);
        se.add(44);
        Iterator<Integer> i_se = se.iterator();
        while (i_se.hasNext()) {
            System.out.println(i_se.next());
        }
        System.out.println("============================");
        Map<Integer, String> ma = new HashMap<>();
        ma.put(55, "66");
        ma.put(77, "88");
        Iterator<Map.Entry<Integer, String>> i_ma = ma.entrySet().iterator();
        while (i_ma.hasNext()) {
            Map.Entry<Integer, String> n_ma = i_ma.next();
            System.out.println(n_ma.getKey() + "=" + n_ma.getValue());
        }
    }
}
