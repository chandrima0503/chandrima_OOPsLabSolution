package com.greatlearning.emailapp.service;
import com.greatlearning.emailapp.model.Employee;

public class CredentialsService {
	
	private static final int pwd_length=8;//setting a fixed length for password
	
	//method to generate random password containing numbers, Capital letters, small letters, and special characters
	public String generatePassword() {
		
		String passwordSet= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz$%!@#";
        char[] password=new char[pwd_length];
        for(int i=0;i<8;i++) {
			int pwd= (int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(pwd);
		}
		return new String(password);
	
	}
	
	//method to generate email address based on employee firstname, lastname and department
	public String generateEmailAddress(Employee emp,String dep) {
		String email=emp.getFirstName()+emp.getLastname()+"@"+dep+".greatlearning.com";
		return email;
	}
	
	//to display the credential-single responsibility method
	public void showCredentials(String firstName,String password,String email) {
		System.out.println("Dear "+firstName+" your generated credentials are as follow\n"
								  + "Email -->"+email
								  +"\n"
								  +"Password -->"+password
								  +"\n");
	}
}
