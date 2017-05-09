package com.decorator;

/**
 * Created by shliangyan on 2017/5/3.
 */
public abstract class Decorator implements Component{

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void method() {
        component.method();
    }
}
