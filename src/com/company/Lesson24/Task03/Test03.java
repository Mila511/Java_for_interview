package com.company.Lesson24.Task03;

/**
 * Created by Mila on 4/27/2017.
 */
/* Погода
//1. Создать интерфейс Weather с методом getWeatherType().
//2. Создать интерфейс WeatherType с перечнем погодных условий.
//3. В классе Today реализовать интерфейс Weather.
//4. В классе Today создать переменную String type;
//5. Подумай, как связан параметр String type с методом getWeatherType().
//6. Переопределить метод toString() в классе Today, что бы он выводил на экран
надпись %s for today, где %s - тип погоды
*/
public class Test03 {
    public static void main(String[] args) {
        Today apr27 = new Today(WeatherType.type1);
        System.out.println(apr27.getWeatherType());
    }
}