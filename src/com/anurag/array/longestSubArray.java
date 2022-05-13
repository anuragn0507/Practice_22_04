package com.anurag.array;

public class longestSubArray {
    public static void main(String[] args) {

    }

    public static void longestIncreasingSubarray(int n,int[] arr){
        int max =0;
        int[] arr1 = {};
        for(int i=1; i< n ; i++){
            while(arr[i-1]<arr[i]){
//                arr1.add(arr[i]);
            }
            i++;

            if(max< arr1.length){
                max = arr1.length;
            }

        }
    }

}
