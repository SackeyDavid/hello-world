import java.util.Random;
import java.util.Scanner;
public class aNumber-GuessingGame
{
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
			System.out.println("Your guess: ");
			guess = in.nextInt();
			System.out.println();
			
			if (guess == x)
			{
				System.out.println("That's right! My secret number was " + x + ".");
			}
			else 
			{
				System.out.println("Sorry, but I was really thinking of " + x + ".");
			}
			System.out.print(Would you like to play again (yes or no)? ");
			repeat = new String(in.next());
			
		} while(repeat.equals(Yes));
if (repeat.equals(Yes))
	{
		
	}
	else
	{
		System.out.println("\t\t\tGoodbye!");
	}
}
}