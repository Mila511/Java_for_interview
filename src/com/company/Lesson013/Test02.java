package com.company.Lesson013;

import com.company.Lesson10.Test08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Mila on 2/12/2017.
 */
/* Коллекция HashMap из котов
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота из массива:
 String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
 В качестве значения использовать экземпляр кота, с переданным именем из массива в конструктор.
 В классе Cat метод toString() должен переводить переданное в конструктор имя в верхний регистр ( метод toUpperCase() )
Вывести результат на экран, каждый элемент с новой строки.
Вывести результат на экран в виде:
васька - ВАСЬКА
мурка - МУРКА
...
*/
public class Test02 {

    public static void main(String[] args) {
        String[] cats =
                new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        kott(cats);
    }

    public static void kott(String[] cats) {
        Map<String, Cat> koty = new LinkedHashMap<>();
        for (int i = 0; i < cats.length; i++) {
            String nm = cats[i];
            koty.put(nm, new Cat(nm));

        }
        Iterator<Map.Entry<String, Cat>> i_koty = koty.entrySet().iterator();
        while (i_koty.hasNext()) {
            Map.Entry<String, Cat> nmkt = i_koty.next();
            System.out.println(nmkt.getKey() + "-" + nmkt.getValue());
        }
    }


    public static class Cat {
        String name;

        Cat(String n) {

            this.name = n;
        }

        @Override
        public String toString() {
            return name.toUpperCase();
        }
    }
}
