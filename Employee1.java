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
public class Employee1 {
    private String firstName;
    private String lastName;
    private Date1 birthDate;
    private Date1 hireDate;

    public Employee1(String firstName, String lastName, Date1 birthDate, Date1 hireDate){
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.birthDate = birthDate;
    	this.hireDate = hireDate;

    }
    public String toString(){
    	return String.format("%s, %s, Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
}
