package com.company.Lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Mila on 2/24/2017.
 */
/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<String, String> samenames = new HashMap<>();
intomap(samenames);
lastname(samenames);
firstname(samenames);

    }

    public static void intomap (Map<String, String> samenames) throws IOException {
        for (int i = 0; i < 5; i++) {
            samenames.put(reader.readLine(), reader.readLine());

        }

    }

    public static void lastname (Map<String, String> samenames) throws IOException {
        Iterator<Map.Entry<String,String>> iterlastname = samenames.entrySet().iterator();
        System.out.println("Введите Фамилию для поиска:");
        String lastname = reader.readLine();
        int namenmb = 0;
        while (iterlastname.hasNext()){
            if(iterlastname.next().getKey().equals(lastname)){
                namenmb++;
            }
        }
        System.out.println(namenmb);
    }
    public static void firstname (Map<String, String> samenames) throws IOException {
        Iterator<Map.Entry<String,String>> iterfirstname = samenames.entrySet().iterator();
        System.out.println("Введите Имя для поиска:");
        String firstname = reader.readLine();
        int namenmb = 0;
        while (iterfirstname.hasNext()){
            if(iterfirstname.next().getValue().equals(firstname)){
                namenmb++;
            }
        }
        System.out.println(namenmb);
    }
}
