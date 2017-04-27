package com.company.Lesson23.Task04;

/**
 * Created by Mila on 4/26/2017.
 */
///* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
//Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из:
// «Корова», «Кит», «Собака», «Неизвестное животное».
//*/
public class Test03 {
    public static void main(String[] args) {
        whatIs(new Coow());
        whatIs(new Whaale());
        whatIs(new Doog());
        whatIs(new Object());
    }

    public static void whatIs(Object oobj) {
        if(oobj instanceof Coow){
            System.out.println("Корова");
        }else if(oobj instanceof Whaale){
            System.out.println("Кит");
        }else if(oobj instanceof Doog){
            System.out.println("Собака");

        }else {
            System.out.println("Неизвестное животное");
        }
    }
}
class Coow{}
class Whaale{}
class Doog{}

