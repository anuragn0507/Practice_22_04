package com.anurag;

public class SwapCaseAscii {
    public static void main(String[] args) {
        String str= "Test";
        AsciiCase(str);

    }

    static void AsciiCase(String str){
        int ln = str.length();
        char strArr[] = str.toCharArray();
        for(int i=0; i< ln; i++){
            if(strArr[i] >= 'a' && strArr[i]<='z'){
                //convert lowercase to uppercase
                strArr[i] = (char) ((int)strArr[i] -32);
            }

            else if(strArr[i] >= 'A' && strArr[i]<='A'){
                //convert lowercase to uppercase
                strArr[i] = (char) ((int)strArr[i] + 32);
            }
        }

        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
        }
    }
}
