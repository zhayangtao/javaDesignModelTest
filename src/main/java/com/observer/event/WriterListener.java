package com.observer.event;

import java.util.EventListener;

/**
 * Created by jovi on 2017/5/2.
 */
public interface WriterListener extends EventListener {
    void addNovel(WriterEvent writerEvent);
}
