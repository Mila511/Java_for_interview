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

    public static void main(String[] args) throws IOException {
        System.out.println("Игра 'Бой Роботов'");

        System.out.println("На ринг вызываются 2 робота!");

        String strname1 = reader.readLine();
        String strname2 = reader.readLine();
        Robot_1 rob1 = new Robot_1(1, strname1);
        Robot_1 rob2 = new Robot_1(2, strname2);
        int res =0;
        int fails = 0;
        int fails1 = 0;
        int fails2 = 0;

        for (int i = 0; i < 2; i++) {
            doMove_1(rob1, rob2, res);
        }
        fails1=res;
        for (int i = 0; i < 2; i++) {
            doMove_1(rob2, rob1, res);
        }
        fails2=res;
        viner(rob1, rob2, fails1, fails2);


    }

    static int doMove_1(AbstractRobot_1 rob1, AbstractRobot_1 rob2, int fails) {
        int res1 = 0;
        int res2 = 0;
        // for (int i = 0; i < 1; i++) {

        if (rob1.attack() != rob2.defense()) {
            res1++;
        }
        if (rob2.attack() != rob1.defense()) {
            res2++;
        }
        // }

        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s,"
                , rob1.getName()
                , rob2.getName()
                , rob1.attack()
                , rob2.defense()));
        System.out.println("Счет: ");
       // System.out.println(rob1.getName() + " : " + rob2.getName());
        if (res1 > res2) {
            System.out.println(rob1.getName() + " : " + rob2.getName() + " " + (res1 - res2) + ":" + "0");
            return res1 - res2;

        } else {
            if (res2 > res1) {
                System.out.println(rob2.getName() + " : " + rob1.getName() + " " + (res2 - res1) + ":" + "0");
                return res2 - res1;
            } else return 0;

        }
    }


    static void viner(AbstractRobot_1 rob1, AbstractRobot_1 rob2, int fails1, int fails2) {
        String viner = "";
        String str = "Победил робот ";
        if (fails1 < fails2) {
            viner = rob1.getName();
        }
        if (fails1 > fails2) {
            viner = rob2.getName();
        }
        if (fails1 == fails2) {
            str = "Ничья. Назначен следующий раунд!";
        }
        System.out.println("Бой окончен!" + "Счет : " + fails1 + ":" + fails2);
        System.out.println(str + " " + viner);
    }


}

