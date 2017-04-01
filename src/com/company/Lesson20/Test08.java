package com.company.Lesson20;

/**http://www.quizful.net/post/java-exceptions
 * Created by Mila on 3/31/2017.
 */
/* Перехватывание исключений
//1. Есть три исключения последовательно унаследованные от Exception:
//2. class Exception1 extends  Exception
//3. class Exception2 extends  Exception1
//4. class Exception3 extends  Exception2
//5. Есть метод, который описан так:
//5.1. public static void method1() throws Exception1, Exception2, Exception3
//
//6. Напиши catch, который перехватит все три Exception1, Exception2 и Exception3
//*/
public class Test08 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception1 e) {
        }
    }
    public static void method1() throws Exception1, Exception2, Exception3{
        int numex = (int)Math.random()*3;
        if(numex==1){
            throw new Exception1();
        }
        if(numex==2){
            throw new Exception2();
        }
        if(numex==3){
            throw new Exception3();
        }
    }
}

class Exception1 extends  Exception{}
class Exception2 extends  Exception1{}
class Exception3 extends  Exception2{}