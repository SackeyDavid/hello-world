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
public class Weekdayname {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int dayNum;
        System.out.print("What day numbebr is today: ");
        dayNum = in.nextInt();
        
        if (dayNum == 1)
        {
            System.out.print("Today is sunday");
            
        }
        if (dayNum == 2)
        {
            System.out.print("Today is Monday");
            
        }
        if (dayNum == 3)
        {
            System.out.print("Today is Tuesday");
            
        }
        if (dayNum == 4)
        {
            System.out.print("Today is Wednesday");
            
        }
        if (dayNum == 5)
        {
            System.out.print("Today is Thursday");
            
        }
        if (dayNum == 6)
        {
            System.out.print("Today is Friday");
            
        }
        if (dayNum == 7)
        {
            System.out.print("Today is Saturday");
            
        }
        else 
        {
            System.out.print("Error");
            
        }
    }
    
}
