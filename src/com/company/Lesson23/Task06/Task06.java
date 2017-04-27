package com.company.Lesson23.Task06;

/**
 * Created by Mila on 4/26/2017.
 */
/* Пиво и кола
//Создать интерфейс Drink и классы Cola и Beer
//В интерфейсе Drink создай метод isAlcoholic();
//Реализуй интерфейс Drink в классах Beer и Cola.
//Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
//И вывести на экран соответствующую запись.
*/
public class Task06 {
    public static void main(String[] args) {
        Drink kvas = new Cola();
        Drink champaine = new Beer();
        print(kvas);
        print(champaine);
    }

    public static void print (Drink drnk) {
        if (drnk.isAlcoholic()) {
            System.out.println(drnk.getClass().getSimpleName() + " - Hапиток алкогольный");
        } else {
            System.out.println(drnk.getClass().getSimpleName() + " - Напиток безалкогольный");
        }
    }
}
