package com.company;

/**
 * Created by uitschool JV on 10/18/2015.
 */
public class DemoBlackBox {
    public static void main(String[] args) {
        BlackBox ob1 = new BlackBox(5,10);
        BlackBox ob2 = new BlackBox(5,10);

        System.out.println(ob1.hashCode() + "__" +ob2.hashCode());
    }
}
