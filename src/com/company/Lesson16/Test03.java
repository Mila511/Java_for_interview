package com.company.Lesson16;

import java.util.Arrays;

/**
 * Created by Mila on 3/9/2017.
 */
public class Test03 {

    public static void main(String[] args) {
        int[] nums = {2,2,1};

        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]){
                return nums[i];
            } else {
                i++;
            }
        }
        return nums[0];
    }

}

