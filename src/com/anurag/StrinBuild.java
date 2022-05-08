package com.anurag;

public class StrinBuild {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("masai");
//        sb.append("dd");
//        sb.insert(2, "x");
//        System.out.println(sb.toString());
//
//        sb.replace(1,4,"tttt");
//        System.out.println(sb.toString());

          String str = "Test";
          System.out.println(swap(str, 0, str.length()-1));
    }

    static String swap (String str, int i, int j){
        StringBuilder sb1 = new StringBuilder(str);
        sb1.setCharAt(i, str.charAt(j));
        sb1.setCharAt(j, str.charAt(i));
        return sb1.toString();
    }
}
