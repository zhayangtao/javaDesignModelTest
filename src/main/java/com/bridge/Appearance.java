package com.bridge;

/**
 * Created by shliangyan on 2017/5/4.
 */
public interface Appearance {
    void show();
}

class Loser implements Appearance{

    @Override
    public void show() {
        System.out.println("loser");
    }
}

class TRH implements Appearance{

    @Override
    public void show() {
        System.out.println("TRH");
    }
}