package com.Pattern;

import com.Pattern.AlphabetPattern.*;
import com.Pattern.NumberPattern.*;
import com.Pattern.ShapePattern.ShapePattern1;
import com.Pattern.ShapePattern.ShapePattern2;
import com.Pattern.StarPattern.*;

import java.util.Scanner;

class Main {

    public static
    void main ( String[] args ) {
        Scanner s = new Scanner ( System.in );
        String  a;
        do {
            System.out.println ( "-----------------------------------------------" );
            System.out.println ( "\t\t\t\t Menu" );
            System.out.println ( "-----------------------------------------------" );
            System.out.println ( "Select Pattern -->" +
                                 "\n\t -> 1.Star Pattern" +
                                 "\n\t -> 2.Number Pattern" +
                                 "\n\t -> 3.Alphabet Pattern" +
                                 "\n\t -> 4.Shape Pattern " );
            System.out.println ( "-----------------------------------------------" );

            switch ( s.nextInt ( ) ) {
                case 1:
                    System.out.println ( "Star Pattern" );
                    switch ( s.nextInt ( ) ) {
                        case 1:
                            new StarPattern1 ( );
                            break;
                        case 2:
                            new StarPattern2 ( );
                            break;
                        case 3:
                            new StarPattern3 ( );
                            break;
                        case 4:
                            new StarPattern4 ( );
                            break;
                        case 5:
                            new StarPattern5 ( );
                            break;
                        case 6:
                            new StarPattern6 ( );
                            break;
                        case 7:
                            new StarPattern7 ( );
                            break;
                        case 8:
                            new StarPattern8 ( );
                            break;
                        case 9:
                            new StarPattern9 ( );
                            break;

                        default:
                            System.out.println ( "Pls Choose correct pattern" );
                    }
                    break;

                case 2:
                    System.out.println ( "Number Pattern" );
                    switch ( s.nextInt ( ) ) {
                        case 1:
                            new NumberPattern1 ( );
                            break;
                        case 2:
                            new NumberPattern2 ( );
                            break;
                        case 3:
                            new NumberPattern3 ( );
                            break;
                        case 4:
                            new NumberPattern4 ( );
                            break;
                        case 5:
                            new NumberPattern5 ( );
                            break;


                        default:
                            System.out.println ( "Pls Choose correct pattern" );

                    }
                    break;

                case 3:
                    System.out.println ( "Alphabet Pattern" );
                    switch ( s.nextInt ( ) ) {
                        case 1:
                            new AlphabetPattern1 ( );
                            break;

                        default:
                            System.out.println ( "Pls Choose correct pattern" );

                    }
                    break;

                case 4:
                    System.out.println ( "Shape Pattern" );
                    switch ( s.nextInt ( ) ) {
                        case 1:
                            new ShapePattern1 ( );
                            break;
                        case 2:
                            new ShapePattern2 ( );
                            break;

                        default:
                            System.out.println ( "Pls Choose correct pattern" );

                    }
                    break;

                default:
                    System.out.println ( "Pls Choose correct pattern" );

            }
            s.nextLine ( );
            System.out.println ( "For exit write 'exit' || 'q' || 'quit'" );
            a = s.nextLine ( );
            if ( a.equals ( "exit" ) || a.equals ( "q" ) || a.equals ( "quit" ) ) System.exit ( 0 );

        }
        while ( true );
    }
}
