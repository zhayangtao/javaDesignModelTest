package com.decorator;

/**
 * Created by shliangyan on 2017/5/3.
 */
public class ConcreteComponent implements Component{

    @Override
    public void method() {
        System.out.println("原来的方法");
    }
}
