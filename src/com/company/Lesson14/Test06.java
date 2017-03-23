package com.company.Lesson14;

import java.util.Date;

/**
 * Created by Mila on 2/16/2017.
 */
public class Test06 {
    public static void main(String[] args) throws InterruptedException {
        Date startdate = new Date();
        long timer = startdate.getTime()+2500;
        Date enddate = new Date(timer);

        Thread.sleep(3000);

        Date currdate = new Date();
        if (currdate.after(enddate)) {
            System.out.println("You lose");
        } else {
            System.out.println("You win");


        }

    }
}
