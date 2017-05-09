package com.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by shliangyan on 2017/5/2.
 */
public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void subscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).addObserver(this);
    }

    public void unsubscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).deleteObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Writer) {
            Writer writer = (Writer) o;
            System.out.println("....");
        }
    }
}
