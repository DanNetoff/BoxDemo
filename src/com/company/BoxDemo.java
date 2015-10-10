package com.company;


public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box(10,10,15);
        double vol = myBox.volume();
        double vol2 = myBox2.volume();

        System.out.println(vol);
        System.out.println(vol2);

        myBox = null;
        System.gc();
    }
}
