package com.company.Lesson12;

import java.util.*;

/**
 * Created by Mila on 2/12/2017.
 */
public class Test05_2 {
    public static void main(String[] args) {

        List<Integer> lisa = new ArrayList<>();
        lisa.add(1);
        lisa.add(2);

        Iterator<Integer> i_lisa = lisa.iterator();
        while (i_lisa.hasNext()){
            System.out.println(i_lisa.next());
        }

        System.out.println("=======================================");

        Set<Integer> seta = new HashSet<>();
        seta.add(3);
        seta.add(4);
        Iterator<Integer> i_seta = seta.iterator();
        while (i_seta.hasNext()){
            System.out.println(i_seta.next());

        }
        System.out.println("===========================================");

        Map<Integer, String> mapa = new HashMap<>();
        Iterator<Map.Entry<Integer, String>> i_mapa = mapa.entrySet().iterator();
        while (i_mapa.hasNext()){
            System.out.println(i_mapa.next());
            System.out.println(i_mapa.next().getKey()+" - "+i_mapa.next().getValue());
        }


    }


}
