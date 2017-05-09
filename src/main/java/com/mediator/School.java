package com.mediator;

/**
 * Created by shliangyan on 2017/5/4.
 */
public abstract class School {
    public void defense(){
        System.out.println(getName() + "防御");
    }

    public void attack(School school){
        System.out.println(getName() + "攻击" + school.getName());
    }

    public abstract String getName();
}
