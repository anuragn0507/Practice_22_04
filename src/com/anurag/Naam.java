package com.anurag;

public class Naam {
    public static void main(String[] args) {
        int a =10;
        int b= 20;
        swap(a,b);
        System.out.println(a);

        String name = "Anurag Yadav";
        changeName(name);

        System.out.println(name);
    }

     static void  swap(int a, int b) {
        int temp = a;
        a =b;
        b=temp;
         System.out.println(a);
    }

    static void changeName(String naam) {
        naam = "Abhishek Yadav";
    }


}
