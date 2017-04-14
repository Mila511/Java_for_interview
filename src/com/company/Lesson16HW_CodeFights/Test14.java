package com.company.Lesson16HW_CodeFights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//import static com.company.Lesson16HW_CodeFights.Test14.happyNumber;

/**
 * Created by Mila on 4/13/2017.
 */
//A happy number is a number defined by the following process: Start with any positive integer and
// replace the number with the sum of the squares of its digits. Repeat this process until the number equals 1,
// at which point it will stay 1, or it loops endlessly in a cycle that does not include 1.
// A number for which this process ends in 1 is happy.
//
//        Write an algorithm to determine whether or not a number is happy.
//
//        Example
//
//        For n = 19, the output should be
//        happyNumber(n) = true.
//
//        Following the process outlined above:
//        * 12 + 92 = 82;
//        * 82 + 22 = 68;
//        * 62 + 82 = 100;
//        * 12 + 02 + 02 = 1.
public class Test14 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Введите число: ");
        int n = Integer.parseInt(reader.readLine());
        happyNumber(n);
    }

    public static boolean happyNumber(int n) {
        List<Integer> numbres = new LinkedList<>();

        while (n > 1) {
            int counter = 0;
            while (((int) Math.round(n)) >= 1) {
                double a = (n - ((int) Math.round(n / 10) * 10));

                numbres.add((int) a);
                n = (n - (int) a) / 10;
                counter++;
            }
            System.out.println(numbres);

            int nextnum = 0;
            int period = 0;
            for (int i = numbres.size() - 1; i >= numbres.size() - counter; i--) {

                nextnum = nextnum + numbres.get(i) * numbres.get(i);
            }
            System.out.println(nextnum);
            n = nextnum;
            if (n == 1) {
                System.out.println("true");
                return true;
            }

        }
        return false;

    }
}
