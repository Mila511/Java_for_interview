package com.company.Lesson12;

import java.util.*;

/**
 * Created by Mila on 2/5/2017.
 */
public class Test05 {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(11);
        lst.add(22);
        Iterator<Integer> i_lst = lst.iterator();
        while (i_lst.hasNext()){
           // int tran = i_lst.next();
            System.out.println(i_lst.next());
        }
        System.out.println("=================");

        Set<Integer> st = new HashSet();
        st.add(33);
        st.add(44);
        Iterator<Integer> i_st = st.iterator();
        while (i_st.hasNext()){
            System.out.println(i_st.next());
        }
        System.out.println("=================");

        Map<Integer, String> mp = new HashMap<>();
        mp.put(55, "66");
        mp.put(77,"88");
        Iterator<Map.Entry<Integer, String>> i_mp = mp.entrySet().iterator();
        while (i_mp.hasNext()){
            System.out.println(i_mp.next());
        }


        
    }



}
