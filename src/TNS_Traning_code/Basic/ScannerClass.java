package TNS_Traning_code.Basic;
import java.util.*;

public class ScannerClass {

	public static void main(String[] args) {
		
		        // Create Scanner object
		        Scanner sc = new Scanner(System.in);

		        // Taking different types of input
		        System.out.print("Enter your name: ");
		        String name = sc.nextLine();  // Reads a full line (string)

		        System.out.print("Enter your age: ");
		        int age = sc.nextInt();  // Reads an integer

		        System.out.print("Enter your marks: ");
		        double marks = sc.nextDouble();  // Reads a decimal value

		        System.out.print("Are you a student? (true/false): ");
		        boolean isStudent = sc.nextBoolean();  // Reads a boolean

		        // Printing the input values
		        System.out.println("\n--- User Details ---");
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("Marks: " + marks);
		        System.out.println("Student: " + isStudent);

		        // Closing Scanner
		        sc.close();


	}

}
