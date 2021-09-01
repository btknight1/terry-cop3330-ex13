/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;
import java.lang.Math;

public class App 
{
    public static void main( String[] args )
    {
        int principal;
        double interest_rate;
        int time;
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        principal = input.nextInt();

        System.out.print("What is the rate? ");
        interest_rate = input.nextDouble();

        System.out.print("What is the number of years? ");
        time = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        n = input.nextInt();

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.", principal, interest_rate, time, n, principal*(Math.pow((1+((interest_rate/100)/n)), n*time)));
    }
}