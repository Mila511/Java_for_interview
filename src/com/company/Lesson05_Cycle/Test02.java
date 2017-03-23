package com.company.Lesson05_Cycle;

/* 10 чисел
Вывести на экран числа от 1 до 10 используя цикл while.
/* 10 чисел наоборот
Вывести на экран числа от 10 до 1 используя цикл while.
*/
public class Test02 {
    public static void main (String [] args){
        int i = 1;
        while (i < 11){
            System.out.println(i);
            i++;

        }
        System.out.println("------------------------");
        int j = 10;
        while (j > 0){
            System.out.println(j);
            j--;
        }

    }


}
