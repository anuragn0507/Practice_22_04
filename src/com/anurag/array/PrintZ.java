package com.anurag.array;

public class PrintZ {
    public static void main(String[] args) {
        int[][] arr = {{ 1, 2, 3, 4 },
                {4, 5, 6, 4},
                {7, 8, 9, 4},
                {4, 4, 4, 4} };
        zTraversal(arr);
    }
    public static void zTraversal(int[][] arr){
        int n = arr.length;

        for(int i=0; i< n; i++ ){
            for(int j=0; j< n; j++){
                if((i==0) || (i == n-1)){
                    System.out.print(arr[i][j] + " ");
                }

                if(i==0 && j== n-1)
                {
                    while(i<n-1 && j>0) {
                        System.out.print(arr[i + 1][j - 1] + " ");
                        i++;
                        j--;
                    }

                }

            }
        }
        System.out.println();

    }
}
