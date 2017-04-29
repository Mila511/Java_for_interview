package com.company.Lesson25.Test01;

import java.util.List;

/**
 * Created by Mila on 4/28/2017.
 */
//8. С помощью цикла реализовать метод tell, который должен віполнять логику вывода на экран с помощью метода pull(Person
public class RepkaStory {
   static void tell(List<Person> plot) {
        Person first = null;
        Person second = null;
        for (int i = plot.size()-1; i >= 1; i--) {
            first = plot.get(i);
            second = plot.get(i - 1);
            first.pull(second);
        }
    }
}
