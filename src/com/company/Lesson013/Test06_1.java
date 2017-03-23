package com.company.Lesson013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mila on 2/15/2017.
 */
public class Test06_1 {

        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws IOException {
            int[] array1 = initializeArray1(10);
            int maxNumber = max (array1);
            System.out.println(maxNumber);
        }

        private static int[] initializeArray1(int n) throws IOException {
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++)
                array[i] = Integer.parseInt(reader.readLine());

            return array;
        }

        private static int max(int[] array) {
            int maxx = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxx) {
                    maxx = array[i];
                }
            }
            return maxx;
        }
    }


