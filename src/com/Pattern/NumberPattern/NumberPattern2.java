package com.Pattern.NumberPattern;

import java.util.Scanner;
//Increment
//         9
//        898
//       78987
//      6789876
//     567898765
//    45678987654
//   3456789876543
//  234567898765432
// 12345678987654321
//
// Decrement
//          1
//         212
//        32123
//       4321234
//      543212345
//     65432123456
//    7654321234567
//   876543212345678
//  98765432123456789


public class NumberPattern2 {
    public NumberPattern2() {
//public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Line : ");
        int n = s.nextInt();
        int k;
    System.out.println("Increment");
        for (int i = 1; i <=n ; i++) {
            k=0;
            for (int j = 1; j <n*2 ; j++) {
                if(j<=n)k++;
                else k--;
                if(j>=n-i+1&&j<=n+i-1){
                    System.out.print(k);
                }else System.out.print(" ");

            }
            System.out.println();
        }

    }
}
