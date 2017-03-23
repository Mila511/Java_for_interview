package com.company.Lesson12;

import java.util.*;

/**
 * Created by Mila on 2/5/2017.
 */
public class Test04_1 {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(111);
        lst.add(222);
        Iterator <Integer> i_lst = lst.iterator();
        while (i_lst.hasNext()){
            Integer num = i_lst.next();
            System.out.println(num);
        }
        System.out.println("============================");
        Set<Integer> st = new HashSet();
        st.add(333);
        st.add(444);
        Iterator <Integer> i_st = st.iterator();
        while (i_st.hasNext()){
            Integer numst = i_st.next();
            System.out.println(numst);
        }
        System.out.println("============================");
        Map<Integer, String> mp = new HashMap<>();
        mp.put(555, "555");
        mp.put(6666, "6666");
        Iterator<Map.Entry<Integer, String>> i_mp = mp.entrySet().iterator();
        while (i_mp.hasNext()){
            Map.Entry<Integer, String> nummp = i_mp.next();
            System.out.println(nummp.getKey() + " " + nummp.getValue());
        }
        System.out.println("============================");

    }

}
