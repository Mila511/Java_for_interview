package com.company.Lesson23.Task06_1;

/**
 * Created by Mila on 4/26/2017.
 */
//Создать интерфейс Drink и классы Cola и Beer
//В интерфейсе Drink создай метод isAlcoholic();
//Реализуй интерфейс Drink в классах Beer и Cola.
//Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
//И вывести на экран соответствующую запись.
public class Task06_1 {
    public static void main(String[] args) {
        Beer obolon = new Beer();
        Cola kvas = new Cola();
        print(obolon);
        print(kvas);
    }

    public static void print (Drink drink) {
        if(drink.isAlcoholic()){
            System.out.println(drink.getClass().getSimpleName()+": Оболонь"+ " - напиток алкогольный");
        }else {
            System.out.println(drink.getClass().getSimpleName()+": Хлебный"+ " - напиток безалкогольный");
        }
    }


}
