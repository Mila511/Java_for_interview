package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/29/2017.
 */
/*
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран.
Создать класс Cat с параметрами name, age, weight, tail;
Переопределить метод toString() в классе Cat, что бы он выводил информацию про кота в виде:
"Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
Вводить параметри с клавиатуры и создавать объект с введенными параметрами.
Ввод продолжается, пока переменная с именем не пуста.
Добавлять каждый объект в список, в конце вывести содержимое списка на экран.
 Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/
public class Test10 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {

        List<Cat> catobjects = new ArrayList<>();

        while (true){
            String name = reader.readLine();
            if(name.isEmpty()){
                break;
            }
            int a = Integer.parseInt(reader.readLine());
            int w = Integer.parseInt(reader.readLine());
            int t = Integer.parseInt(reader.readLine());

            Cat cat1 = new Cat(name, a, w, t);

              catobjects.add(cat1);
        }

        for (int i = 0; i < catobjects.size(); i++) {
            System.out.println(catobjects.get(i));

        }


    }
    public static class Cat{
        String name;
        int age;
        int weight;
        int tail;
        Cat (String n, int a, int w, int t){
            this.name = n;
            this.age = a;
            this.weight = w;
            this.tail = t;
        }

        public static void move(){
            System.out.println("Move!");
        }

        @Override
        public String toString() {
            return "Cat name is " + name + ", age=" + age + ", weight is " + weight + ", tail=" + tail;
        }
    }
}
//Cat name is Barsik, age is 6, weight is 5, tail = 22
//Cat name is Murka, age is 8, weight is 7, tail = 20