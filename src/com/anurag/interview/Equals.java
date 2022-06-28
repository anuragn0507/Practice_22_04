package com.anurag.interview;

public class Equals {
    public static void main(String[] args) {
        int a = 1000;
        Integer b = 1000;

        Integer c = new Integer(1000);
        Integer d = new Integer(1000);

        System.out.println(c);
        System.out.println(b);
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(b.equals(c));
        System.out.println(c.equals(d));
    }
}
