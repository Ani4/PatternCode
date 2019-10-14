package com.Pattern.StarPattern4;

import java.util.Scanner;

public class StarPattern4 {
//        *****
//        ****
//        ***
//        **
//        *
    public StarPattern4() {
        System.out.println("Enter number of Line");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j=1;j<=n;j++){
                if(j<=n-i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        }
    }

