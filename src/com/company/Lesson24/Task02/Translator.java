package com.company.Lesson24.Task02;

import com.company.Lesson24.Task01.DBObject;

/**
 * Created by Mila on 4/27/2017.
// */
//В классе Translator создать абстрактный метод getLanguage() и не абстрактный метод
////    public String translate(), который возвращает строку "Я переводчик с " + getLanguage();
public abstract class Translator {

    abstract String getLanguage();

    public String translate(){
        String str = "Я переводчик с " + getLanguage();
        return str;
    }





//    int a = 5;
//
//    abstract void met();
//
//    void met2(){}
}
