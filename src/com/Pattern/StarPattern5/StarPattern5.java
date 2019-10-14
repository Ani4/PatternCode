package com.Pattern.StarPattern5;

public class StarPattern5 {
//           *
//          ***
//         *****
//        *******
//       *********
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            //for left Half
            for (int j = 5-i; j>=1; j--) System.out.print(" ");
            for (int j = 1; j <=i ; j++) System.out.print("*");
            // for right Half
            for (int j = 1; j <=i-1 ; j++) System.out.print("*");
            for (int j = 5-i; j>=1; j--) System.out.print(" ");
            //Next Line
            System.out.println();
        }
    }
}
