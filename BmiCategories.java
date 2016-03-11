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
public class BMICategories {
    

    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double height,weight,BMI,inches,pounds,feet,feetCon;
        BMI = 0;
int choice;

System.out.print("Enter 1 for measurements in meters/kilogram and 2 for inches/pound\n"); 
choice = in.nextInt();

 System.out.println();
if ( choice == 1){
        System.out.print("Your height in m: ");
        height = in.nextDouble();
        
         System.out.print("Your weight in kg: ");
        weight = in.nextDouble();
        
        
         System.out.println();
        BMI = weight / (height * height);
        System.out.println("Your BMI is " + BMI );
        
        if(BMI < 15.0)
        {
           
             System.out.println("BMI Category: very severely underweight");
        }

        if(BMI > 15.0 && BMI < 16.0)
        {
            
            System.out.println("BMI Category: severely underweight");
        }

          if (BMI>= 16.1 && BMI <= 18.4)
        {
            System.out.println("BMI Category: underweight");
        
        }
       
          if (BMI>= 18.5 && BMI <= 24.9)
        {
            System.out.println("BMI Category: normal weight");
        
        }

           if (BMI>= 25.0 && BMI <= 29.9)
        {
            System.out.println("BMI Category: overweight");
        
        }

            if (BMI>= 30.0 && BMI <= 34.9)
        {
            System.out.println("BMI Category: moderately obese");
        
        }
        
           if (BMI>= 35.0 && BMI <= 39.9)
        {
            System.out.println("BMI Category: severely obese");
        
        }
         else if (BMI >= 40.0)
         {
             System.out.print("BMI Category: very severely (or 'morbidly') obese");
         }
        }
if (choice == 2) {
        
          System.out.println();
         
        System.out.print("Your height in inches: ");
        inches = in.nextDouble();
        
         System.out.print("Your height in pounds: ");
        pounds = in.nextDouble();
        
	BMI = (pounds / (inches * inches ))*703;
        System.out.println("Your BMI is " + BMI );
       
        if(BMI < 15.0)
        {
           
             System.out.println("BMI Category: very severely underweight");
        }

        if(BMI > 15.0 && BMI < 16.0)
        {
            
            System.out.println("BMI Category: severely underweight");
        }

          if (BMI>= 16.1 && BMI <= 18.4)
        {
            System.out.println("BMI Category: underweight");
        
        }
       
          if (BMI>= 18.5 && BMI <= 24.9)
        {
            System.out.println("BMI Category: normal weight");
        
        }

           if (BMI>= 25.0 && BMI <= 29.9)
        {
            System.out.println("BMI Category: overweight");
        
        }

            if (BMI>= 30.0 && BMI <= 34.9)
        {
            System.out.println("BMI Category: moderately obese");
        
        }
        
           if (BMI>= 35.0 && BMI <= 39.9)
        {
            System.out.println("BMI Category: severely obese");
        
        }
         else if (BMI >= 40.0)
         {
             System.out.print("BMI Category: very severely (or 'morbidly') obese");
         }

         }
           
    }
    
}

    