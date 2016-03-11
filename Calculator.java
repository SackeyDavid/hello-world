/*
 Make a simple numeric calculator. It should prompt the user for three numbers. 
Then add the numbers together and divide by 2. 
Display the result. Your program must support numbers with decimals and not just integers
 */

/**
 *
 * @author SackeyDavid 
 */
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double num1,num2,num3,results;
        
        System.out.print("What is your first number: ");
       num1 =  input.nextDouble();
          System.out.print("What is your second number: ");
        num2 = input.nextDouble();
          System.out.print("What is your third number: ");
        num3  = input.nextDouble();
        results = (num1 + num2 + num3)/2.0; 
        System.out.print( "The sum of the three numbers divided by 2  is " + results);
        
    }
    
}
