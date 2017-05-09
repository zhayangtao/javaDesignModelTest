package com.decorator;

import org.junit.Test;

/**
 * Created by shliangyan on 2017/5/4.
 */
public class MainTest {

    @Test
    public void test1() {
        Component component = new ConcreteComponent();  //原始对象
        System.out.println("******************");
        component.method();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);//装饰成A
        System.out.println("*******************");
        concreteDecoratorA.method();

        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);//装饰成B
        System.out.println("********************");
        concreteDecoratorB.method();

        System.out.println("********************");
        concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);  //先装饰成A再装饰成B
        concreteDecoratorB.method();

    }


}
