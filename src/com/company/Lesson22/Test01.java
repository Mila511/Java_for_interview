package com.company.Lesson22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mila on 4/20/2017.
 */
public class Test01 {
    public static void main(String[] args) {
        Pet dog = new Cat();
        Pet cat = new Cat();

        dog.move();
        dog.setLevel(10);
        System.out.println(dog.getLevel());


    }
}

abstract class Pet {
     private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    void move(){
        System.out.println("Pet");
        /*

         */
    }

    abstract void move1();
}

class Cat extends Pet{
    @Override
    void move() {
        super.move();
    }

    @Override
    void move1() {
        System.out.println("move1");
    }
}

class Dog extends Pet{
    @Override
    void move() {
        super.move();
        System.out.println("Dog");
    }

    @Override
    void move1() {
        System.out.println("Dog move1");
    }
}