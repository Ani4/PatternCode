package com.Pattern.StarPattern;

import java.util.Scanner;

public
class StarPattern8 {
//      *
//     ***
//    *****
//   *******
//    *****
//     ***
//      *

    public
    StarPattern8 ( ) {

        Scanner s = new Scanner ( System.in );
        System.out.println ( "Enter number of Line : " );
        int n = s.nextInt ( );
        int k = 0;
        for ( int i = 1 ; i <= n ; i++ ) {
            if ( i <= ( n + 1 ) / 2 ) {
                k++;
            }
            else {
                k--;
            }
            for ( int j = 1 ; j <= n ; j++ ) {
                if ( j >= ( n + 1 ) / 2 - k + 1 && j <= ( n + 1 ) / 2 + k - 1 ) {
                    System.out.print ( "*" );
                }
                else {
                    System.out.print ( " " );
                }
            }

            System.out.println ( );
        }
    }
}
