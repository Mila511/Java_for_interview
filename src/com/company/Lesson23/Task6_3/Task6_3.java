package com.company.Lesson23.Task6_3;

/**
 * Created by Mila on 4/26/2017.
 */
//Создать интерфейс Drink и классы Cola и Beer
//В интерфейсе Drink создай метод isAlcoholic();
//Реализуй интерфейс Drink в классах Beer и Cola.
//Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
//И вывести на экран соответствующую запись.
public class Task6_3 {
    public static void main(String[] args) {
        Wine krym = new Wine();
        Soda mirgor = new Soda();
        print(krym);
        print(mirgor);
    }

    public static void print(Drink drinkk ) {
        if(drinkk.isAlcoholic()){
            System.out.println(drinkk.getClass().getSimpleName()+" Вино Крым - напиток алкогольный");

        }else {
            System.out.println(drinkk.getClass().getSimpleName()+" Вода Миргородская - напиток ,безалкогольный");
        }
    }
}
