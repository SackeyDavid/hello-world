/*
 *Make a short "Choose Your Own Adventure" game. 
The starting room should give the user two choices. 
Then the second room they travel to should give them two more choices. Finally the third room should give them two choices.

This means your game will have eight possible "endings". 
Your game will also have a total of fifteen rooms:

 */

/**
 *
 * @author SackeyDavid
 */
import java.util.Scanner;
public class ChooseYourOwnAdventure {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String responseYes = "yes";
        String responseNo = "no";
        String YesOrNo;        
        String  response1 = "upstairs";
        String  response2 = "kitchen";
        String  response3 ="refrigerator";
        String  response4 = "cabinet";
        String  response5 = "bedroom";
        String  response6 ="bathroom";
        String Firstresponse ;
        String Secondresponse ;
        String repeatNo = "no";
        String repeatYes = "yes";
        String repeat ;
        
        
       do {
        System.out.println("WELCOME TO SACKEY'S  TINY ADVENTURE!");
        System.out.println();
        
        System.out.println("You are in a creepy house! Would you like to go 'upstairs' or into the 'kitchen' ");
        System.out.print("> ");
        Firstresponse = new String(in.next()) ;   
	System.out.println();

        if (Firstresponse.equals(response2))
        {
        
           System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the 'refrigerator' or look in a 'cabinet'  ");
         
         System.out.print("> ");
          Secondresponse = new String(in.next()) ; 
	System.out.println();

            if (Secondresponse.equals(response3))
            {
                System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food? ('yes' or 'no') ");
	
	System.out.print("> ");
                YesOrNo = new String(in.next());
             System.out.println();

	if(YesOrNo.equals(responseNo))
                   {
                       System.out.println("You die of starvation... eventually.");
                     } 
	else if(YesOrNo.equals(responseYes))
	{
	       System.out.println("You must be seriously hungry. Go ahead!");
	} 
             }
             else if (Secondresponse.equals(response4))
	{
	        System.out.println("Inside the cabinet, you see plates and bowls. They look already washed. Would you liked to use some of them? ('yes' or 'no') ");

	System.out.print("> ");
                YesOrNo = new String(in.next());
             System.out.println();	

	if(YesOrNo.equals(responseNo))
                   {
                       System.out.println("Then be ready to eat in your palms...");
                     } 
                else if(YesOrNo.equals(responseYes))
                {
                      System.out.println("Eh! ...Where is the food?");
                } 
              }
         }

          else if (Firstresponse.equals(response1)){

                
                
                   System.out.println("Upstairs you see a hallway. At the end of the hallway is the master 'bedroom'. There is also a 'bathroom' off the hallway. Where would you like to go? ");

                   System.out.print("> ");
          Secondresponse = new String(in.next())  ;
	System.out.println();

               if (Secondresponse.equals(response5))
            {
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? ('yes' or 'no' )");
	
                   System.out.print("> ");
                YesOrNo = new String(in.next());
             System.out.println();

                       if (YesOrNo.equals(responseNo))
                       {
                           System.out.println("Well, then I guess you'll never know what is in there. Thanks for playing, I'm tired of making nested if statements.");
                       }
                      else if(YesOrNo.equals(responseYes))
                      {
                          System.out.println("Good, you can help keep the place tidy. You'll earn $50,000 after that.");
                      }
              }
             else if (Secondresponse.equals(response6))
             {
                    System.out.println("Inside the bathroom is a toilet, shower, sink and bath. They look very neat and sparkling but the shower is not flowing. Would you like to use it? ('yes' or 'no' ) "); 

                System.out.print("> ");
                YesOrNo = new String(in.next());
             System.out.println();	

	if(YesOrNo.equals(responseNo))
                   {
                       System.out.println("You will smell bad...");
                     } 
                else if(YesOrNo.equals(responseYes))
                {
                      System.out.println("You can use a bucket of water instead of the shower...");
                } 
             }
           
       }
            
	System.out.print("Would you like to play again? ('yes' or 'no') > ");
                 repeat = new String(in.next());
            System.out.println();
         } while(repeat.equals(repeatYes));
        
    }
    
    
}
