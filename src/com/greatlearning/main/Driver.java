package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.model.*;
import com.greatlearning.service.*;

public class Driver {
	
	private static Scanner input = new Scanner(System.in);
	private static CredentialService crr = new CredentialService();

	public static void main(String[] args) {
		// Take input from user for firstName, LastName, choice(Department - 1,2,3,4)
		
		System.out.println("Enter your First Name");
		String firstName = input.next();
		
		System.out.println("Enter your Last Name");
		String lastName = input.next();
		
		System.out.println("Please enter the Department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int choice = input.nextInt();
		Employee emp;
		switch(choice)
		{
		case 1:
			emp = new Employee(firstName, lastName, "tech");			
			break;
		case 2:
			emp = new Employee(firstName, lastName, "adm");			
			break;
		case 3:
			emp = new Employee(firstName, lastName, "hr");			
			break;
		case 4:
			emp = new Employee(firstName, lastName, "lg");			
			break;
		default:
				System.out.println("Invalid option");
				return;
		}
		
		String email = crr.generateEmailAddress(emp);
		String password = crr.generatePassword();
		crr.showCredentials(emp,email,password);
	}

}
