package com.company.Lesson03;

/**
 * Created by plkff on 11/25/2016.
 */
public class Test_Class {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 6, 9);
        Cat cat2 = new Cat("Murzik", 8, 12);

        System.out.println(cat1.name + " " + cat1.age + " " + cat1.weight);
        System.out.println(cat2.name + " " + cat2.age + " " + cat2.weight);

    }

    public static class Cat {
        String name;
        int age;
        int weight;

        Cat(String n, int a, int w){
            this.name = n;
            this.age = a;
            this.weight = w;
        }
    }
}
