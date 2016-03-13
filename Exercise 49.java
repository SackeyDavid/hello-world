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
public class KeepGuessing {
    

	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int choice;
		String repeat;
		String Yes = "yes";
		
		do
		{
			int x = 1 + r.nextInt(10);
			int guess;
			System.out.println("\t\t\t\t A Number-Guessing Game");
			System.out.println("The program accepts a number from you and compares it to a random number from the computer.");
			System.out.println();
			System.out.println("I'm thinking of a number from 1 to 10");
			System.out.print("Your guess: ");
			guess = in.nextInt();
			System.out.println();
		

			while ( guess != x )
			{
			System.out.println("That's incorrect. Guess again");
			System.out.print("Your guess: ");
			guess = in.nextInt();
			}

			System.out.println("That's right! You are a good guesser.");
               		 
			
			
			
			System.out.print("Would you like to play again (yes or no)? ");
			repeat = new String(in.next());
			
		} while(repeat.equals(Yes));
			if (repeat.equals(Yes))
			{
			}
			else
			{
			System.out.println("\t\t\t\tGoodbye!");
			}
}
}

