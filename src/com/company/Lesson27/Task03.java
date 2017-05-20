package com.company.Lesson27;

import java.io.*;

/**
 * Created by Mila on 5/15/2017.
 */
///* Запись в файл
//1. Прочесть с консоли имя файла.
//2. Считывать строки с консоли, пока пользователь не введет строку "exit".
//3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
//*/
public class Task03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String filename = reader.readLine();
        FileOutputStream output = new FileOutputStream(filename);

        String str = "";
        while (!str.equals("exit")) {
            str = reader.readLine();
            output.write((str+"\n").getBytes());
        }

    }
}
