package com.company.Lesson25.Test02;

/**
 * Created by Mila on 4/28/2017.
 */
//В методах attack() и defense() инициализировать переменную hitCount рандомным числом от 1 до 4
abstract class AbstractRobot implements Attackable, Defensable {
    private String name;
    private static int hitCount;

    public AbstractRobot(String name) {
        this.name = name;
    }

    @Override
    public BodyPart attack() {
        hitCount = (int) (Math.random() * 4 + 1);
        BodyPart attacked = null;
        if(hitCount==1){
            attacked = BodyPart.bp1;
        }
        if(hitCount==2){
            attacked = BodyPart.bp2;
        }
        if(hitCount==3){
            attacked = BodyPart.bp3;
        }
        if(hitCount==4){
            attacked = BodyPart.bp4;
        }
        return attacked;
    }

    @Override
    public BodyPart defense() {
        BodyPart defenced = null;
        hitCount = (int) (Math.random() * 4 + 1);
        if(hitCount==1){
            defenced = BodyPart.bp1;
        }
        if(hitCount==2){
            defenced = BodyPart.bp2;
        }
        if(hitCount==3){
            defenced = BodyPart.bp3;
        }
        if(hitCount==4){
            defenced = BodyPart.bp4;
        }
        return defenced;
    }

    public String getName() {
        return name;
    }
}
