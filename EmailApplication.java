
package email.application;

/*
	This program is made to set up emails of new hires
Algorithm:\
	_X_Syntac used: firstname.lastname@department.company.com
	_X_Determine Department (sales, development, accounting)
	_X_Generate a random string for a password
	_X_Have set methods to change the password, set the mailbox capacity, and define an alternative email address
	_X_Have get methods to display the name, email, and mailbox
	__Create a method that displays all the information
*/

public class EmailApplication {

	public static void main(String[] args) {
		
		Email em_1 = new Email("Ryan", "Scott");// calling email constructor
		
		
		
		System.out.println(em_1.showInfo());// printing the String the show info method calls
		
	}// main
	
}// class
