package com.company.Lesson22.Task02;

/**
 * Created by Mila on 4/20/2017.
 */
//- если переменная true, My name is + this.name + , i can fly =)
//- если переменная false, My name is + this.name + , i cant fly =(
public class Horse {
    String name;
    boolean flyable;
    boolean runnable;

    public Horse(String name, boolean flyable, boolean runnable) {
        this.name = name;
        this.flyable = flyable;
        this.runnable = runnable;
    }

    public void doesFly() {
        String can = null;
        if (flyable == true) {
            can = " can fly ";
        } else {
            can = " cant fly ";
        }
        System.out.println("My name is " + this.name + ", I" + can);
    }
}



