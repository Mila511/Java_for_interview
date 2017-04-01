package com.company.Lesson20;

/**
 * Created by Mila on 3/31/2017.
 */
/* Перехват выборочных исключений
//1. Разберись, какие исключения бросает метод BEAN.methodThrowExceptions.
//2. Метод processExceptions должен вызывать метод BEAN.methodThrowExceptions и обрабатывать исключения:
//2.1. если возникло исключение FileSystemException, то логировать его (вызвать метод BEAN.log) и пробросить дальше
//2.2. если возникло исключение CharConversionException или любое другое IOException, то только логировать его - вызвать
//метод BEAN.log
//3. Добавь в сигнатуру метода processExceptions класс исключения, которое ты пробрасываешь в п.2.1.
//4. В методе main обработай оставшееся исключение - логируй его. Используй try..catch
//
//Подсказка:
//Если ты захватил исключение MyException, которое не хотел захватывать, его можно пробросить дальше кодом вида:
//catch (MyException e) {
//throw e;
//}
//*/
public class Test09 {
    public static void main(String[] args) {
        try{
            // оствш
        }catch (){

    }

    public static void processExceptions (String[] args) {
        BEAN.methodThrowExceptions();
        //2. Метод processExceptions должен вызывать метод BEAN.methodThrowExceptions и обрабатывать исключения:
//2.1. если возникло исключение FileSystemException, то логировать его (вызвать метод BEAN.log) и пробросить дальше
//2.2. если возникло исключение CharConversionException или любое другое IOException, то только логировать его - вызвать
//метод BEAN.log
//3. Добавь в сигнатуру метода processExceptions класс исключения, которое ты пробрасываешь в п.2.1.
        //FileSystemException->(вызвать метод BEAN.log) и пробросить дальше
        //CharConversionException->или любое другое IOException, то только логировать его - вызвать метод BEAN.log
    }

    BEAN.methodThrowExceptions() {

    }
}
