package com.company.Lesson18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Mila on 3/17/2017.
 */
///* Номер месяца
//Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
//Используйте коллекции.
//*/
// */
//        map.put("January",1);
//        map.put("February",2);
//        map.put("March",3);
//        map.put("April",4);
//        map.put("May",5);
//        map.put("June",6);
//        map.put("July",7);
//        map.put("August",8);
//        map.put("September",9);
//        map.put("October",10);
//        map.put("November",11);
//        map.put("December",12);

public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);

        checking(map);
    }

    public static void checking(Map<String, Integer> map) throws IOException {

        String nmonth =  reader.readLine();
        Iterator<Map.Entry<String, Integer>> iternm = map.entrySet().iterator();
        while (iternm.hasNext()) {
            Map.Entry<String, Integer> para = iternm.next();
            if (nmonth.equals(para.getKey())) {
                System.out.println(para.getKey() + " is " + para.getValue() + " month");
            }
        }

    }


}
