package com.Pattern.AlphabetPattern;


import java.util.Scanner;
//  ABCDEDCBA
//  ABCD DCBA
//  ABC   CBA
//  AB     BA
//  A       A

public class AlphabetPattern1 {
        public AlphabetPattern1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of Line :");
        int n = s.nextInt();
    int k=1;
        for (int i = 1; i <= n; i++) {
            k=1;
            for (int j = 1; j < n*2; j++) {
                if (j <= n + 1 - i || j >= n + i - 1) {
                    System.out.print((char) (65 + (k- 1)));

                } else System.out.print(" ");
                if (j<n) {
                    k++;
                } else {
                    k--;
                }
            }
            System.out.println();
        }
    }


}
