package com.Pattern.StarPattern;

import java.util.Scanner;

public class StarPattern7 {

//            ***********
//            ***** *****
//            ****   ****
//            ***     ***
//            **       **
//            *         *

public StarPattern7() {

    System.out.println("Enter number of Line");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j=1;j<n*2;j++){
                if(j<=n-i+1||j>=n-1+i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
