package com.company.Lesson05_Cycle;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
8888888888
8
8
8
8
8
8
8
8
8
8
*/
public class Test07 {
    public static void main (String [] args){
        for (int i=1; i<=10; i++){
            System.out.print("8");
        }
        System.out.println();
        for (int j=1; j<=10; j++){
            System.out.println("8");
        }
    }
}
