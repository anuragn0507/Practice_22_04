package com.anurag.interview;

public class ClassEquals {
    public int val;


    public static void main(String[] args) {
        Integer num = 45;

        String a = new String("Anurag");
        String b = new String("Anurag");
        ClassEquals c = new ClassEquals(1000);
        ClassEquals d = new ClassEquals(1000);


        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(c==d);
        System.out.println(c.equals(d));
    }
    public  ClassEquals(int val){
        this.val = val;

    }

}
