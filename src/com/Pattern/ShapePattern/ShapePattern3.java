package com.Pattern.ShapePattern;

import java.util.Scanner;

//      *****
//     *****
//    *****
//   *****
//  *****
public
class ShapePattern3 {

    public
    ShapePattern3 () {
//     static void main(String[] args) {
        System.out.println ( "Enter Size of Parallelogram" );
        Scanner s = new Scanner ( System.in );
        int     n = s.nextInt ( ), k = 1,count;
        for ( int i = 1 ; i <= n  ; i++ ) {
            count=1;
            for ( int j = 1 ; j <=n * 2 ; j++ ) {
                if(j>n-i&&count<=n) {System.out.print ( "*" );count++;}
                else System.out.print ( " " );
            }
            System.out.println ( );
        }
    }
}
