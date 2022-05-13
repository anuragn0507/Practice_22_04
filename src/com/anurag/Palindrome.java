package com.anurag;

public class Palindrome {
    public static void main(String[] args) {
        detectPalindrome("12");
    }

    public static void detectPalindrome(String s){
        int n = s.length();
        String str = "";

        for (int i=n-1; i>= 0; i--){
            str = str + s.charAt(i);
        }


        if(str.equals(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
