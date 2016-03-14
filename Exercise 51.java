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
import java.util.Scanner;
public class CountingWhile {
    

public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
	String message;
	int n = 0;
	int choice;
	int times;

	System.out.println( "Welcome! This program does 5 things");
	System.out.println( "1.Displays a message five times.");
	System.out.println( "2.Shows you what happens when the \"incrementer\" (c++)");
        	System.out.println(  "is remove from the while loop.");
	System.out.println( "3.Displays a message ten times instead of five with a numbering by ones.");
	System.out.println( "4.Displays a message still ten times, but the numbers in front count by tens.");
	System.out.println( "5.Asks you how many times to display a message. ");
       	 System.out.println( "Then, displays it that number of times, still count by tens.");
        	System.out.println();
	System.out.print("Enter your program number of choice> ");
	choice = in.nextInt();
	System.out.println();
	
	if (choice == 1)
	{

	Scanner keyboard = new Scanner(System.in);

	System.out.println( "Type in a message, and I'll display it five times." );
	System.out.print( "Message: " );
	String Message = keyboard.nextLine();

	int r = 0;
	while ( r < 5 )
	{
	System.out.println( (r+1) + ". " + Message );
	r++;
	}
	
	}

	if (choice == 2)
	{
	System.out.println( "\t\t\t\tnotes");
	System.out.println( "When we want a program to do something a specified ");
        	System.out.println( "number of times, we use a counter.  A counter is a number ");
        	System.out.println(  "variable (int or double) that starts with a value of 0, and ");
        	System.out.println(  "then we add 1 to it whenever something happens. What we do to ");
        	System.out.println(  "add 1 to a counter whenever something happens is to use an ");
        	System.out.println(  "\"incrementer\", such as n++ which is the same as n = n + 1. ");
       	 System.out.println(  "We  could also write n = n + 10 to add 10 to a counter whenever ");
        	System.out.println(  "something happens.");
        	System.out.println(  "\"n\" could also be changed to another variable name ");
       	System.out.println(  "like c, r. Any generic variable name is acceptable.");
       	System.out.println(  "Why this program runs infinitely is because there is no  incrementer,");
        	System.out.println(  "so as   long as zero(n) remains less than 5, the message will ");
       	System.out.println(  "keep on being displayed several times on the screen. We need the ");
       	System.out.println(  "incrementer to increase the value of n till it becomes ");
        	System.out.println(  "equal to 5, then the condition within the while loop ");
        	System.out.println(  "no longer holds, thus terminating the display ");
	System.out.println( "NB: please remember to end the program to prevent ");
        	System.out.println(  "memory overflow.");
	System.out.println();
        	Scanner input = new Scanner(System.in);
	System.out.println( "Type in a message, and I'll display it five times." );
	System.out.print( "Message: " );
	String meSSage = input.nextLine();

	int c = 0;
	while ( c < 5 )
	{
	System.out.println( (c+1) + ". " + meSSage );
	
	}

	}

	if (choice == 3)
	{
        	Scanner enter = new Scanner(System.in);
	System.out.println( "Type in a message, and I'll display it five times." );
	System.out.print( "Message: " );
	String messaGe = enter.nextLine();

	int b = 0;
	while ( b < 10 )
	{
	System.out.println( (b+1) + ". " + messaGe );
	b++;
	}
	
	}

	if (choice == 4)
	{
        	Scanner scan = new Scanner(System.in);
	System.out.println( "Type in a message, and I'll display it ten times." );
	System.out.print( "Message: " );
	String mEssage = scan.nextLine();

	n = 1;
	while ( n <= 10 )
	{
	System.out.println( (n*10) + ". " + mEssage );
	n++;
	}

	}

	if (choice == 5)
	{
        	Scanner xboard = new Scanner(System.in);
	System.out.println( "Type in a message, and I'll display it your prefered number of times." );
	System.out.print( "Message: " );
	String messAge = xboard.nextLine();
	System.out.print( "How many times?:  ");
	times = xboard.nextInt();
	int x = 1;
	while ( x <= times )
	{
	System.out.println( (x*10) + ". " + messAge );
	x++;
	}

	}
}
}

