import java.util.Random;
import java.util.Scanner;

public class FlipAgain
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner(System.in);
		Random r = new Random();

		String again ;

		do
		{
			int flip = r.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = in.next();
		} while ( again.equals("y") );
		
		
		
		//The  program still works when "again" is uninitialized with the do-while. This is
		//because, initially, with the while loop, the condition was that "again" when compared
		//to "y" should be equal/same (actually strings are objects in java, and 
		//we can't say if(again == "y")... because we cannot have two same 
		//objects. So the equals() method actually compares two strings for equality.)
		//But as at the declaration of the while loop, we had not yet given a 
		//content/value for "String again", it was only a name with no value. This made
		//the comparison impossible for the while loop's condition to be tested.
		//Therefore initializing the "again" made the comparison feasible for the 
		//decision as to whether the block of code within the while loop should be executed 
		//to be made.
		//
		//Furthermore, using the do-while loop, we didn't need to initialize 
		//the "again" because it was going to be initialized from the user's input.
		//So before the condition would be tested, as do-while loops do customarily,
		//the code within the do-while  would have been executed, which here, allowed the "again"
		// to be initialized.
		//  
		//
		//This is why we observed those two behaviours.
		  
	}
}