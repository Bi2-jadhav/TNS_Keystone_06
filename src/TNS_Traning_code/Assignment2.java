package TNS_Traning_code;

//Create a default constructor in the class Student that prints a message "Student object is created" when the program is run. Define a class Commission described as follows: Data Members: Name, Address, Phone, Sales_amount Member methods: (1) To accept details of the sales employee (II) to calculate the commission as follows: Sales_amount >= 100000, commission = 10%; 50000 <= Sales_amount < 100000, commission = 5%, 30000 <= Sales_amount < 50000, commission = 3%, Sales_amount < 30000, no commission. White the main method to create an object of a class and call the above member method.

import java.util.Scanner;

//Student class
class Student {
 // Default constructor
 Student() {
     System.out.println("Student object is created");
 }
}

//Commission class
class Commission {
 // Data members
 String name;
 String address;
 String phone;
 double salesAmount;

 // Method to accept details
 public void acceptDetails() {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Name: ");
     name = sc.nextLine();

     System.out.print("Enter Address: ");
     address = sc.nextLine();

     System.out.print("Enter Phone: ");
     phone = sc.nextLine();

     System.out.print("Enter Sales Amount: ");
     salesAmount = sc.nextDouble();
 }

 // Method to calculate commission
 public void calculateCommission() {
     double commission = 0;

     if (salesAmount >= 100000) {
         commission = salesAmount * 0.10;
     } else if (salesAmount >= 50000) {
         commission = salesAmount * 0.05;
     } else if (salesAmount >= 30000) {
         commission = salesAmount * 0.03;
     } else {
         commission = 0;
     }

     // Printing details with commission
     System.out.println("\n--- Employee Details ---");
     System.out.println("Name: " + name);
     System.out.println("Address: " + address);
     System.out.println("Phone: " + phone);
     System.out.println("Sales Amount: " + salesAmount);
     System.out.println("Commission: " + commission);
 }
}

public class Assignment2 {
	
	public static void main(String[] args) {
		 // Creating Student object (default constructor message will be printed)
        Student s1 = new Student();

        // Creating Commission object and calling methods
        Commission c1 = new Commission();
        c1.acceptDetails();
        c1.calculateCommission();
	}
}
