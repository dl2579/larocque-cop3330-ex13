package org.example;
import java.util.Scanner;
import java.lang.Math;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "What is the principal amount? " );
        float P = sc.nextFloat();

        System.out.print( "What is the rate (%) ? " );
        float r = sc.nextFloat();
        r /= 100;

        System.out.print("What is the number of years? ");
        int t = sc.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = sc.nextInt();

        double A = P * Math.pow((1 + r/n), (n*t) );

        System.out.printf("$%.2f invested at %.1f%% for %d years compounded %d times per year is $%.2f.%n", P, r*100, t, n, A);



    }
}
