package model;

public class Employee {
	private String firstName;	//First name of Employee
	private String lastName;	//Last name of Employee
	
	public Employee() {
		this.firstName="Mariyam";
		this.lastName="Sardar";
	}

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
