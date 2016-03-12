/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignmentii;

/**
 *
 * @author David
 */
import java.util.Random;
import java.util.Scanner;

public class AshotHiOrLow {
   

public static void main(String [] args)
{
	Scanner in = new Scanner(System.in);
	Random r = new Random();
	String repeat;
	String Yes = "yes";
	do
	{
	int x = 1 + r.nextInt(100);
	int guess;
	System.out.println("I'm thinking of a number between 1 - 100. Try to guess it.");
	System.out.print("> ");
	guess = in.nextInt();
        System.out.println();
	if (guess < x)
	{
		System.out.println("Sorry, you are too low. I was thinking of " + x + ".");
	}
	else if (guess > x)
 	{
		System.out.println("Sorry, you are too high. I was thinking of " + x + ".");
	}
	else
	{
		System.out.println("You guessed it! What are the odds!??");
	}
		System.out.println("Would you like to give another shot (yes or no)?");
		System.out.print("> ");
		repeat = new String(in.next());
	} while (repeat.equals(Yes));	

}
}
    

