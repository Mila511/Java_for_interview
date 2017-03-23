package com.company.Lesson16HW_CodeFights;

import java.util.Arrays;

/**
 * Created by Mila on 3/10/2017.
 */
//You have an array a containing 2 * n + 2 positive numbers, in which n numbers occur twice and two other numbers occur only once and are distinct. Find the two distinct numbers and return them in ascending order.
//        Example
//        For a = [1, 3, 5, 6, 1, 4, 3, 6], the output should be /1, 3, 3, 4 , 5 , 6, 6,
//        findTheNumbers(a) = [4, 5];
//        For a = [4, 5, 6, 5, 3, 4], the output should be
//        findTheNumbers(a) = [3, 6]
public class Test07 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 5, 1, 4, 3, 6};//11334556//45
        a = findTheNumbers(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    static int[] findTheNumbers(int[] a) {
        Arrays.sort(a);
        int[] rez = new int[2];
        int k = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                rez[k] = a[i];
                k++;
            } else i++;
        }

        if(a[a.length-1] != a[a.length-2]){
            rez[k] = a[a.length-1];
        }

        return rez;
    }

}



