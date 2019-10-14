package com.Pattern;

import com.Pattern.StarPattern5.StarPattern5;
import com.Pattern.StarPattern6.StarPattern6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println( "\t\t\t\t Menu");
        System.out.println("-----------------------------------------------");
        System.out.println("Select Pattern");
        switch(s.nextInt()){
            case 5: StarPattern5 sp5= new StarPattern5();break;
            case 6: StarPattern6 sp6= new StarPattern6();break;

        }
    }
}
