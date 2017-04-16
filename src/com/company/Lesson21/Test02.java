package com.company.Lesson21;

import java.io.IOException;
import java.util.*;

/**
 * Created by Mila on 4/15/2017.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("Вишня");
        list.add("1");
        list.add("Боб");
        list.add("3");
        list.add("Яблоко");
        list.add("2");
        list.add("0");
        list.add("Арбуз");
        System.out.println("Ввод: " + list);
        addNumbersAndNonNumbersToLists(list);
    }

    static boolean isNumber(String incomingString) {

        try {
            Integer.parseInt(incomingString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static List addNumbersAndNonNumbersToLists(List list) {
        List<String> nmblist = new ArrayList<>();
        List<String> strlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (isNumber((String) list.get(i))) {
                nmblist.add((String) list.get(i));// numbers
            } else strlist.add((String) list.get(i)); // non numbers
        }

        nmblist.sort(Comparator.reverseOrder());// сортировка цифровых по убыванию
        strlist.sort(String::compareTo);// сортировка символьных по возрастанию

        int listsize = list.size();
        for (int i = 0; i < listsize; i++) {
            String s = (String) list.get(0);
            if (isNumber(s)) {
                list.add((String) nmblist.get(0));// numbers
                nmblist.remove(0);
            } else {
                list.add(strlist.get(0)); // non numbers
                strlist.remove(0);
            }
            list.remove(0);
        }
        System.out.println("Вывод: " + list);
        return list;
    }
}
