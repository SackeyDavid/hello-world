import java.util.Scanner;
public class compareTo {
public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	
	String carswell = "Carswell";
	String jones = "Jones";
	String smith = "Smith";
	String young = "Young";
	String lastname;
	String repeatYes = "yes";
	String repeatNo = "no";
	String repeat;
do {
System.out.println("This is a program to tell how long you have to wait for your name to be called during a roll call");
System.out.println();
System.out.print("What's your last name? ");
lastname = in.next();
if (carswell.compareTo(lastname) > 0){
System.out.println("You don't have to wait long, " + lastname);
}
 
else if (lastname.compareTo(carswell) < 0) {
	System.out.println("That's not bad, " + lastname);
}
else if (lastname.compareTo(smith) < 0) {
	System.out.println("look's like a bit of a wait, " + lastname);
}
else if (lastname.compareTo(young) < 0) {
	System.out.println("It's gonna be a while, " + lastname);
}
else if (lastname.compareTo(young) > 0) {
	System.out.println("not going anywhere for a while, " + lastname);
}
	System.out.print("Would you like to repeat? ");
	repeat = new String(in.next()); 	
}while(repeat.equals(repeatYes));

}
}