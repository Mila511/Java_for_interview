package com.company.Lesson25.Test02_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mila on 4/28/2017.
 */
/* Битва роботов
//1. Создать класс Robot, BodyPart интерфейсы Attackable,Defensable_1 и абстрактный класс AbstractRobot
//2. В классе BodyPart создать переменную String bodyPart; добавить 4 объекта - части тела ( рука, нога, голова, грудь).
// Сделать объекты неизменяемыми.
//3. В интерфейсе Attackable создать метод BodyPart attack();
//4. В интерфейсе Defensable_1 создать метод BodyPart defense();
//5. В классе AbstractRobot создать переменные private String name; private static int hitCount;
//6 В классе AbstractRobot создать логику атаки и защиты. Реализовать интерфейсы Attackable и Defensable_1
//6.1 В методах attack() и defense() инициализировать переменную hitCount рандомным числом от 1 до 4.
//    В зависимости от результата инициализации должна быть атакована и защищена определенная часть тела робота.
//7. Унаследовать класс Robot от AbstractRobot. В классе Robot создать конструктор супер класса.
//8. В выполняющем классе создать метод doMove(AbstractRobot robotFirst, AbstractRobot robotSecond).
//8.1 В методе doMove реализовать логику вывода на экран надписи "%s атаковал робота %s, атакована %s, защищена %s"
*/
public class Task02_1 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static int res;
    static int res12 = 0;
    static int res21 = 0;
    static String str = "Победил робот ";

    public static void main(String[] args) throws IOException {
        System.out.println("Игра 'Бой Роботов'");
        System.out.println("На ринг вызываются 2 робота!");
        System.out.print("Робот : ");
        String strname1 = reader.readLine();
        System.out.print("Робот : ");
        String strname2 = reader.readLine();
        Robot_1 r1 = new Robot_1(strname1);
        Robot_1 r2 = new Robot_1(strname2);
        res = 0;
        doMove_1(r1, r2);
        res12 = res;
        res = 0;
        doMove_1(r2, r1);
        res21 = res;
        System.out.println(res12 + " : " + res21);
        vinner(r1, r2, res12, res21);
    }

    static int doMove_1(AbstractRobot_1 r1, AbstractRobot_1 r2) {
        for (int i = 0; i < 3; i++) {
            BodyPart_1 attacked = r1.attack();
            BodyPart_1 defensed = r2.defense();
            System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s,"
                    , r1.getName()
                    , r2.getName()
                    , attacked
                    , defensed));
            if (attacked != defensed) {
                res++;
            }
            System.out.println(r1.getName() + " - Очки:" + res);
        }
        return res;
    }

    public static void vinner(AbstractRobot_1 r1, AbstractRobot_1 r2, int res12, int res21) {
        System.out.println("Бой окончен!");
        System.out.print("Счет. ");
        if (res12 > res21) {
            System.out.print(r1.getName() + ":" + r2.getName() + " " + res12 + ":" + res21);
        } else {
            if (res21 > res12) {
                System.out.print(r2.getName() + " : " + r1.getName() + " " + res21 + ":" + res12);
            } else {
                System.out.print("Ничья. Назначен следующий раунд!");
            }
        }
    }
}

