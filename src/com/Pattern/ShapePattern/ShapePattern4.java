package com.Pattern.ShapePattern;

import java.util.Scanner;

//      **********
//      *        *
//      *        *
//      *        *
//      **********
public
class ShapePattern4 {

    public
    ShapePattern4 () {
//     static void main(String[] args) {
        System.out.println ( "Enter Size of Square" );
        Scanner s = new Scanner ( System.in );
        int     n = s.nextInt ( ), k = 1,count;
        for ( int i = 1 ; i <= n  ; i++ ) {
            count=1;
            for ( int j = 1 ; j <=n * 2 ; j++ ) {
                if(j==1||j==n*2||i==1||i==n) {System.out.print ( "*" );count++;}
                else System.out.print ( " " );
            }
            System.out.println ( );
        }
    }
}
