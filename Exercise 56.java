import java.util.Scanner;

public class DoWhileSwimming
{
    public static void main( String[] args ) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);

        String swimmer1 = "GALLANT";
        String swimmer2 = "GOOFUS ";

        double minimumTemperature = 79.0; // degrees Fahrenheit
        double currentTemperature;
        double savedTemperature;
        int swimTime;

        int choice;
        
        System.out.println("This program does 6 things:");
        System.out.println("1.Runs when the current water temperature is 80.5F.");//The two swimmers swim for the same amount of time.
        System.out.println("2.Runs when the starting water temperature is 78F and shows the changes.");
        System.out.println("3.Tells you if Gallant checks the water temperature before diving in.");
        System.out.println("4.Tells you if Goofus checks the water temperature before diving in.");
        System.out.println("5.Tells you the difference between a \"while\" loop and a \"do-while\" loop?");
        System.out.println("6.Tells you which of the loops above is called a \"pre-test loop\" and which is called a \"post-test loop\".");
	System.out.println();
        System.out.print("which program number do you want? ");
        choice = keyboard.nextInt();
        System.out.println();
        if (choice == 1)
        {
         
        currentTemperature = 80.5;
        savedTemperature = currentTemperature; // saves a copy of this value so we can get it back later.

        System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
        System.out.println( swimmer1 + " approaches the lake...." );

        swimTime = 0;
        while ( currentTemperature >= minimumTemperature )
        {
            System.out.print( "\t" + swimmer1 + " swims for a bit." );
            swimTime++;
            System.out.println( " Swim time: " + swimTime + " min." );
            Thread.sleep(600); // pauses for 600 milliseconds
            currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
            System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );
        }

        System.out.println( swimmer1 + " stops swimming. Total swim time: " + swimTime + " min." );

          currentTemperature = savedTemperature; // restores original water temperature

        System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
        System.out.println( swimmer2 + " approaches the lake...." );

        swimTime = 0;
        do
        {
            System.out.print( "\t" + swimmer2 + " swims for a bit." );
            swimTime++;
            System.out.println( " Swim time: " + swimTime + " min." );
            Thread.sleep(600);
            currentTemperature -= 0.5;
            System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );

        } while ( currentTemperature >= minimumTemperature );

        System.out.println( swimmer2 + " stops swimming. Total swim time: " + swimTime + " min." );

        } 
      
        if (choice == 2)
        {
        currentTemperature = 78;
        savedTemperature = currentTemperature; // saves a copy of this value so we can get it back later.

        System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
        System.out.println( swimmer1 + " approaches the lake...." );

        swimTime = 0;
        while ( currentTemperature >= minimumTemperature )
        {
            System.out.print( "\t" + swimmer1 + " swims for a bit." );
            swimTime++;
            System.out.println( " Swim time: " + swimTime + " min." );
            Thread.sleep(600); // pauses for 600 milliseconds
            currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
            System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );
        }

        System.out.println( swimmer1 + " stops swimming. Total swim time: " + swimTime + " min." );

         currentTemperature = savedTemperature; // restores original water temperature

        System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
        System.out.println( swimmer2 + " approaches the lake...." );

        swimTime = 0;
        do
        {
            System.out.print( "\t" + swimmer2 + " swims for a bit." );
            swimTime++;
            System.out.println( " Swim time: " + swimTime + " min." );
            Thread.sleep(600);
            currentTemperature -= 0.5;
            System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );

        } while ( currentTemperature >= minimumTemperature );

        System.out.println( swimmer2 + " stops swimming. Total swim time: " + swimTime + " min." );
        System.out.println();
        System.out.println("Gallant doesn't swim at all but Goofus swims for a minute. This is");
        System.out.println("because we used a do-while loop (which executes a block of code before testing the condition)");
        System.out.println("for Goofus's swimming while we used a while loop (which tests the condition before any execution) for Gallant's swimming." );
        }

        if (choice == 3)
        {
         System.out.println();
         System.out.println("Gallant checks the water temperature first before he dives in.");
         System.out.println("This is because he refuses to swim in a water of temperature lower than 79F.");
         System.out.println("(Because of the while loop). Thus his swim-time was 0 min."); 

        }

        if (choice == 4)
        {
        System.out.println();
        System.out.println("Goofus however does not check the water temperature first before he dives in. This is because he swims a bit in the water of temperature 78F which is below");
        System.out.println("79F(the minimum temperature he can swim). After realizing by feeling that the water is cold, he stops swimming.Thus his swim-time was 1 min.(Given that we have 1 min per swim)."); 

        }

        if (choice == 5)
        {
        System.out.println("There are many differences between while loop and do-while loop. ");         
        System.out.println("Some important and basic differences between them is as follows: ");

        System.out.println("* A while loop first checks the condition before entering the body, but a do-while loop first enters the body and then checks the condition.");

        System.out.println("* A while is an entry-controlled loop, but do-while is an exit-controlled loop.");

        System.out.println("* In while loops, conditions come before the body, but in do-while loops, conditions come after the body.");

        }

        if (choice == 6)
        {
        System.out.println("A pre-test loop tests for a condition prior to running a block of code.");
        System.out.println("A post test loop runs the test after running a block of code.");
        System.out.println("In light of the two statements above, a while loop is a pre-test loop");
        System.out.println("and a do-while loop is a post-test loop.");
        }
       
       
    }
}