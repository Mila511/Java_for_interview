package com.company.HW.Lesson4;

/**
 * Created by plkff on 12/2/2016.
 * Woman -> name, age
 * Cat -> name, age, owner
 * Dog -> name, age, owner
 * Fish -> name, age, owner
 */
public class Test01 {
    public static void main (String [] args) {
        Woman woman = new Woman("Anna", 21);
        Cat cat1 = new Cat("Bars", 3, woman);
        Dog dog1 = new Dog ("Jack", 5, woman);
        Fish fish1 = new Fish ("Goldy", 2, woman);
        System.out.println(woman.name + " " + woman.age);
        System.out.println(cat1.name + " " + cat1.age + " " + cat1.owner.name);
        System.out.println(dog1.name + " " + dog1.age + " " + dog1.owner.name);
        System.out.println(fish1.name + " " + fish1.age + " " + fish1.owner.name);

    }
    public static class Woman {
        String name;
        int age;
        Woman (String w, int a) {
            this.name = w;
            this.age = a;

        }
            }
    public static class Cat {
        String name;
        int age;
        Woman owner;
        Cat (String n, int a, Woman nn){
            this.name = n;
            this.age = a;
            this.owner = nn;

        }

    }
    public static class Dog{
        String name;
        int age;
        Woman owner;
        Dog (String n, int a, Woman nn){
            this.name = n;
            this.age = a;
            this.owner = nn;
        }
    }
    public static class Fish{
        String name;
        int age;
        Woman owner;
        Fish (String n, int a, Woman nn){
            this.name = n;
            this.age = a;
            this.owner = nn;
        }
    }
}
