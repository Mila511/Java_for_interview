package com.company.Lesson26;

/**
 * Created by Mila on 5/11/2017.
 */
public class New {

    static class Point {
        int Daj_mne_etot_X() {
            return x;
        }

        int y = Daj_mne_etot_X();
        int x = 3;

        public static void main(String s[]) {
            Point p = new Point();
            System.out.println(p.x + "," + p.y);
        }
    }
}
