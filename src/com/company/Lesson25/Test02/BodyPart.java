package com.company.Lesson25.Test02;

/**
 * Created by Mila on 4/28/2017.
 */
//В классе BodyPart создать переменную String bodyPart; добавить 4 объекта - части тела ( рука, нога, голова, грудь).
//        Сделать объекты неизменяемыми.
public class BodyPart {
    String bodyPart;

    public BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }
    static final BodyPart bp1 = new BodyPart("рука");
    static final BodyPart bp2 = new BodyPart("нога");
    static final BodyPart bp3 = new BodyPart("голова");
    static final BodyPart bp4 = new BodyPart("грудь");

    @Override
    public String toString() {
        return bodyPart;
    }
}
