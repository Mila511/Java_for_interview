package com.company.Lesson20;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 * Created by Mila on 3/31/2017.
 */
///* Перехват checked исключений
//В методе processExceptions обработайте все checked исключения.
//Нужно вывести на экран каждое возникшее checked исключение.
//Можно использовать только один блок try..
//*/
public class Test10 {
    public static void main(String[] args) {
        processExceptions();
    }

    public static void processExceptions() {
        try {
            method2();

            method1();
            method3();

        } catch (RemoteException e) {
            System.out.println("RemoteException");
        } catch (IOException e) {
            System.out.println("IOException");

        } catch (NoSuchFieldException e) {
            System.out.println("RemoteException");


        }
    }

    public static void method1() throws IOException {
        throw new IOException();
    }

    public static void method2() throws RemoteException {
        throw new RemoteException();
    }

    public static void method3() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }


}
