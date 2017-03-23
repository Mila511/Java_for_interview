package com.company.Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/13/2017.
 */
//Разделение массива на два – чётных и нечётных чисел
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Integer> chetnech = new ArrayList<>();
        List<Integer> chet = new ArrayList<>();
        List<Integer> nech = new ArrayList<>();

        while (true){
            String nmb = reader.readLine();
            if (nmb.isEmpty()){
                break;
            }
            chetnech.add(Integer.parseInt(nmb));
        }
        for (int i = 0; i < chetnech.size() ; i++) {
            if (chetnech.get(i)%2==0){
                chet.add(chetnech.get(i));
            }else {
                nech.add(chetnech.get(i));
            }
        }
        for (int i = 0; i < chet.size(); i++) {
            System.out.println(chet.get(i));

        }
     }
}
