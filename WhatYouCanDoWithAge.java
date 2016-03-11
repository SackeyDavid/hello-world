/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SackeyDavid
 */
import java .util.Scanner;
public class AgeMessage3 {
    public static void main(String[] args)
    {
        double age;
        age = 0;
        String name;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Your name: ");
        name = input.next();
        
        System.out.println();
        System.out.println("Your age: ");
         age = input.nextDouble();
        if(age < 16 )
        {
            System.out.print("You can't drive.");
        }
        if (age < 16 && age >= 17)
        {
            System.out.print("You can driv but note vote"); 
            
        }
        if(age >= 18 && age <= 24)
        {
             System.out.print("You can vote but not rent a car.");
        }
        if (age>= 25)
        {
             System.out.print("You can do pretty much anything");
        }
       
        
        
    }
    
}
