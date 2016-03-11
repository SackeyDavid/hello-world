import java.util.Random;
import java.util.Scanner;
public class Randomness
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
		System.out.println("This program does 7 things:");
		System.out.println("1.It gives you the sum of 1 and any random number between 0 and 10");
		System.out.println("2.It gives you the six sums of 1 and any random number between 0 and 5");
		System.out.println("3.It gives you the six sums of 1 and any random number between 0 and 100");
		System.out.println("4.It gives you any random number between 0 and 5");
		System.out.println("5.It gives you the six sums of 3 and any random number between 0 and 5");
		System.out.println("6.It gives you what happens when our random number generator is changed by passing a number called a seed to it");
		System.out.println("7.You have the opportunity to change the random number seed and observe what happens");
		System.out.println("8.Check what happens when two random numbers provided by the computer are compared for equality.");
		System.out.println();
		System.out.print("Which program number do you  want? > ");
		choice = in.nextInt();
	if (choice == 1)
	{
		int x = 1 + r.nextInt(10);

		System.out.println( "My random number is " + x );
	}
	if (choice == 2)
	{

		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.println();
	}
	if (choice == 3)
	{
		System.out.println( "Here are some numbers from 1 to 100!" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.println();
	}
	if (choice == 4)
	{
		System.out.println( "Here are some numbers from 0 to 5!" );
		System.out.print(  r.nextInt(5) + " " );
		System.out.print(  r.nextInt(5) + " " );
		System.out.print(  r.nextInt(5) + " " );
		System.out.print(  r.nextInt(5) + " " );
		System.out.print(  r.nextInt(5) + " " );
		System.out.print(  r.nextInt(5) + " " );
	}
	if (choice == 5)
	{
		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
	}
	if (choice == 6)
	{
		Random ur = new Random(12345);
		
		int choice1;
		System.out.println("This program does 5 things but differently, :");
		System.out.println("1.Get the sum of 1 and any random number between 0 and 10");
		System.out.println("2.Get the six sums of 1 and any random number between 0 and 5");
		System.out.println("3.Get the six sums of 1 and any random number between 0 and 100");
		System.out.println("4.Get any random number between 0 and 5");
		System.out.println("5.Get the six sums of 3 and any random number between 0 and 5");
		System.out.println();
		System.out.print("Which program number do you  want? > ");
		choice1 = in.nextInt();
	if (choice1 == 1)
	{
		int x = 1 + ur.nextInt(10);

		System.out.println( "My random number is " + x );
	}
	if (choice1 == 2)
	{

		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print( 1 + ur.nextInt(5) + " " );
		System.out.print( 1 + ur.nextInt(5) + " " );
		System.out.print( 1 + ur.nextInt(5) + " " );
		System.out.print( 1 + ur.nextInt(5) + " " );
		System.out.print( 1 + ur.nextInt(5) + " " );
		System.out.print( 1 + ur.nextInt(5) + " " );
		System.out.println();
	}
	if (choice1 == 3)
	{
		System.out.println( "Here are some numbers from 1 to 100!" );
		System.out.print( 1 + ur.nextInt(100) + "\t" );
		System.out.print( 1 + ur.nextInt(100) + "\t" );
		System.out.print( 1 + ur.nextInt(100) + "\t" );
		System.out.print( 1 + ur.nextInt(100) + "\t" );
		System.out.print( 1 + ur.nextInt(100) + "\t" );
		System.out.print( 1 + ur.nextInt(100) + "\t" );
		System.out.println();
	}
	if (choice1 == 4)
	{
		System.out.println( "Here are some numbers from 0 to 5!" );
		System.out.print(  ur.nextInt(5) + " " );
		System.out.print(  ur.nextInt(5) + " " );
		System.out.print(  ur.nextInt(5) + " " );
		System.out.print(  ur.nextInt(5) + " " );
		System.out.print(  ur.nextInt(5) + " " );
		System.out.print(  ur.nextInt(5) + " " );
	}
	if (choice1 == 5)
	{
		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print( 3 + ur.nextInt(5) + " " );
		System.out.print( 3 + ur.nextInt(5) + " " );
		System.out.print( 3 + ur.nextInt(5) + " " );
		System.out.print( 3 + ur.nextInt(5) + " " );
		System.out.print( 3 + ur.nextInt(5) + " " );
		System.out.print( 3 + ur.nextInt(5) + " " );
	}

	}		
	if (choice == 7)
	{
		System.out.print("Enter a random seed > ");
              		Random cr = new Random(in.nextInt());
		
		int choice2;
		System.out.println("This program does 5 things using your given random seed:");
		System.out.println("1.You'll have the sum of 1 and any random number between 0 and 10");
		System.out.println("2.You'll have the six sums of 1 and any random number between 0 and 5");
		System.out.println("3.You'll have the six sums of 1 and any random number between 0 and 100");
		System.out.println("4.You'll have any random number between 0 and 5");
		System.out.println("5.You'll have the six sums of 3 and any random number between 0 and 5");
		System.out.println();
		System.out.print("Which program number do you  want? > ");
		choice2 = in.nextInt();
	if (choice2 == 1)
	{
		int x = 1 + cr.nextInt(10);

		System.out.println( "My random number is " + x );
	}
	if (choice2 == 2)
	{

		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print( 1 + cr.nextInt(5) + " " );
		System.out.print( 1 + cr.nextInt(5) + " " );
		System.out.print( 1 + cr.nextInt(5) + " " );
		System.out.print( 1 + cr.nextInt(5) + " " );
		System.out.print( 1 + cr.nextInt(5) + " " );
		System.out.print( 1 + cr.nextInt(5) + " " );
		System.out.println();
	}
	if (choice2 == 3)
	{
		System.out.println( "Here are some numbers from 1 to 100!" );
		System.out.print( 1 + cr.nextInt(100) + "\t" );
		System.out.print( 1 + cr.nextInt(100) + "\t" );
		System.out.print( 1 + cr.nextInt(100) + "\t" );
		System.out.print( 1 + cr.nextInt(100) + "\t" );
		System.out.print( 1 + cr.nextInt(100) + "\t" );
		System.out.print( 1 + cr.nextInt(100) + "\t" );
		System.out.println();
	}
	if (choice2 == 4)
	{
		System.out.println( "Here are some numbers from 0 to 5!" );
		System.out.print(  cr.nextInt(5) + " " );
		System.out.print(  cr.nextInt(5) + " " );
		System.out.print(  cr.nextInt(5) + " " );
		System.out.print(  cr.nextInt(5) + " " );
		System.out.print(  cr.nextInt(5) + " " );
		System.out.print(  cr.nextInt(5) + " " );
	}
	if (choice2 == 5)
	{
		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print( 3 + cr.nextInt(5) + " " );
		System.out.print( 3 + cr.nextInt(5) + " " );
		System.out.print( 3 + cr.nextInt(5) + " " );
		System.out.print( 3 + cr.nextInt(5) + " " );
		System.out.print( 3 + cr.nextInt(5) + " " );
		System.out.print( 3 + cr.nextInt(5) + " " );
	}

	}
	if (choice == 8)
	{
		
		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);

		if ( num1 == num2 )
		{
	System.out.println( "The random numbers were the same! Weird." );
		}
		if ( num1 != num2 )
		{
	System.out.println( "The random numbers were different! Not too surprising, actually." );
		}
	}
	System.out.print("Would you like to see the others? (yes or no)? > ");
	repeat = new String(in.next());
	System.out.println();
	
	} while (repeat.equals(Yes));

	}
}