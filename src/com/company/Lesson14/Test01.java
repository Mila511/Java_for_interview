package com.company.Lesson14;

import java.util.Date;

/**
 * Created by Mila on 2/16/2017.
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        Date startDate = new Date();

        Thread.sleep(3000);

        Date endDate = new Date();

        long msDistance = endDate.getTime() - startDate.getTime();
        System.out.println(msDistance);
    }
}
