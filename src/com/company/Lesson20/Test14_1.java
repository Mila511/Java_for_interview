package com.company.Lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 4/7/2017.
 */
//* Метод в try..catch
//Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
//Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader-а)
//этого метода в try..catch.
//Если пользователь ввёл какой-то текст, вместо ввода числа,
//то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
//Числа выводить с новой строки сохраняя порядок ввода.
//*/
public class Test14_1 {
    public static void main(String[] args) throws IOException {
      //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        readData();
    }

    public static void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbs = new ArrayList<>();
        String inpt = "";
        try {

            //String inpt = "";
            while (true) {
                inpt = reader.readLine();
                if (inpt.isEmpty()) {
                    break;
                }
                numbs.add(Integer.parseInt(inpt));
            }
        }catch (NumberFormatException e){
            for (Integer numb : numbs) {
                System.out.println(numb);
            }
            System.out.println("Введен символ: " +inpt+". Наполняемый массив должен быть Integer");
        }
    }
}
//
