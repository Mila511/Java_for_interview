package com.company.Lesson02;

/**
 * Реализовать метод compare(int a).
 * Метод должен выводить строку на экран "Число меньше 5", если параметр метода меньше 5 - и,
 * выводить строку "Число больше 5", если параметр метода больше 5 - и,
 * и выводить строку "Число равно 5", если параметр метода равен 5 - и.
 */
public class Test09 { //
    public static void main(String[] args) {
        int a = 3;
        compare(a);
    }

    public static void compare(int a) {
        if (a < 5) {
            System.out.println("Число " + a + " меньше 5");
        } else if (a == 5) {
            System.out.println("Число равно 5");
        } else {
            System.out.println("Число ,больше 5");

        }

    }
}

