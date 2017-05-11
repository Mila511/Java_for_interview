package com.company.Lesson26;

import java.io.*;

/**
 * Created by Mila on 5/5/2017.
 */
/*
//Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/
//*/
public class Task01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());

        int count = 0;
        while (inputStream.available() > 0){
            int data = inputStream.read();
            outputStream.write(data);
            count++;
        }

        System.out.println(count);
    }
}
