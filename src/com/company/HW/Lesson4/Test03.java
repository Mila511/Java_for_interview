package com.company.HW.Lesson4;

/**
 * Создать класс Cat с параметрами: name, age, power
 * Реализовать метод boolean fight(Cat anotherCat):
 * реализовать механизм драки котов в зависимости от силы.
 * Метод должен определять, выиграли ли мы (this) бой или нет,
 * т.е. возвращать true, если выиграли и false - если нет.
 * Должно выполняться условие:
 * если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
 */
class Test03 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bars", 4, 10);
        Cat cat2 = new Cat ("Leo", 4, 12);
        Cat cat3 = new Cat ("Leo1", 4);
        if(cat1.fight(cat2)){
            System.out.println("Winner is " + cat1.name);
        } else {
            System.out.println("Winner is " + cat2.name);
        }
    }

    public static class Cat {
        String name;
        int age;
        int power;

        public Cat(String name, int age, int power) {
            this.name = name;
            this.age = age;
            this.power = power;
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public boolean fight(Cat anotherCat){
            return  (this.power > anotherCat.power);
        }
    }
}
