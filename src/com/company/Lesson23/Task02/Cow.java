package com.company.Lesson23.Task02;

/**
 * Created by Mila on 4/21/2017.
 */
public class Cow {
    String name;

    public Cow(String name) {
        this.name = name;
    }
    public String getName(){
        String str = "Я - корова. " + name;
        return str;
    }
}
