package com.company.Lesson16HW_CodeFights;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Mila on 4/18/2017.
 */
//You have array of integers nums and you need to return a new counts array.
// In the new counts array, counts[i] is the number of smaller elements to the right of nums[i].
//
//        Example
//
//        For nums = [3, 8, 4, 1], the output should be
//        countSmallerToTheRight(nums) = [1, 2, 1, 0].
//
//        To the right of 3: there is 1 smaller element (1).
//        To the right of 8: there are 2 smaller elements (4 and 1).
//        To the right of 4: there is 1 smaller element (1).
//        To the right of 1: there are 0 smaller elements.
//
//        The resulting array is [1, 2, 1, 0].

public class Test16countSmallerToTheRight {
    public static void main(String[] args) {
        int [] nums = {3, 8, 4, 1};
        countSmallerToTheRight(nums);

           }

    public static int [] countSmallerToTheRight(int [] nums) {
        int [] counts = new int [nums.length];
        for (int i = 0; i <nums.length ; i++) {
            int num = nums[i];
            int count=0;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]<num){
                    count++;
                }
            }
            counts[i]=count;
            System.out.println(count);
        }
        return counts;
    }
}

