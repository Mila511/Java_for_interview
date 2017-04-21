package com.company.Lesson23.Task01;

import com.company.Lesson10.Test08;

/**
 * Created by Mila on 4/21/2017.
 */
public class Cat {
    private String name;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public boolean isDogNear(Dog dog) { //true, если скорость кота больше
        if (speed > dog.getSpeed()) {
            return true;
        } else {
            return false;
        }
    }
}
