package com.anurag.array;

public class ZigZag {
    public static void main(String[] args){
        int[][] arr= { {4, 7, 1, 1, 7},
                {8, 9, 9, 6, 1 },
                {6, 4, 9, 5, 1},
                {7, 7, 4,7, 7},
                {8, 6, 2, 5, 5}};
        solve(5,5,arr);
    }

    public static void solve(int n,int m,int[][] arr){
        for (int i=0; i<n ; i++){
            if((i==0) || (i%2==0)){
                for(int j= m-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else if((i==1) || (i%2==1)){
                for(int j=0; j< m; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }
}
