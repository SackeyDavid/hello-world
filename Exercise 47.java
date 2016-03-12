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

public class ThreeCardMonte {
   

public static void main(String [] args)
{
	Random r = new Random();
	Scanner in = new Scanner(System.in);

	int x = 1 + r.nextInt(3);
	int guess;
	System.out.println("You slide up to Fast Eddie's card table and plop down your cash. He glances at you out of the corner of his eye and starts shuffling. He lays down three cards.");
	System.out.println("Which one is the ace?");
	System.out.println();
	System.out.println("\t##  ##  ##");
	System.out.println("\t##  ##  ##");
	System.out.println("\t1   2   3");
	System.out.println();
	System.out.print("> ");
	guess = in.nextInt();

	if (guess == x)
	{
		System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
		System.out.println();
		if (x ==  1)
		{

		System.out.println("\tAA  ##  ##");
		System.out.println("\tAA  ##  ##");
		System.out.println("\t1   2   3");
		System.out.println();
		}
		else if (x ==  2)
		{
		System.out.println("\t##  AA  ##");
		System.out.println("\t##  AA  ##");
		System.out.println("\t1   2   3");
		System.out.println();
		}
		else
		{
		System.out.println("\t##  ##  AA");
		System.out.println("\t##  ##  AA");
		System.out.println("\t1   2   3");
		System.out.println();
		}
	}
	else 
	{
		System.out.println("Ha! Fast Eddie wins again! The ace was card number "  + x + ".");
		System.out.println();
		if (x == 1)
		{

		System.out.println("\tAA  ##  ##");
		System.out.println("\tAA  ##  ##");
		System.out.println("\t1   2   3");
		System.out.println();
		}
		else if (x ==  2)
		{
		System.out.println("\t##  AA  ##");
		System.out.println("\t##  AA  ##");
		System.out.println("\t1   2   3");
		System.out.println();
		}
		else
		{
		System.out.println("\t##  ##  AA");
		System.out.println("\t##  ##  AA");
		System.out.println("\t1   2   3");
		System.out.println();
		}
	}
		
}
}

