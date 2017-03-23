package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/27/2017.
 */
/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
public class Test09 {
   // static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Human grandfather1 = new Human("Mark", false, 75, null, null);
        Human grandfather2 = new Human("Michael", false, 85, null, null);
        Human grandmother1 = new Human("Anna", true, 65, null, null);
        Human grandmother2 = new Human("Maria", true, 69, null, null);
        Human father = new Human("Joe", false, 37, grandfather1 , grandmother1 );
        Human mother = new Human("Jacline", true, 35,grandfather2 , grandmother2 );
        Human daughter = new Human("Sandra", true, 16, father, mother);
        Human son1 = new Human("Alex",false,13, father ,mother );
        Human son2 = new Human("Max",false, 5, father, mother);
        List<Human> listfam = new ArrayList<>();
        listfam.add(grandfather1);
        listfam.add(grandmother1);
        listfam.add(grandfather2);
        listfam.add(grandmother2);
        listfam.add(father);
        listfam.add(mother);
        listfam.add(daughter);
        listfam.add(son1);
        listfam.add(son2);
        for (int i = 0; i <listfam.size() ; i++) {
            System.out.println(listfam.get(i));

        }


    }

    public static class Human{
        String name;
        Boolean gender;
        int age;
        Human father;
        Human mother;
        Human(String n, Boolean g, int a, Human f, Human m){
            this.name = n;
            this.gender = g;
            this.age = a;
            this.father = f;
            this.mother = m;

        }

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + name + ", пол: " ;
            if(gender){
                text += "женский" + ", возраст: " + age;
            }else {
                text += "мужской" + ", возраст" + age;
            }

            if(father!=null){
                text += ", отец: "+ father.name;
            }
            if (mother!=null){
                text += ", мать: " + mother.name;
            }
            return text;
        }
    }
}
//Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
  //      Имя: Катя, пол: женский, возраст: 55
    //    Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня