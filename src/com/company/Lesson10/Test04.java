package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mila on 1/20/2017.
 */
/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:

лира
лоза
Выходные данные:
лира
лоза
лоза
*/
public class Test04 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        List<String> rl = new ArrayList<>();
        while (true) {
            String varrl = reader.readLine();
            if (varrl.isEmpty()) {
                break;
            }
            rl.add(varrl);
        }

        fix(rl);

    }

    public static void fix(List<String> rl) {
        List<String> fixrl = new ArrayList<>();
        for (int i = 0; i < rl.size(); i++) {
            if (rl.get(i).contains("р") && rl.get(i).contains("л") || !rl.get(i).contains("р") && !rl.get(i).contains("л")) {
                //as is
                fixrl.add(rl.get(i));
            } else if (rl.get(i).contains("р")) {
                //rem
            } else if (rl.get(i).contains("л")) {
                //doub
                fixrl.add(rl.get(i));
                fixrl.add(rl.get(i));
            }
        }

        for (String s : fixrl) {
            System.out.println(s);
        }
    }

}
//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

