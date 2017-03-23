package com.company.Lesson05_Cycle;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/
public class Test08 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
        }
    }
}
