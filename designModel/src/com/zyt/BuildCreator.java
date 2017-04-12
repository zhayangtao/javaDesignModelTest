package com.zyt;

/**
 * Created by jovi on 2017/4/11.
 */
public class BuildCreator implements Creator{
    @Override
    public Light createLight() {
        return new BulidLight();
    }
}
