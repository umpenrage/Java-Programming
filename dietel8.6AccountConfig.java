/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Java-programming
 */
/*
	Savings account - 
	needs static variable called annualInterestRate
		needs set method 
	needs currentBalance variable
		needs set and get method
	needs monthly interest rate
		needs get method
	needs monthlyinterest method will multiply the monthly interest rate * currentBalance
		
	create a method that includes an array which will display the months using the to string method and multiple classes
	create two account object with 2000 and 3000
	
		pseudocode
		initialize current balance with constructor and have set and get methods for each of these variables
		interest rate with constructor and have set and get methods for each of these variables
	create monthlyInterestDisplay object
		constructor(string month, int month, double monthlyBalance)

		toString{
			return monthInt + monthlyBalance
		}
		initialize the monthly interest variable using method. Allow for a get method.

		create print method using toString method
			Saver 1									Saver 2
		use array method to display the following :
			
			month 1 balance*monthly interest 		month 1 balance*monthly interest 
			month 2 balance*monthly interest
			...
			month 12 balance



*/

public class SavingsAccount{
	private static double annualInterestRate;
	private double currentBalance;
	private double monthlyInterestRate;

	public SavingsAccount(double currentBalance, double annualInterestRate){
		setCurrentBalance(currentBalance);
                setAnnualInterestRate(annualInterestRate);
		
		
	}
	public static void setAnnualInterestRate(double annualInterestRate){
		SavingsAccount.annualInterestRate = annualInterestRate;

	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setCurrentBalance(double currentBalance){
		this.currentBalance = currentBalance;

	}
	public double getCurrentBalance(){
		return currentBalance;
	}
	public void setMonthlyInterestRate(double monthlyInterestRate){
		this.monthlyInterestRate=(1+getAnnualInterestRate()/12);
	}
	public double getMonthlyInterestRate(){
		return monthlyInterestRate;
	}
	public double getUpdatedBalance(double currentBalance, double monthlyInterestRate){
		double updatedBalance = currentBalance * monthlyInterestRate;
		this.currentBalance = updatedBalance;
		return updatedBalance;
	}
	public void printArray(double){
		Accounts[] Array = new Accounts[13];
		for(int i=1; i<12; i++){
			Array[i]= new Accounts("month", i, getUpdatedBalance(getCurrentBalance(), getMonthlyInterestRate()));
			System.out.print(Array[i] \t Array1[i]);
		}
	}

}