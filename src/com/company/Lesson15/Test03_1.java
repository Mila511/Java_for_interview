package com.company.Lesson15;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mila on 2/25/2017.
 */
/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/
public class Test03_1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");

        delsamename(map);
    }

    public static void delsamename(Map<String, String> map) {
        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> ss : map.entrySet()) {
            int counter = 0;
            for (Map.Entry<String, String> s : map.entrySet()) {
                if (ss.getValue().equals(s.getValue())) {
                    counter++;
                }

            }
            if (counter == 1) {
                result.put(ss.getKey(), ss.getValue());
                // System.out.println(ss.getKey()+" "+ss.getValue());
            }
        }
        for (Map.Entry<String, String> res : result.entrySet()) {
            System.out.println(res);
        }


    }


}
