package com.company.Lesson013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Mila on 2/12/2017.
 */
/* Вывести на экран список ключей
Есть коллекция HashMap<String, String>, туда занесли 3 различные строки.
При помощи метода printKeys:
Вывести на экран список ключей, каждый элемент с новой строки.
*/
public class Test03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<String, String> mapkeys = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            String setk = reader.readLine();
            String setv = reader.readLine();
            mapkeys.put(setk, setv);
        }
        printkeys( mapkeys);


    }

    public static void printkeys(Map<String, String> mapkeys) {
        Iterator<Map.Entry<String, String>> i_mapkeys = mapkeys.entrySet().iterator();
        while (i_mapkeys.hasNext()) {
            Map.Entry<String, String> nkey = i_mapkeys.next();
            System.out.println(nkey.getKey());

        }
    }
}
