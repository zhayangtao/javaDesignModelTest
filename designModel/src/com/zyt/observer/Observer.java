package com.zyt.observer;

import java.util.Observable;

/**
 * Created by shliangyan on 2017/4/17.
 */
public interface Observer {
    void update(Observable o, Object arg);
}
