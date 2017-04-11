package com.company.Lesson21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mila on 4/7/2017.
 */
///* Гласные и согласные буквы
//Написать программу, которая вводит с клавиатуры строку текста.
//Программа должна вывести на экран две строки:
//1. первая строка содержит только гласные буквы
//2. вторая - только согласные буквы и знаки препинания из введённой строки.
//Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
//public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
//Пример ввода:
//Мама мыла раму.
//Пример вывода:
//а а ы а а у
//М м м л р м .
//*/
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String inpstr = "Мама мыла раму";
        String oldstr = inpstr;
        inpstr=inpstr.replaceAll(" ","");
        String vowstr = "";
        String nonvowstr = "";
        for (int i = 0; i < inpstr.length(); i++) {
            char is = inpstr.charAt(i);
            if (isVowel(is)) {
                vowstr = vowstr + " " + is;
                            }else{
                nonvowstr = nonvowstr + " " + is;
            }
        }
        System.out.println(oldstr);
        System.out.println(vowstr);
        System.out.println(nonvowstr);

}


    public static boolean isVowel(char is) {

        for (int i = 0; i < vowels.length; i++) {
            if (is == vowels[i]) {
                return true;
            }

        }
        return false;
    }




    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

}


