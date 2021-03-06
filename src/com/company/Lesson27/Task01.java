package com.company.Lesson27;

import java.io.*;

/**
 * Created by Mila on 5/15/2017.
 */
/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Если файла по заданному пути не существует, запросить ввод имени файла еще раз.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Task01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        FileInputStream inStreem;

        while (true) {
            try {
                inStreem = new FileInputStream(reader.readLine());
                break;
            } catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException");

            }
        }
        FileOutputStream outStream = new FileOutputStream(reader.readLine());
        int count = 0;
        while (inStreem.available() > 0) {
            int data = inStreem.read();
            outStream.write(data);
            count++;
        }
        System.out.println(count);

        inStreem.close();
        outStream.close();
    }
}
