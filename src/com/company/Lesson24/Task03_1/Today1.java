package com.company.Lesson24.Task03_1;

/**
 * Created by Mila on 4/27/2017.
 */
//Переопределить метод toString() в классе Today, что бы он выводил на экран
//       надпись %s for today, где %s - тип погоды
public class Today1 implements Weather1 {
    String type1;

    public Today1(String type1) {
        this.type1 = type1;
    }

    @Override
    public String toString() {
        return type1 + " for today";
    }

    @Override
    public String getWeatherType() {
        return type1;
    }
}
