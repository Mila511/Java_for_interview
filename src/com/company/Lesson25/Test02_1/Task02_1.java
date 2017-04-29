package com.company.Lesson25.Test02_1;

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
    public static void main(String[] args) {
        Robot_1 rob1 = new Robot_1("Peter");
        Robot_1 rob2 = new Robot_1("Max");
    }
    static void doMove(AbstractRobot_1 robotFirst, AbstractRobot_1 robotSecond){
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s"));
    }
}
