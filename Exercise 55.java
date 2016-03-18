import java.util.Scanner;

public class AddingValueToALoop
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int  yournum = 1;
int sum = 0;
System.out.println("I will add up the numbers you give me.");
System.out.print("Number: ");

yournum = in.nextInt();
sum = sum + yournum;

while (yournum != 0)
{

System.out.println("The total so far is " + sum );
System.out.print("Number: ");

yournum = in.nextInt();
}



System.out.println();
System.out.println("The total is " + sum );
}
}