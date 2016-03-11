/*
Julio Cesar Chavez Mark VII is an interplanetary space boxer, who currently holds the championship belts for various weight categories on many different planets within our solar system. However, 
it is often difficult for him to recall what his "target weight" needs to be on earth in order to make the weight class on other planets. 
Write a program to help him keep track of this.
 */

/**
 *
 * @author charles
 * 
 */
import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        
        double venus = 0.78;
        double mars = 0.38;
        double jupiter = 2.65;
        double Saturn = 1.17;
        double uranus = 1.05;
        double neptune = 1.23;
        double weight,weightNew;
        int planet;
        
        System.out.print("Please enter your current earth weight: ");
        weight = in.nextDouble();
        System.out.println();
        
        System.out.println("I have information for the following planets:");
        System.out.println("1.Venus  2.Mars 3.Jupiter ");
        System.out.println("4.Saturn  5.Uranus 6. Neptune ");
        
        System.out.println("Which planet do you belong to: ");
        planet = in.nextInt();
        
       if (planet == 1)
       {
           weightNew = venus * weight;
           System.out.print("Your weight would be " + weightNew + " pounds on " + " Venus "); 
       }
       if (planet == 2)
       {
          weightNew = mars * weight;
           System.out.print("Your weight would be " + weightNew + " pounds on " + " Mars"); 
       }
       if (planet == 3)
       {
          weightNew = jupiter * weight;
           System.out.print("Your weight would be " + weightNew + " pounds on " + " Jupiter "); 
       }
    if (planet == 4)
       {
          weightNew = Saturn * weight;
           System.out.print("Your weight would be " + weightNew + " pounds on " + "Saturn"); 
       }
    if (planet == 5)
       {
          weightNew = uranus * weight;
           System.out.print("Your weight would be " + weightNew + " pounds on " + "Uranus"); 
       }
    if (planet == 6)
       {
          weightNew = neptune * weight;
           System.out.print("Your weight would be " + weightNew + " pounds on " + "Neptune"); 
       }
    else if( planet > 6)
    {
        System.out.print("Error, check your input");
    }
}
}
