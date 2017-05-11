package com.company.Lesson26;

import java.io.*;

/**
 * Created by Mila on 5/5/2017.
 */
/*
//Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/
public class Task02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        FileInputStream inpt = new FileInputStream(reader.readLine());
        FileOutputStream outpt = new FileOutputStream(reader.readLine());
        int countbt =0;
        int data = 0;

        while (inpt.available()>0){
            data=inpt.read();
            outpt.write(data);
            countbt++;
        }
        System.out.println(countbt);
    }
}
