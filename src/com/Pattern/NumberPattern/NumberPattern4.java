package com.Pattern.NumberPattern;

import java.util.Scanner;

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


public class NumberPattern4 {
    public NumberPattern4() {
//    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Line : ");
        int n = s.nextInt();
        int k;

//        System.out.println("\n Decrement");
        for (int i = 1; i <=n ; i++) {
            k=i;
            for (int j = 1; j <n*2 ; j++) {

                if(j>=n-i+1&&j<=n+i-1){
                    System.out.print(k);
                    if(j<n)k++;
                    else k--;
                }else System.out.print(" ");

            }
            System.out.println();
        }
    }
}
