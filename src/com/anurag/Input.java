package com.anurag;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[4] = 3;

        System.out.println(arr[3]);

        //input using for loops
        for(int i=0; i< arr.length ; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i< arr.length ; i++){
            System.out.println(arr[i]);
        }

    }


}
