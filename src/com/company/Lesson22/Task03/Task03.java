package com.company.Lesson22.Task03;

/**
 * Created by Mila on 4/20/2017.
 */
/* Ничего не поменяешь
//1. Создать класс Cat с переменными name, age, weight.
//2. Скрыть все внутренние переменные класса Cat:
//- создать геттеры и сеттеры
//- скрыть методы, позволяющие менять внутреннее состояние объектов класса Cat.
*/
public class Task03 {
    public static void main(String[] args) {

    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getWeight() {

            return weight;
        }
    }


}

