package com.Pattern;

import com.Pattern.StarPattern1.StarPattern1;
import com.Pattern.StarPattern2.StarPattern2;
import com.Pattern.StarPattern3.StarPattern3;
import com.Pattern.StarPattern4.StarPattern4;
import com.Pattern.StarPattern5.StarPattern5;
import com.Pattern.StarPattern6.StarPattern6;
import com.Pattern.StarPattern7.StarPattern7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println( "\t\t\t\t Menu");
        System.out.println("-----------------------------------------------");
        System.out.println("Select Pattern");
        switch(s.nextInt()){
            case 1: StarPattern1 sp1= new StarPattern1();break;
            case 2: StarPattern2 sp2= new StarPattern2();break;
            case 3: StarPattern3 sp3= new StarPattern3();break;
            case 4: StarPattern4 sp4= new StarPattern4();break;

            case 5: StarPattern5 sp5= new StarPattern5();break;
            case 6: StarPattern6 sp6= new StarPattern6();break;
            case 7: StarPattern7 sp7= new StarPattern7();break;
//            case 8: StarPattern8 sp8= new StarPattern8();break;
//            case 9: StarPattern9 sp9= new StarPattern9();break;

        }
    }
}
