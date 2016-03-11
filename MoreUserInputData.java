
import java.util.Scanner;

/*
 
 */

/**
 *
 * @author charles
 */
/*
 Ask the user for several pieces of information, and display them on the screen afterward as a summary.
•first name 
•last name 
•grade (classification) 
•student id number 
•login name 
•GPA (0.0 to 4.0)

 */


/**
 *
 * @author charles
 */
public class MoreUserInputData {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        String fName,sName,login,Name;
        double grade,studentId,gpa;
        
        
        System.out.print("First name: ");
        fName = in.next();
        System.out.print("Last name: ");
        sName = in.next();
        System.out.print("Grade(9-12): ");
        grade = in.nextDouble();
        System.out.print("Student ID: ");
        studentId = in.nextDouble();
        System.out.print("Login: ");
        login = in.next();
        System.out.print("GPA(0.0-4.0): ");
        gpa = in.nextDouble();
        System.out.println();
         
         Name = fName + sName;
        System.out.println("Your information: " );
        
        System.out.println();
        
        System.out.print("Login: " + login);
        System.out.println("ID: " + studentId + "\n");
        System.out.print("Name: " + Name + "\n");
        System.out.println("GPA: " + gpa + "\n");
        System.out.print("Grade: "+ grade + "\n");
        
    }
}
