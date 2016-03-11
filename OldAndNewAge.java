/*
Ask the user for their name. Then display their name to prove that you can recall it. Ask them for their age. 
Then display what their age would be five years from now. 
Then display what their age would be five years ago

 */

/**
 *
 * @author SackeyDavid
 */
import java.util.Scanner;
public class AgeInFiveyears {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in) ;
       
       String name;
       int age,Age,newAge;
       
       System.out.print("Hello. What is your name? ");
       name = input.next();
       
       System.out.print("Hi, " + name +"!" + "How old are you? ");
       age = input.nextInt();
       
       newAge = age + 5;
       oldAge = age - 5;
       
       System.out.println("Do you know that in five years you will be " + newAge +"yearsold?\n");
       System.out.println("And five years ago you were " + oldAge +"yearsold?\n");
    }
            
    
}
