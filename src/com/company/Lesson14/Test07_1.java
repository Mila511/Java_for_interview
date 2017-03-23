package com.company.Lesson14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mila on 2/17/2017.
 */
public class Test07_1 {
    public static void main(String[] args) {
        List arrlst = new ArrayList();
        List linkedlst = new LinkedList();
        ins10T(arrlst);
        get10T(arrlst);
        set10T(arrlst);
        rem10T(arrlst);
        //
        ins10T(linkedlst);
        get10T(linkedlst);
        set10T(linkedlst);
        rem10T(linkedlst);

    }

    public static void ins10T(List list) {
        for (int i = 0; i < 10_000; i++) {
            list.add(0, new Object());
        }
    }

    public static void get10T(List list) {
        for (int i = 0; i < 10_000; i++) {
            list.get(i);

        }
    }

    public static void set10T(List list) {
        for (int i = 0; i < 10_000; i++) {
          list.set(i,new Object());
        }
    }

    public static void rem10T(List list) {
        for (int i = 0; i < list.size() ; i++) {
            list.remove(0);
        }
    }


}
