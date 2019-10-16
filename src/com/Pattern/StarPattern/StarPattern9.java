package com.Pattern.StarPattern;

import java.util.Scanner;

public
class StarPattern9 {

//            *
//            **
//            ***
//            ****
//            *****
//            ****
//            ***
//            **
//            *
    public
    StarPattern9 () {
//public static void main(String[] args) {
        int     k = 0;
        Scanner s = new Scanner ( System.in );
        System.out.println ( "Enter number of Line : " );
        int n = s.nextInt ( );
        for ( int i = 1 ; i < n * 2 ; i++ ) {
            if ( i > n ) k--;
            else k++;
            for ( int j = 1 ; j <= n ; j++ ) {

                if ( j <= k ) {
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


//
//
//
//package com.Pattern.StarPattern;
//
//        import java.util.Scanner;
//
//public class StarPattern9 {
//    public StarPattern9() {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter number of Line : ");
//        int n = s.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n ; j++) {
//                if(){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//    }
//}
