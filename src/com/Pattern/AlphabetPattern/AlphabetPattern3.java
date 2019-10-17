package com.Pattern.AlphabetPattern;

import java.util.Scanner;

//            A1
//           AB12
//          ABC123
//         ABCD1234

public
class AlphabetPattern3 {
    public AlphabetPattern3(){
//    void main ( String[] args ) {
        Scanner s = new Scanner ( System.in );
        System.out.println ( "Enter the Number of Line :" );
        int n = s.nextInt ( );
        int x;
        int y;
        for ( int i = 1 ; i <= n ; i++ ) {
            y = x = 1;
            for ( int j = 1 ; j <= n * 2 ; j++ ) {
                if ( j >= n - i+1 && j <= n + i - 1 ){
                    if ( j > ( n * 2 ) / 2 - 1 ) System.out.print ( y++ );
                    else System.out.print ( ( char ) ( 64 + x++ ) );

                }
                else System.out.print ( " " );
            }
            System.out.println ( );
        }
    }
}
