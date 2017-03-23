package com.company.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mila on 2/3/2017.
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        int [] arrmin5 = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arrmin5.length; i++) {
            arrmin5[i] = Integer.parseInt(reader.readLine());

        }
        for (int i = 0; i < arrmin5.length - 1; i++) {
            for (int j = 0; j < arrmin5.length - 1 - i; j++) {
                if(arrmin5[j]<arrmin5[j+1]){
                    int min = arrmin5[j];
                    arrmin5[j] = arrmin5[j+1];
                    arrmin5[j+1] = min;
                }


            }
            System.out.println(arrmin5[0] + " " + arrmin5[1] + " " + arrmin5[2] + " " + arrmin5[3] + " " + arrmin5[4]);

        }



        }
    }

