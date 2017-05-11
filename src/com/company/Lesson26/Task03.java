package com.company.Lesson26;

import java.io.*;

/**
 * Created by Mila on 5/10/2017.
 */
/*
//Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
//Если файла (который нужно копировать) с указанным именем не существует, то
//программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли,
а уже потом считывать файл для записи.
*/
public class Task03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
         String filenameIn = reader.readLine();
        String filenameOut = reader.readLine();

            FileInputStream streamIn;
            try {
                streamIn = new FileInputStream(filenameIn);
            } catch (FileNotFoundException e) {

                System.out.println("FileNotFoundException");
                filenameIn = reader.readLine();
                streamIn = new FileInputStream(filenameIn);

                    FileOutputStream streamOut = new FileOutputStream(filenameOut);
                    int data = 0;
                    int bytecont = 0;
                    while (streamIn.available() > 0) {
                        data = streamIn.read();
                        streamOut.write(data);
                        bytecont++;
                    }
                System.out.println(bytecont);
                }
            }
        }