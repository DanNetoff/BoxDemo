package com.company;


public class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width*height*depth;
    }

    Box() {
        width = 10;
        height = 20;
        depth = 14;
    }

    Box(double w,double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    protected void finalize(){
        System.out.println("Say Goodbye HollyWood");
    }
}
