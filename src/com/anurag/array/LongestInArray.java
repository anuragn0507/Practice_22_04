package com.anurag.array;

public class LongestInArray {
    public static void main(String[] args) {
        int[] arr = {62, 62, 32, 1, 12, 18, 81};
//        int[] arr = {1,1};
        longestIncreasingSubarray(7, arr);
    }

    public static void longestIncreasingSubarray(int n,int[] arr){
        int max =0;
        int pcount =1;
        int count =0;


        for(int i=0; i< n ; i++){
            int ele =0;
            for(int j=i; j<n ; j++) {
                if (arr[j] > ele ) {
                    ele = arr[j];
                    count = count + 1;
                }else {
                    break;
                }
            }

                if(pcount <= count){
                    pcount = count;
                }
                count =0;


        }

        System.out.println(pcount);

    }
}
