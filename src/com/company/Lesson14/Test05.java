package com.company.Lesson14;

import java.util.Date;

/**
 * Created by Mila on 2/16/2017.
 */
public class Test05 {
    public static void main(String[] args) {
        Date nowday = new Date();
        Date newyear = new Date();
        newyear.setDate(1);
        newyear.setMonth(0);
        newyear.setHours(0);
        newyear.setMinutes(0);
        newyear.setSeconds(0);

        long msDelay = nowday.getTime() - newyear.getTime();
        System.out.println(msDelay/1000/60/60/24);
    }
}
