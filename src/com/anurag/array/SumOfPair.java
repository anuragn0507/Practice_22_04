package com.anurag.array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfPair {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();

        for(int l=0; l<test; l++){
            int size = in.nextInt();

            int[] arr = new int[size];

            for(int i=0; i<size; i++){
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            int k = in.nextInt();
            // most important line you have to remember;
            int i=0;
            int j=size-1;
            int sum = -1 ;


            while (i<j  ){
                int sum2 = (arr[i] + arr[j]);
                if(sum < sum2 && k> sum2){
                    sum = sum2;
                }
                if(sum2 < k){
                    i++;
                }
                else if(sum >= k ){
                    j--;
                }
            }
            System.out.println(sum);
        }
    }
}
