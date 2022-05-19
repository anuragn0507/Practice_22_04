package com.anurag.array;

import java.util.Arrays;

public class RotateTheArray {
    public static void main(String[] args) {
        int[] arr={1, 2, 3};
        rotateArray(arr,1);
    }

    public static void rotateArray(int[] arr,int k){
        int rot = 1;
        int n = arr.length;

        while(rot <= k){
            int temp=0;
            for(int i=n-1; i>= 0; i--){

                if(i == (n-1)){
                    temp = arr[n-1];
                }
                else if(i==0){
                    arr[i+1] = arr[i];
                    arr[i] = temp;

                }
                else{
                    arr[i+1] = arr[i];
                }
            }
            rot++;

        }
        System.out.println(Arrays.toString(arr));
    }
}
