package com.company.Lesson16HW_CodeFights;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 3/26/2017.
 */
public class Test9_1 {

    public static void main(String[] args) {

        System.out.println(stringReformatting("revasd-asdfv-sda-sdf0009", 5));
    }
    static String stringReformatting(String s, int k) {
        String str = "";
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == '-'){
                list.remove(i);
            }
        }
        for (int i = list.size()-1-k; i >=0 ; i-=k) {
            if(i!=0)list.add(i, '-');
        }
        for (int i = 0; i < list.size(); i++) {
            str+=list.get(i);
        }
        return str.trim();
    }

}
