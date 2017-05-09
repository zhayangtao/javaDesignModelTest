package com.decorator;

/**
 * Created by shliangyan on 2017/5/4.
 */
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void methodB(){
        System.out.println("扩展的B方法");
    }

    @Override
    public void method() {
        System.out.println("添加B包装");
        super.method();
        System.out.println("B包装结束");
    }
}
