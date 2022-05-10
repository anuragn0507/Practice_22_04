package com.anurag;
import java.util.Scanner;
public class IsEqualsto {
    public static void main(String[] args){
            int n;

            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = s.nextInt();
            }

            Equalsto(n, arr);
        }

        static void Equalsto(int n, int[] arr ){
            for(int i=0; i<n ; i++){
                if(i==42){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }

}
