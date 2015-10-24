package com.company;

/**
 * Created by uitschool JV on 10/24/2015.
 */
public interface MyInterface {

    int B = 10;

    enum Enum_in_interface{A,B,C};

    static void static_method_in_interface() {
        System.out.println("Hi From static method");
    }

    default  void default_method_in_interface(){
        System.out.println("Hi From Default");
    }

    class Class_in_interface{
        public void print(){
            System.out.println("Hi From Class");
        }
    }

    interface Interface_in_interface{};
}
