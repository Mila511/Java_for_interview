package com.company.Lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mila on 3/10/2017.
 */
public class Test01_1 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String s = reader.readLine();
        char [] scapit = s.toCharArray();
        for (int i = 0; i < s.length() ; i++) {
            if(i==0&&scapit[i]!=' '){
                scapit[i]=Character.toUpperCase(scapit[i]);
            }
            if(i!=0&&scapit[i-1]==' '){
                scapit[i]=Character.toUpperCase(scapit[i]);

            }
        }

            System.out.print(scapit);



        }
    }

