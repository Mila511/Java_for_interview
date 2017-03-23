package com.company.Lesson14;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Mila on 2/16/2017.
 */
/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
0[] 1[] 2[] 3[]
 [] - [] - [] - []
*/
public class Test07 {
    public static void main(String[] args) {


        List<Integer> volume = new ArrayList<>();
        int size = 10;
        for (int i = 0; i < size; i++) {

            volume.add(i);
            System.out.println(i + "-" + volume.get(i));
        }
        System.out.println("==========================================");

        ins10T(volume);
        //System.out.println(delta);
        // rem10T(volume);
        //System.out.println(delta);
    }


    public static void ins10T (List<Integer> volume) {
        Date starttimeins = new Date();
        System.out.println(starttimeins.getTime());
        int size = volume.size();
        int inc = 5;
        int ind = 5;
        int ins = 5;
        int j=0;
        List<Integer> volumeinc10T = new ArrayList<>();
        for (int i = 0; i < volume.size()+inc-1; i++) {
            //System.out.println(i);
            if(i<ind) {
                //int j=0;
                volumeinc10T.add(volume.get(i));
                //System.out.println(i + "-" + volumeinc10T.get(i));
            }

            if (i == ind) {

                for (j = 0; j < inc; j++) {
                    volumeinc10T.add(ins);
                    //System.out.println(i + "-" + volumeinc10T.get(i));

                }

            }
            if(i>ind){

                volumeinc10T.add(volume.get(i));
                //System.out.println(i + "-" + volumeinc10T.get(i+1));
            }
            //System.out.println(i + "-" + volumeinc10T.get(i));

            //Date endtimeins = new Date();
            //  System.out.println(endtimeins.getTime());
            //  long delta = endtimeins.getDate() - starttimeins.getDate();
            //  System.out.println(delta);
        }
        for (int i = 0; i < volumeinc10T.size() ; i++) {
            System.out.println(i+"-"+volumeinc10T.get(i));
        }
    }
}


            //return delta;


   // public static void rem10T(List<Integer> volume) {
   //     Date starttimerem = new Date();
   //     for (int i = 0; i < 10000; i++) {
  //         volume.remove(5);
  //      }
  //      Date endtimerem = new Date();
 //      long delta = endtimerem.getDate() - starttimerem.getDate();
 //       System.out.println(delta);

        // return delta;




