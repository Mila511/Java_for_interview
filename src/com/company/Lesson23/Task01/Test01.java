package com.company.Lesson23.Task01;

/**
 * Created by Mila on 4/21/2017.
 */
/* Создать классы Cat и Dog с параметрами name и speed
Скрыть все внутренние переменные класса Cat и Dog.
 Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
 Создать метод isDogNear в классе Cat, который возвращает true, если скорость кота больше
 Создать метод isCatNear в классе Dog, который возвращает true, если скорость собаки больше
*/
public class Test01 {
    public static void main(String[] args) {
        Cat cat = new Cat("Bars", 100);
        Dog dog = new Dog("Jack", 110);

        if(!cat.isDogNear(dog)){//cat.isDogNear(dog)==false
            System.out.println("Cкорость кота меньше!");
        }else if(!dog.isCatNear(cat)){
            System.out.println("Cкорость кота больше!");
        }


    }

}
