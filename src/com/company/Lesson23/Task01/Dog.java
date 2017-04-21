package com.company.Lesson23.Task01;

/**
 * Created by Mila on 4/21/2017.
 */
public class Dog {
    private String name;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public boolean isCatNear(Cat cat) {//true, если скорость собаки больше
        if (this.speed > cat.getSpeed()) {
            return true;
        } else {
            return false;
        }
    }

}

