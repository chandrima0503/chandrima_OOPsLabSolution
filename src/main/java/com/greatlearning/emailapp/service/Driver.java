package com.greatlearning.emailapp.service;
import com.greatlearning.emailapp.model.Employee;
import java.util.Scanner;


public class Driver {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firstname");//Scanner class to take firstname as user input
		String fname = sc.next();
		System.out.println("Enter the lastname");//Scanner class to take lastname as user input
        String lname = sc.next();
        System.out.println("Please Enter the department from the following \n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal \n");
        int dpt= sc.nextInt();//Scanner class to take department as user input
        String department ="";
        switch (dpt) {//switch case sets strings based on user input
	        case 1:
	            department = "technical";
	            break;
	        case 2:
	            department = "admin";
	            break;
	        case 3:
	           department = "humanresources";
	            break;
	        case 4:
	            department = "legal";
	            break;
        }
        sc.close();
        
        //Calling parameterized constructor
        Employee e1 = new Employee(fname,lname);
        
		//creating CredentialsService class object
		CredentialsService credentialsService = new CredentialsService();
		
		//Calling generatePassword method of credentialsService class and storing value in a variable
		String password = credentialsService.generatePassword();
		
		//Calling generateEmailAddress method of credentialsService class and storing value in a variable
		String email = credentialsService.generateEmailAddress(e1, department);
		
		//Calling showCredentials method of credentialsService class 
		credentialsService.showCredentials(fname, password, email);
		
	}

}
