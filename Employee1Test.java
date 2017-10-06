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
public class Employee1Test {
	public static void main(String[] args){
		Date1 birth = new Date1(7, 24, 1949);
		Date1 hire = new Date1(3, 12, 1988);
		Employee1 employee = new Employee1("Bob", "Blue", birth, hire);
		System.out.println(employee);
	}
}
