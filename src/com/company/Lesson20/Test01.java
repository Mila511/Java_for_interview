package com.company.Lesson20;

import java.io.FileNotFoundException;

/**
 *
 * Throwable
 *  - Exception checked/unchecked
 *      - IOException checked
 *      - RuntimeException unchecked
 *  - Error unchecked
 *
 * throws
 * try
 * catch
 * finally
 * throw
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            int a = 57 / 3;
            String s = null;
            s.toLowerCase();
            System.out.println("Block try");
            int b = 57 / 2;
        } catch(ArithmeticException e){
            System.out.println("Problem with ar!");
        } catch(NullPointerException e){
            System.out.println("Problem with file!");
        } finally {
            System.out.println("Finally block");
        }

      //  throw new ArithmeticException();

        System.out.println("Continue");
    }
}
