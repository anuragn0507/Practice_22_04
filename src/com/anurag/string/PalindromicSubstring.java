package com.anurag.string;

import java.util.*;
import java.lang.*;;


import java.io.*;

public class PalindromicSubstring {
    public static void main(String[] args) {
        // Your code goes here
//        String s = "thisracecarisgood";
//        longestPalSubstr(s);

        longestPalSubstr("abbaccacc");
     System.out.println(isPalindrome("abbacdd"));

    }

    public static void longestPalSubstr(String str) {
        int maxL = 1;
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length() ; j++) {
                System.out.println(str.substring(i,j));
                 str2 = str.substring(i,j);

                  if(isPalindrome(str2) && (str2.length() > maxL)){
                      maxL = str2.length();
                      System.out.println(maxL);
                  }
            }

        }
        System.out.println(maxL);
    }

    public static boolean isPalindrome(String Substr){
        int sl= Substr.length();
        boolean flag = true;
        int i =0;
        int j = sl-1;
        while(i<j)
             {
                if(Substr.charAt(i) != Substr.charAt(j)){
                    flag = false;
                }
                i++;
                j--;
            }

        return flag;
    }

}
