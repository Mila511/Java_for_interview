package com.company.Lesson25.Test02;

/**
 * Created by Mila on 4/28/2017.
 */
/* Битва роботов    ДОДЕЛАТЬ !!!!
1. Создать класс Robot_1, BodyPart интерфейсы Attackable,Defensable_1 и абстрактный класс AbstractRobot_1
2. В классе BodyPart создать переменную String bodyPart; добавить 4 объекта - части тела ( рука, нога, голова, грудь).
 Сделать объекты неизменяемыми.
3. В интерфейсе Attackable создать метод BodyPart attack();
4. В интерфейсе Defensable_1 создать метод BodyPart defense();
5. В классе AbstractRobot_1 создать переменные private String name; private static int hitCount;
6 В классе AbstractRobot_1 создать логику атаки и защиты. Реализовать интерфейсы Attackable и Defensable_1
6.1 В методах attack() и defense() инициализировать переменную hitCount рандомным числом от 1 до 4.
    В зависимости от результата инициализации должна быть атакована и защищена определенная часть тела робота.
7. Унаследовать класс Robot_1 от AbstractRobot_1. В классе Robot_1 создать конструктор супер класса.
8. В выполняющем классе создать метод doMove(AbstractRobot_1 robotFirst, AbstractRobot_1 robotSecond).
8.1 В методе doMove реализовать логику вывода на экран надписи "%s атаковал робота %s, атакована %s, защищена %s"
*/
public class Task02 {
    public static void main(String[] args) {
        Robot rob1 = new Robot("Ivan");
        Robot rob2 = new Robot("Jon");
        for (int i = 0; i < 4; i++) {
            doMove(rob1, rob2);
            doMove(rob2, rob1);
        }
        // TODO: 4/28/2017 Расширить действия и тд 
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        //"%s атаковал робота %s, атакована %s, защищена %s"
//        System.out.println(robotFirst.getName() + " атаковал робота " + robotSecond.getName()
//                + ", атакована " + robotFirst.attack() + ", защищена " + robotSecond.defense());
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s"
                , robotFirst.getName()
                , robotSecond.getName()
                , robotFirst.attack()
                , robotSecond.defense()));
    }
}
