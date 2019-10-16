package com.Pattern.ShapePattern;

import java.util.Scanner;

//      \***/
//      *\*/*
//      **\**
//      */*\*
//      /***\
public
class ShapePattern1 {
    public
    ShapePattern1 ( ) {
//    public static void main(String[] args) {
        System.out.println ( "Enter Size of Cross" );
        Scanner s = new Scanner ( System.in );
        int     n = s.nextInt ( );
        for ( int i = 1 ; i <= n ; i++ ) {
            for ( int j = 1 ; j <= n ; j++ ) {
                if ( j == i ) System.out.print ( "\\" );
                else if ( j + i == n + 1 ) System.out.print ( "/" );
                else System.out.print ( "*" );
            }
            System.out.println ( );
        }
    }

}
