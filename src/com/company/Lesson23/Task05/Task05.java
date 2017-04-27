package com.company.Lesson23.Task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 4/26/2017.
 */
/*
//    Создать интерфейс Drink и класс AlcoholicBeer
//    В интерфейсе Drink создай метод isAlcoholic();
//    Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
//    Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный",
если isAlcoholic() возвращает true,
//    иначе вывести на экран надпись "Напиток безалкогольный".
*/
public class Task05{
//    static int a;
//
//    static {
//        a = 5;
//    }

    public static void main(String[] args) {
        Drink pivo = new AlcoholicBeer();
        System.out.println(pivo);
    }


}
