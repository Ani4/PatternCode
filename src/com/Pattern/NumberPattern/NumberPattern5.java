package com.Pattern.NumberPattern;

import java.util.Scanner;
//            1
//           12
//          123
//         1234
//        12345
//         1234
//          123
//           12
//            1

public
class NumberPattern5 {

    public
    NumberPattern5 () {
//public static void main(String[] args) {


        Scanner s = new Scanner ( System.in );
        System.out.println ( "Enter number of Line : " );
        int n    = s.nextInt ( );
        int k, x = 0;
        for ( int i = 1 ; i < n * 2 ; i++ ) {
            k = 1;
            if ( i > n ) {
                x--;
            }
            else {
                x++;
            }
            for ( int j = 1 ; j <= n ; j++ ) {
                if ( j >= n - x + 1 ) {
                    System.out.print ( k );
                    k++;
                }
                else {
                    System.out.print ( " " );
                }
            }
            System.out.println ( );
        }
    }

}
