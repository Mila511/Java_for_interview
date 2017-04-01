package com.company.Lesson16HW_CodeFights;

import java.util.*;

/**
 * Created by Mila on 3/26/2017.
 */
//Sort the letters in the string s by the order they occur in the string t.
//
//        Example
//
//        For s = "weather" and t = "therapyw", the output should be
//        sortByString(s, t) = "theeraw";
//
//        For s = "good" and t = "odg", the output should be
//        sortByString(s, t) = "oodg".
//	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)

public class Test12 {
    public static void main(String[] args) {
        String s = "weather";
        String t = "therapyw";

        //"theeraw"
        //   sortByString(s, t);
        //  }
        //  public static String sortByString(String s, String t) {
//        char chars[] = { 'a', 'b', 'с', 'd', 'e', 'f' }:
//
//        String s = new String(chars,2,3);
//
//        System.out.println(s);
        char[] chars = new char[s.length()];
        int[] indchars = new int[s.length()];
        s.getChars(0, s.length(), chars, 0);//создаем массив символов из строкт S

        for (int i = 0; i < chars.length; i++) { // идет по массиву символов строки S
            indchars[i] = t.indexOf(chars[i], 0);//создаем массив индексов по строке T
            //   System.out.println(chars[i] + "-" + indchars[i]);
        }


        String[] resu = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            resu[i] = new String(chars[i] + "" + indchars[i]);
            System.out.println(resu[i]);
        }
        String res = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (resu[j].substring(1).equals(i)) {
                    res = res + resu[i].substring(0);
                }
            }

            }
            System.out.println(res);  //"theeraw"


//
//        String []coups = new String[char] [chars.length];
//        for (int i = 0; i <coups.length ; i++) {
//            char newchar=(char)indchars[i];
//            coups[i]=coups[i].replace(' ', chars[i]+newchar);
//        }
//        String res = "";
//        for (int i = 0; i < chars.length; i++) {
//            for (int j = 0; j < chars.length ; j++) {
//                if(indchars[j]>=chars.length){
//                 //   System.out.println(i+" "+indchars[indchars.length-1]);;
//                }
//                if(indchars[j]==i){
//                 //   System.out.println(i+" "+indchars[j]);;
//                }
//                if(indchars[j]<i){
//                    //System.out.println(i+" "+indchars[j]);;
//                }
//            }
//
//        }
//        System.out.println(res);  //"theeraw"
//        int maxin = 0;
//        char maxch = ' ';
//        for (int i = 0; i < indchars.length - 1; i++) {
//            for (int j = 0; j < indchars.length - 1; j++) {
//                if (indchars[j] > indchars[j + 1]) {
//                    maxin = indchars[j];
//                    maxch = chars[indchars[j]];
//
//                    indchars[j] = indchars[j + 1];
//                    chars[indchars[j]]=chars[indchars[j+1]];
//
//                    indchars[j] = maxin;
//                    chars[indchars[j]]=maxch;
//                }
//
//            }
//
//        }
//        for (int i : indchars) {
//            System.out.println(i);
//        }
//        for (char i: chars){
//            System.out.println(chars);
//
//        }
//        for (int i = 0; i < indchars.length; i++) {
//
//            if (indchars[i] >= indchars.length) {
//                res = res + chars[indchars[indchars.length - 1]];
//            } else {
//                res = res + chars[indchars[i]];
//            }
//
//            System.out.println(res);  //"theeraw"
//
//
//        }
        }
    }







