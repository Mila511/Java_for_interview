package com.company.Lesson25.Test02_1;

/**
 * Created by Mila on 4/28/2017.
 *///6 В классе AbstractRobot создать логику атаки и защиты. Реализовать интерфейсы Attackable и Defensable_1
//6.1 В методах attack() и defense() инициализировать переменную hitCount рандомным числом от 1 до 4.
//    В зависимости от результата инициализации должна быть атакована и защищена определенная часть тела робота.
public abstract class AbstractRobot_1 implements Attackable_1, Defensable_1 {
    private String name_1;
    private static int hitCount_1;


    public AbstractRobot_1(String name_1) {
        this.name_1 = name_1;
    }

    @Override
    public BodyPart_1 attack() {
        hitCount_1 = (int) (Math.random() * 4 + 1);
        BodyPart_1 atac = null;
        if (hitCount_1 == 1) {
            atac = BodyPart_1.bp1;
        }
        if (hitCount_1 == 2) {
            atac = BodyPart_1.bp2;
        }
        if (hitCount_1 == 3) {
            atac = BodyPart_1.bp3;
        }
        if (hitCount_1 == 4) {
            atac = BodyPart_1.bp4;
        }
        hitCount_1 = 0;
        return atac;
    }

    @Override
    public BodyPart_1 defense() {
        hitCount_1 = (int) (Math.random() * 4 + 1);
        BodyPart_1 def = null;
        if (hitCount_1 == 1) {
            def = BodyPart_1.bp1;
        }
        if (hitCount_1 == 2) {
            def = BodyPart_1.bp2;
        }
        if (hitCount_1 == 3) {
            def = BodyPart_1.bp3;
        }
        if (hitCount_1 == 4) {
            def = BodyPart_1.bp4;
        }
        return def;
    }

    public String getName() {
        return name_1;
    }

}


