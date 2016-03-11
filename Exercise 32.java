/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
import java.util.Scanner;
public class Exercise32 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        String responseYes = "yes";
        String responseNo = "no";
        String YesOrNo;        
        String  response1 = "animal";
        String  response2 = "vegetable";
        String  response3 ="mineral";
        String response ;
        System.out.println("TWO QUESTIONS!");
        System.out.println();
        System.out.println("Think of an obect, and i'll try to guess it.");
        
        System.out.println("Is it animal, vegetable, or mineral?");
        response = new String(in.next());
        System.out.println("Is it bigger than a bread box ");
        YesOrNo = new String(in.next());
        
        
        if (response.equals(response1) )
        {
            
            if(YesOrNo.equals(responseNo) )
            {
                System.out.println("My guess is that you are thinking of a mouse \nI would ask yactually careou if I'm right,but I dont actually care");
                
                      
                        }

            
                if(YesOrNo.equals(responseYes))
            {
                System.out.println("My guess is that you are thinking of a squirrel\nI would ask yactually careou if I'm right,but I dont actually care");
            }
            
        }
    
        
        if(response.equals(response2))
            {
                
                if (YesOrNo.equals(responseNo) )
                {
                   
                System.out.println("My guess is that you are thinking of a carrot \nI would ask you if I'm right,but I dont actually care");
                }
                   
                   
                       if(YesOrNo.equals(responseYes) )
                     {
                       System.out.println("My guess is that you are thinking of a watermelon \nI would ask you if I'm right,but I dont actually care");
                      }
                   
            }
        else
        {
            if(response.equals(response3) )
            {
                
                if (YesOrNo.equals(responseNo))
                {
                   
                System.out.println("My guess is that you are thinking of a paper clip \nI would ask you if I'm right,but I dont actually care");
                }
                   
                   
                       if(YesOrNo.equals(responseYes) )
                     {
                       System.out.println("My guess is that you are thinking of a camaro \nI would ask you if I'm right,but I dont actually care");  
                     }
                   
            }
        }
        
    }
}
        
        
    
        
        
        
        
        
        
        
        
        
        
        