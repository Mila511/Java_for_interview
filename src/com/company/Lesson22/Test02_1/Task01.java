package com.company.Lesson22.Test02_1;

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
public class Task01 {
    public static void main(String[] args) {
        Horse_1 horse_1 = new Horse_1("hor", false, true );
        Horse_1 pegas_1 = new Horse_1("peg", true, true);
        horse_1.isFlbl();
        pegas_1.isFlbl();
    }

}
