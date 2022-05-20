package com.anurag.array;

public class PrintDiagonal {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28},
                {29, 30, 31, 32, 33, 34, 35},
                {36, 37, 38, 39, 40, 41, 42},
                {43, 44, 45, 46, 47, 48, 49},
                {50, 51, 52, 53, 54, 55, 56},
                {57, 58, 59, 60, 61, 62, 63},
                {64 ,65 ,66 ,67 ,68 ,69, 70}};
        specificDiagonals(10, 7, arr, 5);
    }
    public static void specificDiagonals(int n,int m,int[][] arr,int k){
        int mr =0;
        int mc = 0;
        int lsr = 0;
        int lsc = 0;
        int rsr =0;
        int rsc = 0;
        for( int i=0; i< n; i++) {
            for ( int j = 0; j < m ; j++) {

                if (arr[i][j]  == k) {
                    mr = i;
                    mc = j;
                    break;
                }
            }

        }

        int dir = mr;
        int dic = mc;
            while(dir!=0 && dic !=0){
                        dir--;
                        dic--;

                    }
                    lsr = dir;
                    lsc = dic;
                    while(( mc != m-1) && (mr !=0 )){
                        mr--;
                        mc++;
                    }
                    rsr = mr;
                    rsc = mc;

            while(lsr <n && lsc<m ){
            System.out.print(arr[lsr][lsc] + " ");
            lsr++;
            lsc++;
        }
        System.out.println();

        while(rsr < n && rsc >= 0 ){
            System.out.print(arr[rsr][rsc] + " ");
            rsr++;
            rsc--;
        }
    }

}
