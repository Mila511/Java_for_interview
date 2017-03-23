package com.company.Lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mila on 2/26/2017.
 */
public class Test04 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] mass10 = new int[10];
        for (int i = 0; i < mass10.length; i++) {
            mass10[i] = Integer.parseInt(reader.readLine());
            
        }
        decr(mass10);
        for (int i : mass10) {
            System.out.println(i);
        }

        
    }

    public static void decr(int [] mass10) {
        int min = mass10[0];
        for (int i = 0; i < mass10.length-1; i++) {
            for (int j = 0; j < mass10.length-1; j++) {
                if(mass10[j]<mass10[j+1]){
                    int trans = mass10[j];
                    mass10[j]=mass10[j+1];
                    mass10[j+1] = trans;
                }
            }

        }
    }
}
