package com.strategy;

/**
 * Created by shliangyan on 2017/5/2.
 */
public class MyClass {
    public void myMethod(MyInterface myInterface) {
        System.out.println("方法里的代码1");
        myInterface.insertCode();
        System.out.println("方法里的代码2");
    }
}
