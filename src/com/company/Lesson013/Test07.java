package com.company.Lesson013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Mila on 2/16/2017.
 */
public class Test07 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<String,String> str3x2 = new LinkedHashMap<>();
        for (int i = 0; i < 3; i++) {
            str3x2.put(reader.readLine(), reader.readLine());
                    }
        Iterator<Map.Entry<String, String>> iterstr3x2 = str3x2.entrySet().iterator();
        for (int i = 0; i < 3 ; i++) {
            Map.Entry<String, String> vstr3x2 = iterstr3x2.next();
            System.out.println(vstr3x2.getKey()+"-"+vstr3x2.getValue());
        }




    }


}
