/*
 Ask the user for their name. Then display their name to prove that you can recall it. 
Ask them for their age. Then display that. Finally, ask them for how much they make and display that. 
You should use the most appropriate data type for each variable.
 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
public class NameAgeSalary {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        String name;
        int age;
        double salary;;
        
        System.out.print("Hello. Whats your name: ");
        name = in.next();
        
        System.out.println("Hi, " + name + " How old are you");
        age = in.nextInt();
        
        System.out.println("So you are " + age + " ,eh ? Thats not old at all!");
        System.out.println("How much do you make, ? " + name );
       salary =  in.nextDouble();
        
       System.out.print(salary + "! I hope thats per hour and not per year! LOL!");
       
       
   
    } 
}
