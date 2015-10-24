package com.company;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by uitschool JV on 10/24/2015.
 */
public class Test {
    public String testField="(testField)";

    public static class MyNested {
        public String nested = "(NESTED)";
        public void nestedShow(){
            System.out.println("Hi im Nested " + nested);
        }
    }
    public class MyInner{
        public String inner = "(INNER)";
        public void innerShow() {
            System.out.println("Hi im Inner "+ inner);
        }
    }
    public void show(){
        System.out.println("Simple Class "+ testField);
    }
}

