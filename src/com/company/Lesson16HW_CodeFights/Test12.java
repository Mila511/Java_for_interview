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
        char[] chars = new char[s.length()];
        int[] indchars = new int[s.length()];
                s.getChars(0, s.length(), chars, 0);
        int iplus = 0;
        for (int i = 0; i < s.length(); i++) { // по исходной строке
            char same = chars[i];//s.charAt(i);
            for (int j = chars.length; j >=i+1 ; j--) {
                if(same==chars[j]){
                    iplus=indchars[j];
                }
            }
            indchars[i] = t.indexOf(chars[i], 0 + iplus);
            //iplus = i+1;

            for (int j = i + iplus; j < chars.length - i; j++) { // по массиву s->chars
                int indnext =t.indexOf(chars[i], 0 + iplus);
                if (indnext != -1) {
                    indchars[i + 1] = indnext;
                    iplus=indnext;
                    i++;


                }else{
                    break;
                }
            }
        }
        for (int i = 0; i < chars.length; i++) {

            System.out.println(chars[i] + "-" + indchars[i]);
        }
    }
}







