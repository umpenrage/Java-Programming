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
public class Accounts{
	private String month;
	private int monthNum;
	private double currentBalance;

	public Accounts(String month, int monthNum, double currentBalance){
		this.month = month + " " + monthNum;
		this.currentBalance = currentBalance;

	}
      
	public String toString(){
		return String.format("%-7s %-8.2f", month, currentBalance);
	}
}
