package com.decorator;

/**
 * Created by shliangyan on 2017/5/3.
 */
public class ConcreteDecoratorA extends Decorator {


    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void methodA(){
        System.out.println("被A扩展的方法");
    }

    @Override
    public void method() {
        System.out.println("添加A包装");
        super.method();
        System.out.println("A包装结束");
    }
}
