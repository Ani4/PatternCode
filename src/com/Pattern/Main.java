package com.Pattern;

import com.Pattern.AlphabetPattern.AlphabetPattern1;
import com.Pattern.NumberPattern.NumberPattern1;
import com.Pattern.StarPattern.StarPattern1;
import com.Pattern.StarPattern.StarPattern2;
import com.Pattern.StarPattern.StarPattern3;
import com.Pattern.StarPattern.StarPattern4;
import com.Pattern.StarPattern.StarPattern5;
import com.Pattern.StarPattern.StarPattern6;
import com.Pattern.StarPattern.StarPattern7;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a;
       do{ System.out.println("-----------------------------------------------");
        System.out.println( "\t\t\t\t Menu");
        System.out.println("-----------------------------------------------");
        System.out.println("Select Pattern -->" +
                "\n\t -> 1.Star Pattern" +
                "\n\t -> 2.Number Pattern" +
                "\n\t -> 3.Alphabet Pattern ");
        switch(s.nextInt()) {
            case 1: switch (s.nextInt()) {
                case 1:
                    new StarPattern1();
                    break;
                case 2:
                    new StarPattern2();
                    break;
                case 3:
                     new StarPattern3();
                    break;
                case 4:
                     new StarPattern4();
                    break;
                case 5:
                    new StarPattern5();
                    break;
                case 6:
                     new StarPattern6();
                    break;
                case 7:
                     new StarPattern7();
                    break;
                default:
                    System.out.println("Pls Choose correct pattern");
            }break;
            case 2: switch(s.nextInt()){
                case 1:
                    new NumberPattern1();break;
                default:System.out.println("Pls Choose correct pattern");

            }break;
            case 3: switch(s.nextInt()){
                case 1:
                    new AlphabetPattern1();break;

                default:System.out.println("Pls Choose correct pattern");

            }
            break;


            default:System.out.println("Pls Choose correct pattern");

        }
           s.nextLine();
           System.out.println("For exit write 'exit' || 'q' || 'quit'") ;
        a=s.nextLine();
        if(a.equals("exit")||a.equals("q")||a.equals("quit"))System.exit(0);
       }while(true);
    }
}
