package com.anurag.array;

public class TargetValue {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 6, 9, 4, 8};

        countSuchPairs(8, 11, arr);

    }

    public static void countSuchPairs(int n, int target, int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= n - 1; j++) {
                for (int k = i; k <= j; k++) {

                    sum = sum + arr[k];

                }
                if (sum == target) {
                    count = count + 1;
                }
                sum = 0;
            }

        }

        System.out.println(count);

    }
}
