/*
 Ask the user for two words and two numbers 
and let the person at the keyboard type in some values 
donnt store the values .
 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
public class Forgetfulmachine {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Give me a word!");
        in.next();
        
        System.out.println("Give me a second word!");
        in.next();
        
        System.out.println("Great, now your favorite number?");
        in.nextInt();
        
        System.out.println("And your second favorite number?");
        in.nextInt();
        
        System.out.println("Whew! Wasnt that fun?");
    }
    
}
