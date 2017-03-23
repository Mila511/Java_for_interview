package com.company.Lesson16;

/**
 * Created by Mila on 3/10/2017.
 */
//Reverse the digits of the given integer.
//        Example
//        For x = 12345, the output should be
//        reverseInteger(x) = 54321;
//        For x = -4243, the output should be
//        reverseInteger(x) = -3424.
public class Test07 {
    public static void main(String[] args) {
        int x = -112345;
        //String s = String.valueOf(x);
        System.out.println(reverseInteger(x));
    }

    public static int reverseInteger(Integer x) {
        int reversx = 0;
        for (int i = x; i != 0; i = i / 10) {
            reversx = reversx * 10 + i % 10;
        }


        return reversx;
    }
}
