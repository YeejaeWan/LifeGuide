package com.example.lifeguide;

import java.io.Serializable;

public class profile_1 implements Serializable {
    String name;
    String comment;
    String score;


    public profile_1(String name, String comment, String score)
    {
        this.name = name;
        this.comment = comment;
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public String getScore() {
        return score;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setScore(String score) {
        this.score = score;
    }

}
