package com.company.Lesson23.Task03;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Mila on 4/21/2017.
 */
public class Dog extends Pet{
    @Override
    public Dog getChild() {
        return new Dog();
    }

    public static void main(String[] args) {
//        Collections.synchronizedList(new ArrayList<>());
    }
}
