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
/* Вывести на экран список значений
Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.
*/
public class Test04 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Map<String, String> strval = new HashMap<>();
        for (int i = 0; i < 3; i++) {

            String nkey = reader.readLine();
            String nval = reader.readLine();
            strval.put(nkey, nval);


        }
        Iterator<Map.Entry<String, String>> i_strval = strval.entrySet().iterator();
        while (i_strval.hasNext()) {
            Map.Entry<String, String> prtval = i_strval.next();
            System.out.println(prtval.getValue());
        }

    }
}
