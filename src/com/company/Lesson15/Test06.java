package com.company.Lesson15;

import java.util.*;

/**
 * Created by Mila on 2/26/2017.
 */
/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/
public class Test06 {
    public static void main(String[] args) {
        Set <Cat> crct = createCats();
        Set <Dog> crdg = createDogs();
        Set <Object> jnpets = join(crct, crdg);
        removeCats(jnpets,crct);
        printPets(jnpets);


    }

    public static void printPets (Set<Object> pets) {
        for (Object p : pets) {
           System.out.println(p);
        }


    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {

        pets.removeAll(cats);

    }



    public static Set join( Set<Cat> koty, Set<Dog> dogy) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(koty);
        pets.addAll(dogy);
        return pets;
    }

    public static Set createCats() {
        Set <Cat> koty = new HashSet<>();
        koty.add(new Cat("Acat"));
        koty.add(new Cat("Bcat"));
        koty.add(new Cat("Ccat"));
        koty.add(new Cat("Dcat"));
        return koty;
    }
    public static Set createDogs() {
        Set <Dog> dogy = new HashSet<>();
        dogy.add(new Dog("Adog"));
        dogy.add(new Dog("Bdog"));
        dogy.add(new Dog("Cdog"));

        return dogy;
    }


        public static class Cat{
            String namecat;
            Cat(String nc){
                this.namecat =nc;
            }
        }
        public static class Dog{
            String namedog;
            Dog (String nd){
                this.namedog = nd;
            }

    }

}
