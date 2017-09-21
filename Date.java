/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class Date{
	private int month;
	private int day;
	private int year;
	public Date(int month, int day, int year){

		this.month = month;
		this.day = day;
		this.year = year;

	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public int getYear(){
		return year;
	}
}