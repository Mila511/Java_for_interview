package com.company.Lesson013;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Mila on 2/12/2017.
 *//* Коллекция HashMap из котов
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
public class Test02_2 {
    public static void main(String[] args) {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        catsintomap(cats);
    }

    public static void catsintomap(String[] cats) {
        Map<String, Cat> catsmap = new LinkedHashMap<>();
        for (int i = 0; i < cats.length; i++) {
            catsmap.put(cats[i], new Cat(cats[i]));
            //System.out.println(catsmap);

        }
        Iterator<Map.Entry<String, Cat>> itercatsmap = catsmap.entrySet().iterator();
        for (int i = 0; i < cats.length; i++) {
            while (itercatsmap.hasNext()) {
                Map.Entry<String, Cat> catprn = itercatsmap.next();
                System.out.println(catprn.getKey() + "-" + catprn.getValue());
            }

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
