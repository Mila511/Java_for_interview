package com.company.Lesson23.Task04;



/**
 * Created by Mila on 4/26/2017.
 */
public class Test01 {
    public static void main(String[] args) {
        method(new Cat());
        method(new Dog());
        method(new Pet());
        method(new Bird());
    }

    static void method(Object obj){
        if(obj instanceof Pet){
            System.out.println("Pet");
        } if(obj instanceof Cat){
            System.out.println("Cat");
        } if(obj instanceof Dog){
            System.out.println("Dog");
        } if(obj instanceof Bird){
            System.out.println("Bird");
        }
    }


}

class Pet{}
class Cat extends Pet{}
class Dog{}
class Bird{}
