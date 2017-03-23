package com.company.HW.Lesson4;

/**
 * Created by plkff on 12/2/2016.
 * Man -> name, age, wife
 * Woman -> name, age, husband
 */
public class Test02 {
    public static void main(String[] args) {
        Woman women = new Woman ("Mary", 28, null);
        Man man = new Man ("Adam", 32, women);
        women.husband = man;
    }

    public static class Woman {
        String name;
        int age;
        Man husband;

        public Woman(String name, int age, Man husband) {
            this.name = name;
            this.age = age;
            this.husband = husband;
        }
    }

    public static class Man {
        String name;
        int age;
        Woman wife;

        public Man(String name, int age, Woman wife) {
            this.name = name;
            this.age = age;
            this.wife = wife;
        }

    }
}
