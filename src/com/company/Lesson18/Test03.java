package com.company.Lesson18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Mila on 3/17/2017.
 */
/*
Задача: Программа определяет, какая семья (фамилию) живёт в указанном городе.
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/
public class Test03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<String, String> cityfam = new HashMap<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            cityfam.put(s, reader.readLine());
        }
        chekcityfam(cityfam);
    }

    public static void chekcityfam(Map<String, String> cityfam) throws IOException {
        String s = reader.readLine();
        Iterator<Map.Entry<String, String>> itercf = cityfam.entrySet().iterator();
        while (itercf.hasNext()) {
            Map.Entry<String, String> city = itercf.next();
            if (city.getKey().equals(s)) {
                System.out.println(city.getValue());
            }
        }
    }
}
