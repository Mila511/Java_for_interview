package com.company.Lesson23.Task02;

/**
 * Created by Mila on 4/21/2017.
 */
public class Whale extends Cow {
    String name;

    public Whale(String name) {
        super(name);
        this.name = name;
    }

//    @Override
//    public String getName() {
//        String str = "Я не корова, Я - кит."+name;
//        return str;
//    }


    @Override
    public String getName() {
        return super.getName();
    }
}
