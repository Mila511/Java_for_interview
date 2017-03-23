package com.company.Lesson10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 2/3/2017.
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
public class Test09_1 {

    public static void main(String[] args) {
       // List <String> humobj = new ArrayList<>();
        Human_1 grandpa1 = new Human_1("A", false, 80, null, null);
        Human_1 grandpa2 = new Human_1("B", false, 85, null, null);
        Human_1 grandma1 = new Human_1("C", true, 70, null, null);
        Human_1 grandma2 = new Human_1("D", true, 80, null, null);
        Human_1 pa = new Human_1("E", false, 45, grandpa1, grandma1);
        Human_1 ma = new Human_1("F", true, 40, grandpa2, grandma2);
        Human_1 son1 = new Human_1("G", false, 10, pa, ma);
        Human_1 son2 = new Human_1("H", false, 10, pa, ma);
        Human_1 da = new Human_1("I", true, 13, pa, ma);
        List <Human_1> humobj = new ArrayList<>();
        humobj.add(grandpa1);
        humobj.add(grandma1);
        humobj.add(grandpa2);
        humobj.add(grandma2);
        humobj.add(ma);
        humobj.add(pa);
        humobj.add(son1);
        humobj.add(son2);
        humobj.add(da);
        for (int i = 0; i < humobj.size() ; i++) {
            System.out.println(humobj.get(i));
        }


    }

    public static class Human_1 {
        String name;
        boolean gender;
        int age;
        Human_1 father;
        Human_1 mother;

        Human_1(String n, boolean g, int a, Human_1 f, Human_1 m) {
            this.name = n;
            this.gender = g;
            this.age = a;
            this.father = f;
            this.mother = m;
        }

        @Override
        public String toString() {
            String textstr = "";
            textstr += "Имя: " + name + ", пол: "; // + gender + ", возраст: " + age;
            if (gender) {
                textstr += "женский";
            } else {
                textstr += "мужской";

            }
            textstr += ", возраст: " + age;
            if (father != null) {
                textstr += ", отец: " + father.name;
            }
            if (mother != null) {
                textstr += ", мать: " + mother.name;
            }
            return textstr;
        }
    }
}
//Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
//  Имя: Катя, пол: женский, возраст: 55
// Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня


