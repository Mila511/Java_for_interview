package com.company.Lesson14;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mila on 2/17/2017.
 */
/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/
public class Test08 {
    public static void main(String[] args) {
        List arrlst = new ArrayList();
        LinkedList linkedlst = new LinkedList();
        System.out.println(getTimeOfInsert(linkedlst));
        System.out.println(getTimeOfInsert(arrlst));

       // ins10T(arrlst);

    }

    public static long getTimeOfInsert(List list) {
        Date strtdate = new Date();
        ins10T(list);
        Date fnshdate = new Date();
        long delta = fnshdate.getTime() - strtdate.getTime();
        return delta;
    }


    public static void ins10T(List list) {
        for (int i = 0; i < 50_0000; i++) {
            list.add(0,new Object());
        }
    }
}
