package com.zyt;

/**
 * Created by shliangyan on 2017/4/11.
 */
public class TubeLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("TubeLight On");
    }

    @Override
    public void turnOff() {
        System.out.println("TubeLight off");
    }
}
