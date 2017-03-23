package com.company.Lesson013;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Mila on 2/12/2017.
 */
/* HashMap из 4 пар
Создать коллекцию HashMap<String, String>, занести туда 4 пары строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
груша - фрукт
*/
public class Test01 {
    public static void main(String[] args) {
        Map<String, String> fru = new HashMap<>();
        fru.put ("арбуз", "ягода");
        fru.put ("банан", "трава");
        fru.put ("вишня", "ягода");
        fru.put("груша", "фрукт");
        Iterator<Map.Entry<String, String>> i_fru = fru.entrySet().iterator();
        while (i_fru.hasNext()){
            //System.out.println(i_fru.next());
            Map.Entry<String, String> nm_fru = i_fru.next();
            System.out.println(nm_fru.getKey()+"-"+nm_fru.getValue());
        }

    }


}
