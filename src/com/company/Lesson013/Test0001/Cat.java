package com.company.Lesson013.Test0001;

public class Cat {

    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}
