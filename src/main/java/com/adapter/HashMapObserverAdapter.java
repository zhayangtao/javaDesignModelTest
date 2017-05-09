package com.adapter;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by shliangyan on 2017/5/2.
 */
public class HashMapObserverAdapter<K, V>  extends HashMap<K, V> implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        super.clear();
    }
}
