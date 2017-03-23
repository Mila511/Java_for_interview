package com.company.Lesson14;

import java.util.Date;

/**
 * Created by Mila on 2/16/2017.
 */
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        Date strtdate = new Date();
        Thread.sleep(2500);
        Date enddate = new Date();
        System.out.println(enddate.getTime() - strtdate.getTime());
    }
}
