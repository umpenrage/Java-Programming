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
public class Account {
    private String name;
    private double balance;
    //creating a constructor. NOTE : A CONSTRUCT MUST HAVE THE SAME NAME AS THE CLASS NAME. ANY DIFFERENCE WOULD NOT YIELD A CONSTRUCTOR. A constructor allows you to create custom intilization of objects.This is useful because it allows for us to setup our desired variables without having to use significant lines of code to initiate variables. 
    public Account(String name, double balance){
        
        this.name= name;
        if(balance>0.0){
            this.balance = balance;
        }
    }
    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance += depositAmount;
        }
    }
    public double getBalance(){
        return balance; 
    }
    public void setName(String name){// to be honest, once we setup the constructor to create a name, this method is pretty much useless.
        this.name = name;//The keyword this is used 
    }
    public String getName(){
        return name;
       
    }
    public double withdraw(double amount){
	balance -= amount;
	return balance;
}
}// end of account class
