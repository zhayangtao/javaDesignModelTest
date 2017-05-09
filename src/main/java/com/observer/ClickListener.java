package com.observer;

import java.util.EventListener;

/**
 * Created by shliangyan on 2017/5/2.
 */
public interface ClickListener  extends EventListener{
    void click(ClickEvent clickEvent);
}

interface DBClickListener extends EventListener{
    void dbClick(DBClickEvent dbClickEvent);
}

interface MouseMoveListener extends EventListener{
    void mouseMove(MouseMoveEvent mouseMoveEvent);
}
