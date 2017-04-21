package com.company.Lesson22.Task01;

//import com.company.Lesson22.Pet;

/**
 * Created by Mila on 4/20/2017.
 */
class Dog extends Pet {
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
