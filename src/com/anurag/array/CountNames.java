package com.anurag.array;

import java.util.Arrays;
import java.util.Scanner;

public class CountNames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }

        Count(str);
    }

    public static void Count(String[] str){
        int n = str.length;
        Arrays.sort(str);
//        System.out.println(Arrays.toString(str));
        String[] str2 = new String[n];

        int top = -1;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(top == -1){
                top++;
                count++;
                str2[top] = str[i];
//                System.out.println(str2[top]);
            }
            else if(str2[top].equals(str[i])){
                count++;
            }
            else{
                if(i<n-1) {
                    System.out.println(str2[top] + " " + count);
                    top++;
                    count = 0;
                    str2[top] = str[i];
                    count++;
                }
                else if(i== n-1){
                    System.out.println(str2[top] + " " + count);
                    top++;
                    count = 0;
                    str2[top] = str[i];
                    count++;
                    System.out.println(str2[top] + " " + count);
                }
            }
        }
    }


}

