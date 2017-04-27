package com.company.Lesson23.Task04;

/**
 * Created by Mila on 4/26/2017.
 */
///* Или «Кошка», или «Собака», или «Птица», или «Лампа»
//Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка,
// Собака, Птица, Лампа.
//*/
public class Test02 {

    public static void main(String[] args) {
metodd(new Catt());
        metodd(new Dogg());
        metodd(new Birdd());
        metodd(new Lampp());
    }

    public static void metodd (Object objj) {
        if(objj instanceof Catt){
            System.out.println("Кошка");
        }
        if(objj instanceof Dogg){
            System.out.println("Собака");
        }
        if(objj instanceof Birdd){
            System.out.println("Птица");
        }
        if(objj instanceof Lampp){
            System.out.println("Лампа");
        }
    }

}

class Catt {
}
class Dogg {
}
class Birdd {
}
class Lampp {
}