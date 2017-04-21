package com.company.Lesson22.Test02_1;

/**
 * Created by Mila on 4/20/2017.
 */
public class Horse_1 {
    String name;
    boolean flyable;
    boolean runable;
public Horse_1(String name1, boolean flyable1, boolean runable1){
    this.name = name1;
    this.flyable = flyable1;
    this.runable = runable1;
}
public void isFlbl(){
    String can = null;
    if(flyable==true){
        can=" I can fly";
    }else {
        can=" I can't fly";
    }
    System.out.println("My name is " + this.name + can);
}
}

