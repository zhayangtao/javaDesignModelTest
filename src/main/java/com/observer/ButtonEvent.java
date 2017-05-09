package com.observer;

import java.awt.*;
import java.util.EventObject;

/**
 * Created by shliangyan on 2017/5/2.
 */
public class ButtonEvent extends EventObject{

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ButtonEvent(Object source) {
        super(source);
    }

    public Button getButton(){
        return (Button) super.getSource();
    }
}

class ClickEvent extends ButtonEvent{

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ClickEvent(Object source) {
        super(source);
    }
}

class DBClickEvent extends ButtonEvent{

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public DBClickEvent(Object source) {
        super(source);
    }
}

class MouseMoveEvent extends ButtonEvent{

    private int x;
    private int y;

    public MouseMoveEvent(Object source, int x, int y) {
        super(source);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
