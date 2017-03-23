package com.company.Lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Mila on 3/3/2017.
 */
/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Integer> nnums = getIntegerList();
        getMinimum(nnums);
    }

    public static List getIntegerList() throws IOException {
        List<Integer> nnums = new ArrayList<>();
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            nnums.add(Integer.parseInt(reader.readLine()));
        }
        return nnums;
    }

    public static void getMinimum(List<Integer> nnums) {
        int minnum = nnums.get(0);

     //   for (int i = 0; i < nnums.size(); i++) {
      //      if (nnums.get(i) < minnum) {
     //           minnum = nnums.get(i);
    //        }
     //   }

        for (Integer nnum : nnums) {
            if (nnum < minnum) {
                minnum = nnum;
            }
        }
        System.out.println(minnum);
    }

}
