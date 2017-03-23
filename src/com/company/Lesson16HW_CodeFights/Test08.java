package com.company.Lesson16HW_CodeFights;

import java.util.Arrays;

/**
 * Created by Mila on 3/18/2017.
 */
public class Test08 {
    public static void main(String[] args) {
        int[] a = {10, 9, 3, 8, 0, 4, 10, 5, -10, -3};
       // int[] a = {10,  0,  10};
        Arrays.sort(a);//-10,-3,0,3,4,5,8,9,10,10
        int totalpaars = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                //  if (j < a.length ) {
                if (j != i) {
                    int summa = a[i] + a[j];
                    for (int k = 0; k < a.length; k++) {
                        if (summa == a[k]) {
                            totalpaars = totalpaars + 1;
                            System.out.println(totalpaars+":"+a[i]+"+"+a[j]+"="+(a[i]+a[j]));
                            break;
                            // summa=0;
                        }
                    }
                }
                // }
            }
        }
    }
}
