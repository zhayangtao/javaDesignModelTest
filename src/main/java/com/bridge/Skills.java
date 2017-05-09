package com.bridge;

/**
 * Created by shliangyan on 2017/5/4.
 */
public interface Skills {
    void releaseSkills();
}

class Invisible implements Skills {
    @Override
    public void releaseSkills() {
        System.out.println("隐身");
    }
}

class Volant implements Skills{

    @Override
    public void releaseSkills() {
        System.out.println("飞行");
    }
}

class ReadMind implements Skills{

    @Override
    public void releaseSkills() {
        System.out.println("读心术");
    }
}