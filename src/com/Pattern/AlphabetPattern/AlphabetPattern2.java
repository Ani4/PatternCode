package com.Pattern.AlphabetPattern;

import java.util.Scanner;

//             A
//            ABA
//           ABCBA
//          ABCDCBA
//         ABCDEDCBA
public
class AlphabetPattern2 {
    public
      AlphabetPattern2(){
//    void main ( String[] args ) {
        Scanner s = new Scanner ( System.in );
        System.out.println ( "Enter the Number of Line :" );
        int     n = s.nextInt ( );
        int     x;
        for ( int i = 1 ; i <= n ; i++ ) {
            x = 1;
            for ( int j = 1 ; j < n * 2 ; j++ ) {
                if ( j >= n - i + 1 && j <= n + i - 1 ) {
                    System.out.print ( ( char ) ( 64 + x ) );
                    if ( j > ( n * 2 ) / 2 - 1 ) x--;
                    else x++;
                }
                else System.out.print ( " " );
            }
            System.out.println ( );
        }
    }
}
