package com.company.Lesson14;

import java.util.Date;

/**
 * Created by Mila on 2/16/2017.
 */
public class Test03 {
    public static void main(String[] args) throws InterruptedException {
        Date startDate = new Date();

        long endTime = startDate.getTime() + 5000;
        Date endDate = new Date(endTime);

        Thread.sleep(3000);

        Date currentDate = new Date();

        if(currentDate.after(endDate)){
            System.out.println("You lose!");
        } else {
            System.out.println("You win!");
        }
    }
}
