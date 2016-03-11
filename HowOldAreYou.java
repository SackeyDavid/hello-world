/*
 Make a program which displays a different message depending on the age given. 
Here are the possible responses:
 */

/**
 *
 * @author Sackey  David 10517636
 */
import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        String name;
        int age = 0;
        
        System.out.println("Hey, Whats your name? ");
        name = in.next();
        
        System.out.print("Ok " + name + " how old are you?");
        age = in.nextInt();
        if (age < 16 && age < 25)
        {
          System.out.println("You cant drive" );
          System.out.println("You cant vote" );
          System.out.println("You cant rent a car");
          
        }
        else if(age>= 25)
        {
            System.out.print("You can do anything that is legal");
        }
                
    }
    
}
