package com.company.Lesson16;

import java.util.Arrays;

/**
 * Created by Mila on 3/9/2017.
 */
///*You are given an array of integers in which every element appears twice, except for one.
// Find the element that only appears one time.
// Your solution should have a linear runtime complexity (O(n)).
// Try to implement it without using extra memory.
//        Example
//        For nums = [2, 2, 1], the output should be
//        singleNumber(nums) = 1.
//        Input/Output
//        [time limit] 3000ms (java)
//        [input] array.integer nums
//        Constraints:
//        1 ≤ nums.length ≤ 104,
//        -109 ≤ nums[i] ≤ 109.
//        [output] integer
public class Test05 {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};

        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int unic = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[0] != nums[1]) {
                unic = nums[0];
                break;
            }
            if (nums[nums.length - 1] != nums[nums.length - 2]) {
                unic = nums[nums.length - 1];
                break;
            }

            if (i != 0 && i != nums.length - 1) {

                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    unic = nums[i];
                    break;
                }

            }


        }
        return unic;
    }
}