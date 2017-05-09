package com.template;

/**
 * Created by shliangyan on 2017/5/3.
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass("com.template.ClassLoaderTest");
        Object entity = clazz.newInstance();
        System.out.println(entity instanceof ClassLoaderTest);

    }
}
