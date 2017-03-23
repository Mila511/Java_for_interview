package com.company.Lesson15; /**
 * Created by Mila on 2/24/2017.
 */
/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {
        Map<String, Date> map = new HashMap<>();

        smrppl(map);
        delsmrppl(map);
    }

    public static void smrppl (Map<String, Date> map) {

        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 5 1999"));
        map.put("Stallone2", new Date("JUNE 13 1996"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("DECEMBER 1 1980"));
        map.put("Stallone9", new Date("MARCH 1 1980"));

    }

    public static void delsmrppl(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterdel = map.entrySet().iterator();
        while (iterdel.hasNext()){
            int month = iterdel.next().getValue().getMonth();


            if(month>=5&month<=7){
                iterdel.remove();
            }


        }
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
