package com.anurag;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            // int a = 78; // already initialised outside the block in the same method,
            // hence you cannot initialized again.
            int c =99;
        }
        System.out.println(c);
        // values initialised in this block , will remain in block

    }

    static void random (int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
