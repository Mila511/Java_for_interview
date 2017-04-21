package com.company.Lesson23.Task03;

/**
 * Created by Mila on 4/21/2017.
 */
public class Cat extends Pet {
    @Override
    public Cat getChild() {
        return new Cat();
    }
}
