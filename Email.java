
package email.application;

import java.util.Scanner;
/*

Class Purpose:
	Creating the objects for the main class

*/
public class Email {
	// Variables
	/*
		These will all be encapculated so users can't access these 
		directly
	*/
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com"; // this can change depending on the company
	// although this would make sense to do it this way since companies don't want employees changing the name
	
	// Constructor that receives the first and last name
	public Email(String firstName, String lastName){
	
		this.firstName = firstName;// defining variable through this API
		this.lastName = lastName;// defining varible through this API
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department is " + this.department);
	
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is " + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
		
	}// constructor
	
	// Ask for the department
	private String setDepartment(){
	
		// Print Menu showing avalible departments
		System.out.print("DEPARTMENT CODES \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter your department code: ");
		
		// creating Scanner to accept input from console
		Scanner in = new Scanner(System.in);
		// variable for Scanner information
		int depChoice = in.nextInt();
		
		//switch statement to process information
		switch(depChoice){
			case 1:
				return "sales";
				
			case 2: 
				return "dev";
				
			case 3: 
				return "acct";
				
			default:
				return "--";
				
		}// switch
		
	}// setDepartment method
	
	// Generate a random password
	
	private String randomPassword(int length){
	
		// set the charactors the password can be made from
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
		
		// password will be contained in a array of characters
		char[] password = new char[length];
		
		// For loop for generating the password
		for(int i=0; i<length; i++){
			
			// Math.random * passwordSet = a number between 0 and the length of the password set
			int rand = (int)(Math.random() * passwordSet.length());
			
			// password array for storing the password
			password[i] = passwordSet.charAt(rand);
			
		}// for loop
		
		return new String(password);
		
	}// randomPassword method
	
	// ******************** SET METHODS **********************

	// Set a mailbox capacity
	public void setMailboxCapacity(int capacity){
	
		this.mailboxCapacity = capacity;
		
	}// Setter method for mailbox capacity
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail){
		
		this.alternateEmail = altEmail;
		
	}// setter method for setting up an alternate email
		
	// Change the password
	public void changePassword(String password){
		
		this.password = password;
		
	}// setter method for changing the password
	
	// ****************** GET METHODS **********************
	
	public int getMailboxCapacity(){
		
		return mailboxCapacity;
		
	}// Get method for mailbox capacity
	
	public String getAlternateEmail(){
		
		return alternateEmail;
		
	}// Method for getting alternate email
	
	public String getPassword(){
		
		return password;
		
	}// Method for getting the new password
	
	public String showInfo(){
		
		return "DISPLAY NAME: " + firstName + " " + lastName + 
			"COMPANY EMAIL: " + email + 
			"MAILBOX CAPACITY: " + mailboxCapacity + "mb";
		
	}// Method that displays all the information
	
}// Email class
