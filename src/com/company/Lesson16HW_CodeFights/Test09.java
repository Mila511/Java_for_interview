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
//=============================================================================
//    public static void main(String args[]){
//        String Str1 = new String("Добро пожаловать на ProgLang.su");
//        char[] Str2 = new char[7];
//
//        try{
//            Str1.getChars(2, 9, Str2, 0);
//            System.out.print("Скопированное значение: " );
//            System.out.println(Str2);
//
//        }catch( Exception ex){
//            System.out.println("Возникает исключение...");
//        }
//    }
//}


public class Test09 {
    public static void main(String[] args) {
        String s = "Добро пожаловать на ProgLang.su";
        String[] arrays = s.split(" ");
        String  res = "";

        for (int i = arrays.length - 1; i >= 0; i--) {
            res += arrays[i] + " ";
        }

        System.out.println(res.trim());

        //String sentence = new String("Man bites dog");
        //String sentence = new String("abc ");
        //String sentence = new String("a b c");
//        String sentence = new String("abc");
//
//        String firstsub = new String();
//        String lastsub = new String();
//        int firstspc = -1;
//        int lastspc = -1;
//
//        firstspc = sentence.indexOf(" ");
//        lastspc = sentence.lastIndexOf(" ");
//        System.out.println(firstspc+" "+lastspc);
//
//        if (firstspc == -1 && lastspc == -1) {//нет пробелов
//            System.out.println("нет пробелов");
//            sentence = sentence;
//        }
//        if (firstspc!=lastspc&&firstspc != -1 && lastspc != -1) {//2 есть 1-й и последний
//            firstsub = sentence.substring(0, firstspc);
//            lastsub = sentence.substring(lastspc + 1, sentence.length());
//            sentence = sentence.replaceFirst(lastsub, firstsub).replaceFirst(firstsub, lastsub);
//            System.out.println("2 есть 1-й и последний");
//        }
//
//        if (firstspc==lastspc&&firstspc !=0) {//есть 1 , не на 0
//            firstsub = sentence.substring(0, firstspc);
//            lastsub = sentence.substring(firstspc, sentence.length());
//            sentence = lastsub + firstsub;
//            System.out.println("есть 1 , не на 0");
//        }
//        if (firstspc == lastspc&&firstspc == 0) {//есть 1 на 0
//            firstsub = sentence.substring(0, firstspc);
//            lastsub = sentence.substring(firstspc + 1, sentence.length());
//            sentence = lastsub + firstsub;
//            System.out.println("есть 1 на 0");
//        }
//        if (firstspc == lastspc && firstspc == sentence.length()) {//есть 1, на конце
//            firstsub = sentence.substring(0, firstspc);
//            lastsub = sentence.substring(firstspc + 1, sentence.length());
//            sentence = lastsub + firstsub;
//            System.out.println("есть 1, на конце");
//        }
//        System.out.println(sentence);
    }
}




