package com.anurag.array;

public class Print3Consecutive {
    public static void main(String[] args) {
        int[][] arr= { {1, 2, 1, 8},
                       {2, 2, 8, 6},
                       {8, 1, 2, 5},
                       {2, 5, 8, 6}};
        solve(arr, 4,4,11);

    }
    public static void solve(int[][] arr,int n,int m,int k){
        int count =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-2; j++){
                int sum =0;
                for(int l=j; l<j+3 ; l++){
                    sum = sum + arr[i][l];
                    System.out.print(sum + " ");
                }
                System.out.println();
                if(sum == k){
                    count += 1;
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int j=0; j<n; j++){
            for(int i=0; i<n-2; i++){
                int sum=0;
                for(int l=i; l<i+3;l++){
                    sum = sum + arr[l][j];
                    System.out.print(sum + " ");
                }
                System.out.println();
                if(sum == k){
                    count += 1;
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0 ; i< n-2; i++){
            for(int j=0 ; j<n-2 ; j++){
                int sum=0;
                int p=i;
                int q=j;
                while(p<= i+2  && q<=j+2){
                    sum = sum + arr[p][q];
                    System.out.print(sum + " ");
                    p++;
                    q++;
                }
                if(sum == k){
                    count += 1;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();

        for(int i=n-1 ; i>1; i--){
                    for(int j=0 ; j<n-2 ; j++){
                        int sum=0;
                        int p=i;
                        int q=j;
                        while(p<= i+2  && q<=j+2){
                            sum = sum + arr[p][q];
                            System.out.print(sum + " ");
                            p--;
                            q++;
                        }
                        if(sum == k){
                            count += 1;
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();


                System.out.println(count);
            }

}
