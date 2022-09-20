package app;
import java.util.Scanner;  // Scanner is used to read Input in a Java Program.
import java.util.Random;  // Import Random class for generation of Password.
import model.Employee;
import service.CrendentialServices;

public class Driver {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String fn=sc.next();
		System.out.println("Enter Last Name");
		String ln=sc.next();
		Employee e1=new Employee(fn,ln);//PC
		
		CrendentialServices cs=new CrendentialServices();
		String generateEmail="";
		char[] genPwd=null;
		
		do
		{
		System.out.println("Pls choose your department");
		System.out.println("1. Tech");
		System.out.println("2. Legal");
		System.out.println("3. HR");
		System.out.println("4. Accounts");
		System.out.println("5. Exit");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"tech");
			genPwd=cs.generatePassword();
			break;
		case 2:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"legal");
			genPwd=cs.generatePassword();
			break;
		case 3:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"hr");
			genPwd=cs.generatePassword();
			break;
		case 4:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"acc");
			genPwd=cs.generatePassword();
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Pls enter valid choice");
		}
		
		cs.displayEmpDetails(e1.getFirstName(),e1.getLastName(),generateEmail,genPwd);
		//System.out.println("Email ID :" +generateEmail);
		//System.out.println("Password :" +genPwd);
		}while(true);
	}

}
