package com.company.Lesson013.Test0001;

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
...*/

import java.util.*;

public class Test000001 {

    public static void main(String[] args) {

        Map<String, Cat> map = new LinkedHashMap<>();
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        for (int i = 0; i < cats.length; i++) {
            map.put(cats[i], new Cat(cats[i]));
        }

        Iterator<Map.Entry<String, Cat>> iteratorForCats = map.entrySet().iterator();

        while (iteratorForCats.hasNext()){
            Map.Entry<String, Cat> catNameFromMap = iteratorForCats.next();
            System.out.println(catNameFromMap.getKey() + " - " + catNameFromMap.getValue());
        }



    }
}
