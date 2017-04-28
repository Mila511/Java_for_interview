package com.company.Lesson24.Task03;

/**
 * Created by Mila on 4/27/2017.
 */
//3. В классе Today реализовать интерфейс Weather.
//4. В классе Today создать переменную String type; toString() в классе Today, что бы он выводил на экран
//надпись %s for today, где %s - тип погоды
public class Today implements Weather {
    String type;

    public Today(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s for today", type);
    }

    @Override
    public String getWeatherType() {
        return type;
    }
}
