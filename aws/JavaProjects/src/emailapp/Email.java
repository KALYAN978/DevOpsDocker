package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	// we need constructor to receive the first Name and last Name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: "+ this.firstName + " " + this.lastName);
		
		//Call a method asking for department and return the department
		this.department = setDepartment();
		System.out.println("Department: "+ this.department);
	}
	
		// we need to ask for the department
		private String setDepartment() {
			System.out.println("DEPARTMENT CODES\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code:");
			Scanner sc = new Scanner(System.in);
			int depChoice = sc.nextInt();
			if(depChoice == 1)
			{
				return "sales";
			}
			else if(depChoice == 2)
			{
				return "development";
			}
			else if(depChoice == 3)
			{
				return "accounting";
			}
			else 
			{
				return "";
			}
			
		}
	
	// we need to generate a random password
		// we need to set the mailBox capacity
		// we need to set the alternate email
		// we need to change the password
	
}
