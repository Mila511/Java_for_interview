package com.company.Lesson16HW_CodeFights;

import java.util.*;

/**
 * Created by Mila on 4/16/2017.
 */
public class Test15_1 {
    public static void main(String[] args) {
        int isCouple = 0;
        Integer[] a = {2, 3, 3, 1, 5, 2};
        Integer[] b = new Integer[a.length];//1,2,2,3,3,5
        System.arraycopy(a, 0, b, 0, a.length);
        Arrays.sort(b);
        Set<Integer> onlydupl = new HashSet<>();
        duplToArr(a, onlydupl);
        firstDuplicate(a, onlydupl, isCouple);

    }

    public static Set<Integer> duplToArr(Integer[] a, Set<Integer> onlydupl) {// Двойные->в Set onlydupl
        Integer[] b = new Integer[a.length];//1,2,2,3,3,5
        System.arraycopy(a, 0, b, 0, a.length);
        Arrays.sort(b);

        //Set<Integer> onlydupl = new HashSet<>();
        for (int i = 0; i < b.length; i++) {
            if ((i < b.length - 2) && (b[i] == b[i + 1])) {
                onlydupl.add(b[i]);
            }
            if ((i >= b.length - 2)) {
                break;
            }
        }

        return onlydupl;
    }

    public static Integer firstDuplicate(Integer[] a, Set<Integer> onlydupl, int isCouple) {

        List<Integer> alist = new ArrayList<>();
        alist = Arrays.asList(a);
        Iterator<Integer> iterset = onlydupl.iterator();
        int minoccur = 0;
        while (iterset.hasNext()) {//по Set двойников
            int firstin = 0;
            int nextin = 0;
            //int minoccur = 0;
            isCouple = iterset.next();
            for (int i = 0; i < alist.size(); i++) {


                if (alist.get(i) == isCouple) {
                    firstin = i;
                    for (int k = firstin + 1; k < a.length; k++) {
                        if (alist.get(k) == isCouple) {
                            nextin = k;
                            break;
                        }
                    }



                }
            if ((nextin - firstin)<minoccur) {
                minoccur = nextin - firstin;//выход с мин. расст
               // break;
            }

            }


        }
 System.out.println("Мин. при " + isCouple);
        return isCouple;
    }
}
