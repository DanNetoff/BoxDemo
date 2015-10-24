package com.company;

/**
 * Created by uitschool JV on 10/24/2015.
 */
public class Inner {
    public static void main(String[] args) {
        Test a = new Test();

        a.show();

        Test.MyNested a1 = new Test.MyNested();

        a1.nestedShow();
        Test.MyInner a2 = a.new MyInner();
        Test.MyInner a3 = a.new MyInner();

        a2.innerShow();
        a3.innerShow();
    }
}
