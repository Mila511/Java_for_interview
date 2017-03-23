package com.company.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mila on 2/3/2017.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        int[] arr5 = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = Integer.parseInt(reader.readLine());

        }
        //                  0            1           2          3
                    // 6 5 7 4 8 -> 5 6 7 4 8 -> 5 6 4 7 8-> 5 6 4 7 8 -> 5 4 6 7 8 -> 4 5 6 7 8
        for (int i = 0; i < arr5.length - 1; i++) {      // i=0; i=1; i=2
            for (int j = 0; j < arr5.length - 1 - i; j++) {  //j=0; j=1; j=2; j=3; j=4; j=0; j=1; j=2; j=3; j=4;j=0
                    if (arr5[j] > arr5[j + 1]) {             //arr5[0](5) > arr5[1](4)
                    int tran = arr5[j];                  //yes tran-> (5)
                    arr5[j] = arr5[j + 1];               //arr5[0](5)->(4)
                    arr5[j + 1] = tran;                  //arr5[1] (5)-> tran(4)

                }

            }
            System.out.print(" -> " + arr5[0] + " " + arr5[1] + " " + arr5[2] + " " + arr5[3] + " " + arr5[4] );
        }
        System.out.println();
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }

    }


}



