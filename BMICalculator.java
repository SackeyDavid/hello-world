/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SackeyDavid
 */
import java.util.Scanner;
public class BCalculator {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double height,weight,BMI,inches,pounds,feet,feetCon;
        
        System.out.println("Your height in m: ");
        height = input.nextDouble();
        
         System.out.println("Your weight in kg: ");
        weight = input.nextDouble();
        
        BMI = weight / (height * height);
        System.out.print("Your BMI is " + BMI );
         System.out.println();
         
          System.out.println("Your height in inches: ");
        inches = input.nextDouble();
        
         System.out.println("Your height in pounds: ");
        pounds = input.nextDouble();
        
        BMI = (pounds / (inches * inches ))*703;
         System.out.println("Your BMI is " + BMI);
         
          System.out.println("Your height(feet): ");
        feet = input.nextDouble();
        
         System.out.println("Your height inches : ");
        inches = input.nextDouble();
        
         System.out.println("Your weight pounds: ");
        pounds = input.nextDouble();
        
        feetCon = feet * 12;
        inches = inches + feetCon;
        
        BMI = (pounds / (inches * inches ))*703;
         System.out.println("Your BMI is  " + BMI);
        
    }
    
}
