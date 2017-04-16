package com.company.Lesson16HW_CodeFights;

/**
 * Created by Mila on 3/23/2017.
 */

//    For s = "2-4a0r7-4k" and k = 4, the output should be
//            stringReformatting(s, k) = "24a0-r74k";
//
//            The input string "2-4a0r7-4k" is split into three groups with lengths of 1, 5 and 2. Since k = 4, you need to split the string into two groups of 4 characters each, making the output string "24A0-R74k".
//
//            For s = "2-4a0r7-4k" and k = 3, the output should be
//            stringReformatting(s, k) = "24-a0r-74k".
//
//            Given the same input string and k = 3, split the string into groups of 2, 3, and 3 characters to get the output string of "24-a0r-74k".


public class Test10_stringReformatting {
    public static void main(String[] args) {
        //int k = 8;//-
        int k = 7;//+
        //int k = 6;//+
        //int k = 5;//+
        //int k = 4;//-
        // int k = 3;//+
        //int k = 2;//-
        //int k = 1;//-

        String s = "2-4a0r7-4k";
        String res = "";
        int times=0;
        s = s.replaceAll("-", "");

   if((s.length()%k)==0){
       times = s.length()/k;


   }else {
       double time = Math.round(s.length()/k+0.5);
       times = (int)time;

   }

      String[] strarr = new String[times];
        for (int i = 0; i <strarr.length; i++) {
            if (i ==0) {
                strarr[i] = s.substring(0, s.length() - (times - 1) * k);


            } else {
                strarr[i] = "-"+s.substring(strarr[0].length()+(i-1)*k, strarr[0].length()+i*k);

            }
            res=res+strarr[i];
        }
        System.out.println(res);


        }
    }

