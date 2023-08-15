package com.example.lifeguide;

import java.io.Serializable;

public class profile_2 implements Serializable {
    String s;
    String activity;
    String type;
    String h;
    String cost;
    String j;
    String title;
    public profile_2(String title, String s, String activity, String type, String h, String cost)
    {
        this.s = s;
        this.activity = activity;
        this.type = type;
        this.h = h;
        this.cost = cost;
        this.title = title;
    }
    public profile_2(String title, String s, String activity, String type, String h, String j , String cost)
    {
        this.s = s;
        this.activity = activity;
        this.type = type;
        this.h = h;
        this.cost = cost;
        this.j = j;
        this.title = title;
    }

    public String getS() {
        return s;
    }

    public String getActivity() {
        return activity;
    }

    public void setJ(String j) {
        this.j = j;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setH(String h) {
        this.h = h;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getJ() {
        return j;
    }

    public String getCost() {
        return cost;
    }

    public String getH() {
        return h;
    }

    public String getType() {
        return type;
    }
}
