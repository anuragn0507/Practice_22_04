package com.anurag;

public class StringBuilderPosition {
    public static void main(String[] args) {
        String str = "abc";

        StringBuilder strB = new StringBuilder(str);
        strB.append("a");
        strB.replace(0,1, "b");
        strB.replace(2,2, "c");
        strB.deleteCharAt(1);
        strB.replace(1,1,"z");
        System.out.println(strB);
    }
}
