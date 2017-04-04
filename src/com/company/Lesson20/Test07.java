package com.company.Lesson20;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Created by Mila on 3/31/2017.
 */
/* Исключения
//Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
//NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.
//
//Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
//ArithmeticException и URISyntaxException.
//*/
public class Test07 {
    public static void main(String[] args) throws URISyntaxException {
        try {
            gener();
        } catch(NullPointerException e){
        } catch (FileNotFoundException e){
        }
    }

    public static void gener() throws FileNotFoundException, URISyntaxException {

        int exnum = (int) (Math.random() * 4);
        if (exnum == 0) {
            throw new NullPointerException();
        }
        if (exnum == 1) {
throw new ArithmeticException();
        }
        if (exnum == 2) {
throw new FileNotFoundException();
        }
        if (exnum == 3) {
throw new URISyntaxException("", "");
        }
    }
}
