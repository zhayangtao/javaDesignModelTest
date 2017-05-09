package com.observer.event;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jovi on 2017/5/2.
 */
public class Writer {
    private String name;
    private String lastNovel;

    private Set<WriterListener> writerListenerSet = new HashSet<>();

    public Writer(String name) {
        super();
        this.name = name;
        WriterManager.getInstance().add(this);
    }

    public String getName() {
        return name;
    }

    public String getLastNovel() {
        return lastNovel;
    }

    public void addNovel(String novel){
        System.out.println(name + "发布了信息" + novel);
        lastNovel = novel;
        fireEvent();
    }

    private void fireEvent(){
        WriterEvent writerEvent = new WriterEvent(this);
        for (WriterListener writerListener : writerListenerSet) {
            writerListener.addNovel(writerEvent);
        }
    }

    public void registerListener(WriterListener writerListener){
        writerListenerSet.add(writerListener);
    }

    public void unregisterListener(WriterListener writerListener){
        writerListenerSet.remove(writerListener);
    }
}
