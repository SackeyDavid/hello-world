/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charles
 */
import java.util.Scanner;

public class HowOldAreYouSpec {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in); 
        int age;
        String name;
        System.out.println("Hey, what's your name? (Sorry, I am fogetful) ");
        name = in.next();
        System.out.println("Ok, " + name + ", how old are you? ");
        age = in.nextInt();
        if (age < 16)
        {
            System.out.print("You can't drive, " + name);
         
        }
        if (age >= 16 && age <= 17)
        {
            System.out.print("You can drive but you can vote, " + name);
         
        }
        if (age >= 18 && age >=24)
        {
            System.out.print("You can vote but not rent a car, " + name);
         
        }
        else
        {
            System.out.print("You can do pretty much anything, " + name);
         
        }
    }
}
    
