package com.bridge;

/**
 * Created by shliangyan on 2017/5/4.
 */
public abstract class Soul {
    private Appearance appearance;
    private Skills skills;

    public void show(){
        appearance.show();
    }

    public void releaseSkills(){
        skills.releaseSkills();
    }

    public void createShadow(){
        System.out.println("create shadow");
    }

    public abstract void doAllLikePeople();

    public Soul() {
        super();
    }

    public Soul(Appearance appearance) {
        this.appearance = appearance;
    }

    public Soul(Skills skills) {
        this.skills = skills;
    }

    public Soul(Appearance appearance, Skills skills) {
        this.appearance = appearance;
        this.skills = skills;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }
}

