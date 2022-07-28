package com.greatlearning.emailapp.test;

class RandomPasswordTest {
	public static void main(String[] args) {
		 String passwordSet= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz$%!@#";
	        char[] password=new char[8];
	        for(int i=0;i<8;i++) {
				int pwd= (int) (Math.random()*passwordSet.length());
				password[i]=passwordSet.charAt(pwd);
			} 
			System.out.println(new String(password));
	}
}