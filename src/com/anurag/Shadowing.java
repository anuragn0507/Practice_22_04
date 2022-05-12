package com.anurag;

public class Shadowing {
    static int x =90;// this will shadowed at line 8 or where ever x is initialized
    public static void main(String[] args) {
           System.out.println(x);
           int x; // Declaration  // the class variable at line 4 is shadowed by this
//        System.out.println(x);  // scope will begin when value is initialised
           x = 40;   // from here , above it will show the error.
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }

}
