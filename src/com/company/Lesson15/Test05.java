package com.company.Lesson15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Mila on 2/26/2017.
 */
/* Set из котов
1. Внутри класса создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/
public class Test05 {
    public static void main(String[] args) {

        Set<Cat> resultcat = createCats();

        Iterator<Cat> iterkoty = resultcat.iterator();
        int count = 0;
        while (iterkoty.hasNext()) {
            iterkoty.next();
            iterkoty.remove();
            break;
        }
        for (Cat cat : resultcat) {
            System.out.println(cat);
        }
     //   System.out.println(resultcat);

    }


    public static Set createCats() {
        Set<Cat> koty = new HashSet<>();
        koty.add(new Cat("ARG"));
        koty.add(new Cat("BRG"));
        koty.add(new Cat("CRG"));
        return koty;
    }

    public static class Cat {
        String name;

        Cat(String n) {
            this.name = n;
        }
    }
}
