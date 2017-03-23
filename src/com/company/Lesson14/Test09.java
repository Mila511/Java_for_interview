package com.company.Lesson14;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mila on 2/17/2017.
 */
/* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
*/
public class Test09 {
    public static void main(String[] args) {
        List arrlst = new ArrayList();
        LinkedList linkedlst = new LinkedList();
        adding(arrlst);
        adding(linkedlst);
        System.out.println(getTimeMsOfGet(arrlst));
        System.out.println(getTimeMsOfGet(linkedlst));


    }

    public static void adding (List list) {
        for (int i = 0; i < 10_0000 ; i++) {


            list.add(i);
        }
    }

    public static long getTimeMsOfGet(List list) {
        Date strtdate = new Date();
        get10T(list);
        Date fnshdate = new Date();
        long delta = fnshdate.getTime() - strtdate.getTime();
        return delta;
    }


    public static void get10T(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }
}
