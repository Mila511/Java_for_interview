package com.company.Lesson23.Task05;

import java.util.List;

/**
 * Created by Mila on 4/26/2017.
 */
public class AlcoholicBeer implements Drink {
    @Override
    public boolean isAlcoholic() {
        return true;
    }

    @Override
    public String toString() {
        if (isAlcoholic()) {
            return "Hапиток алкогольный";
        } else {
            return "Напиток безалкогольный";
        }
        //toString "Напиток алкогольный", если isAlcoholic() возвращает true "Напиток безалкогольный".
    }
}
