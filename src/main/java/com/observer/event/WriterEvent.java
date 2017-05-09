package com.observer.event;

import java.util.EventObject;

/**
 * Created by jovi on 2017/5/2.
 */
public class WriterEvent extends EventObject{

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public WriterEvent(Object source) {
        super(source);
    }

    public Writer getWriter(){
        return (Writer) super.getSource();
    }
}
