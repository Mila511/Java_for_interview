package com.company.Lesson22.Task01;

/**
 * Created by Mila on 4/20/2017.
 */
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
