package com.company;

/**
 * Created by uitschool JV on 10/18/2015.
 */
public class Ball {
    public static int count = 0;
    static int getCountInstance(){
        return count;
    }

    private String color = "None";
/*
    public Ball(String color) {
        this.color = color;
        count++;
    }
*/
    protected void finalize() {
        count--;
    }

}
