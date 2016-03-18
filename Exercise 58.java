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
import java.util.Random;

public class DiceDoubles {

   

public static void main(String [] args)
{
Random r = new Random();
Scanner in = new Scanner(System.in);
String repeat;
String Yes = "yes";
do
{
int x = 1 + r.nextInt(6);
int y = 1 + r.nextInt(6);

System.out.println("\t\t\tHERE COMES THE DICE!");
System.out.println();
do
{

System.out.println("Roll #1: " + x);
System.out.println("Roll #2: " + y);
System.out.println("The total is " + (x + y) + "!");
x = 1 + r.nextInt(6);
y = 1 + r.nextInt(6);
} while (x != y);
System.out.println("Roll #1: " + x);
System.out.println("Roll #2: " + y);
System.out.println("The total is " + (x + y) + "!");
System.out.println();
System.out.print("Would you like to repeat (yes or no)?> ");
repeat = new String(in.next());
} while (repeat.equals(Yes));
}

    
}


