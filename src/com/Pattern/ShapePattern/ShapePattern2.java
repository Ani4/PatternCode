package com.Pattern.ShapePattern;

import java.util.Scanner;

public
class ShapePattern2 {
//            *********
//            **** ****
//            ***   ***
//            **     **
//            *       *
//            **     **
//            ***   ***
//            **** ****
//            *********
    public
    ShapePattern2 () {
//    public static void main(String[] args) {
        System.out.println ( "Enter Size of Cross" );
        Scanner s = new Scanner ( System.in );
        int     n = s.nextInt ( ), k = 1;
        for ( int i = 1 ; i < n * 2 ; i++ ) {

            for ( int j = 1 ; j < n * 2 ; j++ ) {
                if ( j > n - k + 1 && j < n + k - 1 ) {
                    System.out.print ( " " );
                }
                else {
                    System.out.print ( "*" );
                }
            }
            System.out.println ( );
            if ( i < n ) k++;
            else k--;
        }
    }
}
