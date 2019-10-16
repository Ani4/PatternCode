package com.Pattern.NumberPattern;

import java.util.Scanner;

//        543210
//        43210
//        3210
//        210
//        10
//        0


public
class NumberPattern4 {
    public
    NumberPattern4 ( ) {
//    public static void main(String[] args) {

        Scanner s = new Scanner ( System.in );
        System.out.println ( "Enter number of Line : " );
        int n = s.nextInt ( );
        int k;
        for ( int i = 1 ; i <= n + 1 ; i++ ) {
            k = n - i + 1;
            for ( int j = 1 ; j <= n + 1 ; j++ ) {
                if ( j <= n - i + 2 ) {
                    System.out.print ( k );
                    k--;
                }
                else System.out.print ( " " );
            }
            System.out.println ( );
        }
    }
}

