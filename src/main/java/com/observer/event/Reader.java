package com.observer.event;

/**
 * Created by jovi on 2017/5/2.
 */
public class Reader implements WriterListener{

    private String name;

    public String getName() {
        return name;
    }

    public Reader(String name) {
        this.name = name;
    }

    public void sunscribe(String writerName){
        WriterManager.getInstance().getWriter(writerName).registerListener(this);
    }

    public void unsunscribe(String writerName){
        WriterManager.getInstance().getWriter(writerName).unregisterListener(this);
    }

    @Override
    public void addNovel(WriterEvent writerEvent) {
        Writer writer = writerEvent.getWriter();
        System.out.println(name + "知道" + writer.getName() + "发布" + writer.getLastNovel());
    }
}
