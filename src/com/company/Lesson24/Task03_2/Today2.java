package com.company.Lesson24.Task03_2;

/**
 * Created by Mila on 4/27/2017.
 */
public class Today2 implements Weather2 {
    String type2;

    public Today2(String type2) {
        this.type2 = type2;
    }

    @Override
    public String getWeatherType() {
        return type2;
    }

    @Override
    public String toString() {
        return type2+ " for today";
    }
}

