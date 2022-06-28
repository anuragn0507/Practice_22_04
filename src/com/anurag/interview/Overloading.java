package com.anurag.interview;

public class Overloading {
    public static void main(String[] args) {
         Geek ibj = new Geek();
         ibj.geekIdentity(15, "anurag");
         ibj.geekIdentity("anurag", 15);
    }

}

class Geek{
    public void geekIdentity(int nameid , String name){
        System.out.println("geekNameId:" + nameid + " "+ " IdName :" + name);
    }

    public void geekIdentity(String name , int nameid){
        System.out.println("geekidName" + name + " nameid" + nameid);
    }


}
