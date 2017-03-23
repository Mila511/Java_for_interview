package com.company.Lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Mila on 3/16/2017.
 */
/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот». - createMap()
Получить из Map множество(Set) всех имен и вывести его на экран. - convertMapToSet(Map<String, Cat> map)
*/
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<String, Cat> mapcats = createMap();
        Set<String> toset = convertMapToSet(mapcats);
        for (String s : toset) {
            System.out.println(s);
        }

    }

    public static Map createMap() throws IOException {
        Map<String, Cat> mapcats = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String name = reader.readLine();
            mapcats.put(name, new Cat(name));
        }
        return mapcats;
    }

    public static Set convertMapToSet(Map<String, Cat> mapcats) {
        Set<String> toset = new HashSet<>();
        Iterator<Map.Entry<String, Cat>> imapcats = mapcats.entrySet().iterator();
        while (imapcats.hasNext()) {
            Map.Entry<String, Cat> pair = imapcats.next();
            toset.add(pair.getKey());
        }
        return toset;
    }

    public static class Cat {
        String name;

        Cat(String n) {
            this.name = n;
        }
    }
}
