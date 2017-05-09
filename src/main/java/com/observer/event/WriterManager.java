package com.observer.event;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shliangyan on 2017/5/2.
 */
public class WriterManager {
    private Map<String, Writer> writerMap = new HashMap<>();

    //添加作者
    public void add(Writer writer){
        writerMap.put(writer.getName(), writer);
    }

    public Writer getWriter(String name){
        return writerMap.get(name);
    }

    private WriterManager(){}

    public static WriterManager getInstance(){
        return WriterManagerInstance.instance;
    }

    private static class WriterManagerInstance{
        private static WriterManager instance = new WriterManager();
    }

}
