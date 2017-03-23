package com.company.Lesson12;

import java.util.*;

/**
 * Created by Mila on 2/5/2017.
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        Iterator<Integer> iterator1 = list.iterator();
        while(iterator1.hasNext()){
            Integer num = iterator1.next();
            System.out.println(num);
        }

        System.out.println("============================");

        Set<Integer> set = new HashSet();
        set.add(3);
        set.add(4);

        Iterator<Integer> iterator2 = set.iterator();
        while(iterator2.hasNext()){
            Integer num = iterator2.next();
            System.out.println(num);
        }
        System.out.println("============================");

        Map<Integer, String> map = new HashMap();
        map.put(1, "A");
        map.put(2, "B");

        Iterator<Map.Entry<Integer, String >> iterator3 = map.entrySet().iterator();
        while(iterator3.hasNext()){
            Map.Entry<Integer, String> entry = iterator3.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }
}
