package com.Pattern.AlphabetPattern;


import java.util.Scanner;

public class AlphabetPattern1 {
    public AlphabetPattern1(){
        System.out.println("Enter number of Line");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int k;
        for (int i = 1; i <=n ; i++) {
            k=1;
            for (int j=1;j<=n*2;j++){
                if(j>=n+1-i&&j<=n-1+i){ System.out.print(k);
                    if (j<n) {
                        k++;
                    } else {
                        k--;
                    }
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
