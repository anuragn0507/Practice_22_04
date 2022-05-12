package com.anurag;

public class FourTwenty {
    public static void main(String[] args) {
        catch420("54205420");
    }

    public static void catch420(String s){
        int n = s.length();
        String str = " ";
        String stt = "420";

        for(int i=0; i<n-2 ; i++){
            str = s.substring(i,i+3);
            if(str.equals(stt)){
                System.out.println("Caught");
                break;
            }
        }

        if(!str.equals(stt)){
            System.out.println("Escaped");
        }

    }

}
