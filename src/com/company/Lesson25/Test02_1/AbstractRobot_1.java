package com.company.Lesson25.Test02_1;

/**
 * Created by Mila on 4/28/2017.
 *///6 В классе AbstractRobot создать логику атаки и защиты. Реализовать интерфейсы Attackable и Defensable_1
public abstract class AbstractRobot_1 implements Attackable_1, Defensable_1 {
    private String name_1;
    private static int hitCount_1;

    public AbstractRobot_1(String name_1) {
        this.name_1 = name_1;

    }

    @Override
    public BodyPart_1 attack() {
        return null;
    }

    @Override
    public BodyPart_1 defense() {
        return null;
    }
}
