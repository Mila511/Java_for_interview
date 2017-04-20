package com.company.Lesson16HW_CodeFights;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mila on 4/13/2017.
 */
//Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number
// for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers,
// return the number for which the second occurrence has a smaller index than the second occurrence of the other number does.
// If there are no such elements, return -1.
//
//        Example
//
//        For a = [2, 3, 3, 1, 5, 2], the output should be
//        firstDuplicate(a) = 3.
//
//        There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than than second occurrence of 2 does, so the answer is 3.
//
//        For a = [2, 4, 3, 5, 1], the output should be
//        firstDuplicate(a) = -1.

public class Test15_firstDuplicate {
    public static void main(String[] args) {
        //Integer[] a = {2, 3, 3, 1, 5, 2};
        int[] a = {2, 4, 3, 5, 1};
        firstDuplicate(a);
    }
    //scaleTests.add(Arrays.stream(data).boxed().toArray(Double[]::new))

    public static Integer firstDuplicate (int[] a) { //ДОДЕЛАТЬ
        Integer[] c = new Integer[a.length];
        Integer[] b = new Integer[a.length];//1,2,2,3,3,5
        System.arraycopy(a, 0, b, 0, a.length);
        Arrays.sort(b);
        int isCouple = -1;
        int firstin = 0;
        int nextin = 0;
        int minoccur = 0;
        for (int i = 0; i < b.length; i++) {
            if (i < b.length - 2) {
                if (b[i] == b[i + 1]) {
                    isCouple = b[i];
                    for (int j = 0; j < a.length; j++) {
                        if (a[j] == isCouple) {
                            firstin = j;
                            for (int k = firstin + 1; k < a.length; k++) {
                                if (a[k] == isCouple) {
                                    nextin = k;
                                    break;
                                }
                            }
                            if (nextin != 0 && minoccur <= nextin - firstin) {
                                break;
                            }
                            if (nextin != 0 && minoccur > nextin - firstin) {
                                minoccur = nextin - firstin;
                                firstin = nextin = 0;
                            }
                        }
                    }

                }
            } else break;
        }
        System.out.println("Мин.=" + "" + (nextin - firstin) + "для пары: " + isCouple);
return isCouple;
    }
}