package com.company.Lesson25.Test02_1;

/**
 * Created by Mila on 4/28/2017.
 */
//оздать переменную String bodyPart; добавить 4 объекта - части тела ( рука, нога, голова, грудь).
// Сделать объекты неизменяемыми.
public class BodyPart_1 {
    String bodyPart_1;

    public BodyPart_1(String bodyPart_1) {
        this.bodyPart_1 = bodyPart_1;
    }
    static final BodyPart_1 bp1 = new BodyPart_1("рука");
    static final BodyPart_1 bp2 = new BodyPart_1("нога");
    static final BodyPart_1 bp3 = new BodyPart_1("голова");
    static final BodyPart_1 bp4 = new BodyPart_1("грудь");

    @Override
    public String toString() {
        return bodyPart_1;
    }
}
