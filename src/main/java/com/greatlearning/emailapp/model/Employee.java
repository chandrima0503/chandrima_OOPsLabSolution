package com.greatlearning.emailapp.model;

public class Employee {
	
	private String firstname;//creating a class variable for firstname
	private String lastname;//creating a class variable for lastname
	
	//initialising value in parameterized constructor
	public Employee(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
