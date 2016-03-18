/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author David
 */
import java.util.Random;
import java.util.Scanner;

public class GuessingWithCounter {

public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
	Random r = new Random();

	int x = 1 + r.nextInt(10);
	int guess;
	int counter = 0;
 	System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
	System.out.print("Your guess: ");
	guess  = in.nextInt();
	counter ++;

	do
	{
	System.out.println("That is incorrect. Guess again.");
	System.out.print("Your guess: ");
	guess  = in.nextInt();
	counter ++;
	} while (guess != x );
	System.out.println("That's right! You're a good guesser.");
	System.out.println("It only took you " + counter + " tries.");
}
}

