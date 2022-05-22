package com.anurag.array;

public class LargestWithNeighbour {
    public static void main(String[] args) {
        int[] A= { 2, 0, 4 ,9, 2, 0, 3, 5, 0, 9, 8, 10};
       competeWithNeighbour(12, A);
    }

    public static void competeWithNeighbour(int N, int A[]) {
        int count = 0;
        int m = 0;


        while (m <= (N - 1)) {
            if (m == 0) {

                int r = m + 1;
                if ( A[m] > A[r]) {
                    count = count + 1;
                }
                m++;
            }

            else if (m == (N - 1)) {
                int l = m - 1;

                if (A[l] < A[m]) {
                    count = count + 1;
                }
                m++;
            }

            else if( m != 0 && (m != (N - 1))){
                int r = m + 1;
                int l = m - 1;
                if (A[l] < A[m] && A[m] > A[r]) {
                    count = count + 1;
                }
                m++;
            }
        }
        System.out.println(count);
    }

}
