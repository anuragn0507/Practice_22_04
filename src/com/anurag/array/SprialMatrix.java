package com.anurag.array;

import java.util.List;
import java.util.*;

public class SprialMatrix {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10,11,12 },
                      { 13, 14,15,16 } };

        spiralOrder(4,4,a);

    }

    public static void spiralOrder(int r, int c, int[][] matrix) {

        int rs = 0, cs = 0;
        // r- ending row index of row
        // c- ending column index

        while (rs < r && cs < c) {
            // Print the first row from the remaining row
            for (int j = cs; j < c; j++) {
                System.out.println(matrix[0][j]);

            }
            rs++;

            // print the last column from the remaining columns
            for (int i = rs; i < r; i++) {
                System.out.println(matrix[i][c - 1]);
            }
            c--;

            // print the last row from the remaining row
            if (rs < r) {
                for (int j = c - 1; j >= 1; j--) {
                    System.out.println(matrix[r - 1][j]);
                }
                r--;
            }

            // print the first column from remaining column
            if (cs < c) {
                for (int i = r - 1; i >= rs; i--) {
                    System.out.println(matrix[i][cs]);
                }
                cs++;
            }

        }
    }
}
