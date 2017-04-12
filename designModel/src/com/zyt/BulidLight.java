package com.zyt;

/**
 * Created by Jovi on 2017/4/11.
 */
public class BulidLight implements Light {

    @Override
    public void turnOn() {
        System.out.println("BuildLight On");
    }

    @Override
    public void turnOff() {
        System.out.println("BuildLight off");
    }
}
