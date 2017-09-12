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
public class Employee {
    private String firstName;
    private String lastName;
    private double wage;
    
    public Employee(String firstName, String lastName, double wage){
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
        
    }
    public void setFirstNameLastName(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName = lastName;
        
    }
    public String getFirstNameLastName(){
        String fullName = firstName + " " + lastName;
        return fullName;
    }
    public void setWage(double wage){
        this.wage = wage;
    }
    public double getWage(){
        return wage;
    }
    public void printRaise(double wage){
        this.wage = wage*(1.10);
        System.out.printf("%,.2f", wage);
        
    }
}

