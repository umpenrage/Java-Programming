
package javaapplication1;

import java.util.Scanner;

public class EmployeeTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the employees First Name");
		String firstName = input.nextLine();
		System.out.println("What is the employee's Last Name");
		String lastName = input.nextLine();
		System.out.println("What is their monthly salary?");
		double wage = input.nextDouble();
		input.nextLine();
		Employee myEmployee = new Employee(firstName, lastName, wage);
		System.out.println("Does the employee deserve a raise? Type Yes or No");
		String answer = input.nextLine();
		if(answer.equalsIgnoreCase("yes")){
			myEmployee.setRaise(wage);
		}
		System.out.printf("%-20s \t %10.2f", myEmployee.getFirstNameLastName(), myEmployee.getWage());

	}

}