/*
 Make a program which displays an appropriate name for a person, using a combination of nested ifs and compound conditions. Ask the user for a gender, first name, last name and age.

If the person is female and 20 or over, ask if she is married. If so, display "Mrs." in front of her name. If not, display "Ms." in front of her name. If the female is under 20, display her first and last name.

If the person is male and 20 or over, display "Mr." in front of his name. Otherwise, display his first and last name.

Note that asking a person if they are married should only be done if they are female and 20 or older, which means you will have a single if and else nested inside one of your if statements.

Also, did you know that with an if statement (or else), the curly braces are optional when there is only one statement inside?

 */

/**
 *
 * @author David
 */
import java.util.Scanner;
public class Exercise37 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        
        int age;
        String gender, firstname, lastname ;
        String response1 = "y";
        String response2 = "n";
        String response;
        String male = "M";
        String female = "F";
        
        
        System.out.print("What is your gender (M or F) ");
        gender = new String(in.next());
        
        System.out.print("Age: ");
           age = in.nextInt();
           
        System.out.print("First name: ");
        firstname = in.next();
        
         System.out.print("last name: ");
         lastname = in.next();
         
         String name = firstname + " " + lastname ;
           
         
        if(  age >= 20 && gender.equals(female));
        {
            System.out.print("Are you married, " + firstname + "(y or n)? " );
            response = in.next();
            if (response.equals(response1))
            {
                System.out.print("Then I shall call you Mrs. " + lastname + ".");
            }
            if(gender.equals(response2) )
            {
                System.out.print("Then I will call you Ms. " + lastname + ".");
            }
        }
            
        if (age < 20 && gender.equals(female)  )
        {
                System.out.print("I will call you " + name + "."  );
                
        }
    
        
        if (gender.equals(male) && age >= 20)
        {
                System.out.print("Then I shall call you Mr. " + lastname + ".");
        }
        
        if (age < 20 && gender.equals(male)  )
        {
                System.out.print("Then I will call you " + name + "."  );
                
        }
    
    }
}
