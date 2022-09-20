/* Task : Creating Credentials for New Hires.
Task is divided into three parameters : 1.Generate Email Address;
 										2.Generate Password; 
 										3. Display Credentials.*/

package service;

import java.util.Scanner;  // Scanner is used to read Input in a Java Program.
import java.util.Random;  // Import Random class for generation of Password.
import model.Employee;

public class CrendentialServices {
	// Data Members
	

	public String generateEmailID(String fname, String sname, String dept)
	{
		return fname+sname+"@"+dept+".learningbydoing.com";
	}
	
	public String generatePassword(int length)
	{
		String passwordSet= "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@$%&*";
		char[] password=new char[length]; // password length is set to 8
		for(int i=0;i<length;i++) {  // loop is used to generate password of length 8
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
		
		}
		
	
	public void displayEmpDetails(String fname, String sname, String generateEmail, String genPwd)
	{
		System.out.println("Emp FirstName is "+fname);
		System.out.println("Emp LastName is "+sname);
		System.out.println("Emp EmailID is "+generateEmail);
		System.out.println("Emp Password is "+genPwd);
	}
}

