/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */

package org.example;
import java.util.Calendar;
import java.util.Scanner;


public class Main
{
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String currAge = inp.nextLine();
        System.out.print("At what age would you like to retire? ");
        String retAge = inp.nextLine();

        int CurrentAge = Integer.parseInt(currAge);
        int RetiredAge = Integer.parseInt(retAge);
        int YearsLeft = RetiredAge - CurrentAge;
        int Year = Calendar.getInstance().get(Calendar.YEAR);
        int RetireYear = Year + YearsLeft;

        System.out.print("You have " + YearsLeft + " years left until you can retire." + "\n" + "It's " + Year + ", so you can retire in " + RetireYear + ".");
    }
}
