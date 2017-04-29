package com.company.Lesson25.Test02_1;

/**
 * Created by Mila on 4/28/2017.
 *///6.1 В методах attack() и defense() инициализировать переменную hitCount рандомным числом от 1 до 4.
public interface Defensable_1 {
    BodyPart_1 defense();
    int hitCount_1 = (int) Math.random()*4;
}
