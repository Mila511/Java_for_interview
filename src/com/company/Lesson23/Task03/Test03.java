package com.company.Lesson23.Task03;

/**
 * Created by Mila on 4/21/2017.
 */
/*
Создать классы Pet, Cat, Dog
В классе Pet создать метод getChild(), который возвращает экземпляр класса Pet.
Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
*/
public class Test03 {
    public static void main(String[] args) {
        Pet pet = new Pet();
        Pet cat = new Cat();
        Pet dog = new Dog();

        System.out.println(pet.getChild());
        System.out.println(dog.getChild());
        System.out.println(cat.getChild());
    }
}
