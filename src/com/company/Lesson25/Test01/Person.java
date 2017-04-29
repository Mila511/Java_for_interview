package com.company.Lesson25.Test01;

/**
 * Created by Mila on 4/28/2017.
 */
public class Person implements RepkaItem {


    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    @Override
    public String getNamePadezh() {
        return namePadezh;
    }

    public void pull(Person person) {
        //который выводит фразу типа '<name> за <person>
        System.out.println(this.name+" за "+ person.getNamePadezh());
    }

}

