package com.example.wlw.fruit;

/**
 * Created by wlw on 2016/12/5.
 */
public class Fruit {
    private String title;
    private String desc;
    private int imageID;

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImageID() {
        return imageID;
    }

    public Fruit(int imageID, String title, String desc) {
        this.desc=desc;
        this.title=title;
        this.imageID=imageID;
    }

}
