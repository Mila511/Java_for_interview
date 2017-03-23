package com.company.Lesson15;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mila on 3/2/2017.
 */
/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/
public class Test06_1 {
    public static void main(String[] args) {
        Set<Cat> crtcats = createCats();
        Set <Dog> crtdogs = createDogs();
        Set<Object> jn = join(crtcats,crtdogs);
        removeCats(jn, crtcats);
        printPets(jn);


    }

    public static void printPets(Set<Object> pets) {
        for (Object p:pets) {

            System.out.println(p);
        }
    }

    public static Set removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
        return pets;
    }

    public static Set join (Set<Cat> catsadd, Set<Dog> dogsadd) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(catsadd);
        pets.addAll(dogsadd);
        return pets;
    }

    public static Set createCats() {
        Set<Cat> catsadd = new HashSet<>();
        catsadd.add(new Cat("Acat"));
        catsadd.add(new Cat("Bcat"));
        catsadd.add(new Cat("Ccat"));
        catsadd.add(new Cat("Dcat"));
        return catsadd;
    }

    public static Set createDogs() {
        Set<Dog> dogsadd = new HashSet<>();
        dogsadd.add(new Dog("Adog"));
        dogsadd.add(new Dog("Bdog"));
        dogsadd.add(new Dog("Cdog"));
        return dogsadd;
    }


    public static class Cat {
        String namecat;

        Cat(String nc) {
            this.namecat = nc;
        }


    }

    public static class Dog {
        String namedog;

        Dog(String nd) {
            this.namedog = nd;
        }
    }
}


