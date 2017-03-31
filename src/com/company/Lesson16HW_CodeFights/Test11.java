package com.company.Lesson16HW_CodeFights;

/**
 * Created by Mila on 3/26/2017.
 */
//
//    For s = "CodefightsIsAwesome" and x = "IA", the output should be
//            strstr(s, x) = -1;
//            For s = "CodefightsIsAwesome" and x = "IsA", the output should be
//            strstr(s, x) = 10.  s.indexOf(x)

public class Test11 {
    public static void main(String[] args) {
        String s = "CodefightsIsAwesome";
        //String x = "X";//-1
        String x = "CodefightsIsAwesomekkkk";//-1
        //String x = "";//-1
        //String x = "IsA";//10
        if (s.length() >= x.length()){
            if (x == "") {
                System.out.println(-1);
            } else {
                System.out.println(s.indexOf(x));
            }
    }else{
            System.out.println(-1);
        }
    }
}
