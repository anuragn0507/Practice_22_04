package com.anurag.array;

public class BasicMaths {
    public static void main(String[] args) {
        int[] A= {14, 7, 8, 2, 4};
        applyBasicMaths(5,A);
    }

    public static void applyBasicMaths(int N, int A[]){
        int add = 0;
        int flag = -1;
        for(int i=0; i< N ; i++){
            add = add + A[i];
        }

        for(int j=0; j<N; j++){

            if((add - A[j])%7 == 0 ){
                // System.out.print(A[j] + " ");
                if(j==0){
                    flag =j;
                    // System.out.println(add);
                }
                else if(A[flag] > A[j] && j > 0 ){
                    flag = j;
                }
            }
        }
        System.out.println(flag);
    }
}
