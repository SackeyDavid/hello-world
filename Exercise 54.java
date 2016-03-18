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

public class HiLoLimited {
 

public static void main(String[] args)
{
	Random r = new Random();
	Scanner in = new Scanner(System.in);
	int x = 1 + r.nextInt(100);
	int guess;
	int counter = 0;

	System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
	System.out.print("First guess: ");
	guess = in.nextInt();
        counter ++;
	
	while (guess != x && counter < 7)
	{
        
	if (guess < x)
	{
	System.out.println("Sorry, you are too low.");
	}
	else
	{
	System.out.println("Sorry, that guess is too high.");
	}
        counter ++;
	System.out.print("Guess # " + counter + ": ");
	guess = in.nextInt();
	
	if (counter == 7)
	{
	System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
	}
	
	}
        if (guess == x && counter < 7)
        {    
	System.out.println("You guessed it! What are the odds!??");
        }
        }
}  

