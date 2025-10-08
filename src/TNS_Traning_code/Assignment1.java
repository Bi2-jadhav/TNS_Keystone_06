package TNS_Traning_code;
import  java.util.Scanner;

public class Assignment1 {
	//Write a java program to get all your details like your Full name with Initial, roll number Grade and percentage
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter Full Name with Initial: ");
        String fullName = sc.nextLine();

        System.out.print("Enter Name without Initial: ");
        String nameWithoutInitial = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNumber = sc.nextLine();

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        // Printing as per sample output
        System.out.println(fullName);
        System.out.println(nameWithoutInitial);
        System.out.println(rollNumber);
        System.out.println(rollNumber);  
        System.out.println(grade);
        System.out.println(grade);       
        System.out.println(percentage + "%");

        sc.close();
    }

}
