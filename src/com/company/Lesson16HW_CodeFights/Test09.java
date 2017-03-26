package com.company.Lesson16HW_CodeFights;

/**
 * Created by Mila on 3/19/2017.
 */
//Reverse the order of words in a given string sentence. You can assume that sentence does not have any leading,
// trailing or repeating spaces.
//        Example
//        For sentence = "Man bites dog", the output should be
//        reverseSentence(sentence) = "dog bites Man".
//public class Test{


public class Test09 {
    public static void main(String[] args) {
        //String sentence = "Добро пожаловать на ProgLang.su";
        String sentence = "Man bites dog";

        String[] arrays = sentence.split(" ");
        String res = "";

        for (int i = arrays.length - 1; i >= 0; i--) {
            //if (i == 0) {
            //res += arrays[i];
            // } else {
            res += arrays[i] + " ";
        }
        res = res.trim();
        System.out.println(res);
    }
}





