package com.observer;

import java.util.Observable;

/**
 * Created by shliangyan on 2017/5/2.
 */
public class Writer extends Observable{
    private String name;

    private String lastNovel;

    public Writer(String name, String lastNovel) {
        this.name = name;
        this.lastNovel = lastNovel;
    }

    public void addNovel(String novel){
        System.out.println(name + "发布" + novel);
        lastNovel = novel;
        setChanged();
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNovel() {
        return lastNovel;
    }

    public void setLastNovel(String lastNovel) {
        this.lastNovel = lastNovel;
    }
}
