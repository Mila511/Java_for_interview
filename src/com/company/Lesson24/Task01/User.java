package com.company.Lesson24.Task01;

/**
 * Created by Mila on 4/27/2017.
 */
//User has name %s, id = %d
public class User implements DBObject{
    long id;
    String name;


    @Override
    public String toString() {
        return "User has name"+ name+" ID "+ id;
    }

    @Override
    public User initializeIdAndName(long id, String name) {
        this.id = id;
        this.name = name;
        return this;
    }
}
