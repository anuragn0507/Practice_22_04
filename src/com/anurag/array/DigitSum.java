package com.anurag.array;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("No. of test cases");
        int test = in.nextInt();
        for(int l=0; l<test ; l++){
            System.out.println("Size of input");
            int size = in.nextInt();
            int [] arr = new int[size];
            for(int i=0; i< size ; i++){
                arr[i] = in.nextInt();
            }

            for(int i=0; i<size; i++){
                int sum = 0;
                int di  = arr[i];
                while(di % 10 > 0){
                    int sum1 = di % 10;
                    sum = sum + sum1;
                    di   = di / 10;
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }

    }
}
