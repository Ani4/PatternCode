package com.Pattern.AlphabetPattern;

import java.util.Scanner;

//         1A
//        12AB
//       123ABC
//      1234ABCD
//     12345ABCDE
//    123456ABCDEF

public
class AlphabetPattern4 {
    public AlphabetPattern4(){
//    void main ( String[] args ) {
        Scanner s = new Scanner ( System.in );
        System.out.println ( "Enter the Number of Line :" );
        int n = s.nextInt ( );
        int x;
        int y;
        for ( int i = 1 ; i <= n ; i++ ) {
            y = x = 1;
            for ( int j = 1 ; j <= n * 2 ; j++ ) {
                if ( j >= n - i +1&& j <= n + i - 1 ){
                    if ( j > ( n * 2 ) / 2 - 1 ) System.out.print (( char ) ( 64 + x++ )  );
                    else System.out.print (  y++);

                }
                else System.out.print ( " " );
            }
            System.out.println ( );
        }
    }
}
