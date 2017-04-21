package com.company.Lesson22.Task02;

import com.company.Lesson22.Task02.Horse;
import com.company.Lesson22.Task02.Pegas;

/**
 * Created by Mila on 4/20/2017.
 */
/* Лошадь и пегас
//Написать два класса: Horse (лошадь) и Pegas (пегас).
//В классе Horse создать переменные name, flyable, runnable
//Созать конструктор для всех переменных класса Horse
//В классе Horse создать метод, который проверяет переменную flyable и выводит на экран следующее:
//- если переменная true, My name is + this.name + , i can fly =)
//- если переменная false, My name is + this.name + , i cant fly =(
//Унаследовать пегаса от лошади.
//В методе main создать два объекта: horse и pegas
//Подумать, какие значения присваивать переменным определенного класса.
*/
public class Test02 {
    public static void main(String[] args) {
        Horse horse = new Horse("horse1", false, true);
        Horse pegas = new Pegas("pegas1", true, true);
        horse.doesFly();
        pegas.doesFly();
    }

}
