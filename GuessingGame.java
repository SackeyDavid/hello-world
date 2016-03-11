import java.util.Scanner;
public class GuessingGame {
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);

	int guess ;

	System.out.println("THE WORST NUMBER GUESSING GAME EVER!!!!!!!!!");
	System.out.println();
	System.out.print("I'M THINKING OF A NUMBER FROM 1-10. TRY TO GUESS! ");
	guess = in.nextInt();
	System.out.println();
	if (guess == 4){
	System.out.println("LOL!!! U GOT IT!  I CAN'T BELIEVE U GUESSED IT WAS 4!");
}
else {
	System.out.println("WOOT! U SUXOR!!!     I PWN JOO!!!  IT WAS 4!");
}
}
}