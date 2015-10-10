package com.company;

/**
 * Created by uitschool JV on 10/10/2015.
 */
public class Overload {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        double result;

        od.test();
        od.test(2);
        od.test(2,4);
        result = od.test(1.23);

        System.out.println(result);
    }
}
