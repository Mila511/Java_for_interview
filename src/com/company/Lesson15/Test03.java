package com.company.Lesson15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Mila on 2/24/2017.
 */
/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/
public class Test03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Map<String, String> fi = new HashMap<>();
        fiadd(fi);
        fidel(fi);

    }

    public static void fiadd(Map<String, String> map) {

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

    }

    public static void fidel(Map<String, String> fi) {
        Map<String, String> result = new HashMap<>();

        for (Map.Entry<String, String> s : fi.entrySet()) {
            int dbl = 0;
            for (Map.Entry<String, String> ss : fi.entrySet()) {
                if (s.getValue().equals(ss.getValue())) {
                    dbl++;

                }

            }
            if (dbl == 1) {
                result.put(s.getKey(), s.getValue());
            }
        }
        for(Map.Entry<String,String> entry : result.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
