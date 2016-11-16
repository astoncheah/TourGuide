package com.example.android.tourguide;

/**
 * Created by cheah on 18/10/16.
 */

public class TourInfomation {
    String name;
    int imgResId;

    public TourInfomation(String name, int imgResId) {
        this.name = name;
        this.imgResId = imgResId;
    }

    public String getName() {
        return name;
    }

    public int getImgResId() {
        return imgResId;
    }
}
