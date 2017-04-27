package com.zyt.observer;

import java.util.Vector;

/**
 * Created by shliangyan on 2017/4/17.
 */
public class Observable {
    private boolean changed = false;
    private Vector obs;

    public Observable(){
        obs = new Vector();
    }
    public synchronized void addObservver(Observer o) {
        if (o == null){
            throw new NullPointerException();
        }
        if(!obs.contains(o)) {
            obs.addElement(o);
        }
    }

    public synchronized void deleteObserver(Observer o) {
        obs.removeElement(o);
    }

}
