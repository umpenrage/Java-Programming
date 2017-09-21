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
import java.util.Scanner;
public class DateTest{
	
	public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Please input the numerical Month");
            int month = input.nextInt();
            input.nextLine();
            System.out.println("Please input the numerical day");
            int day = input.nextInt();
            input.nextLine();
            System.out.println("Please input the  year");
            int year = input.nextInt();
            input.nextLine();
            Date myDate = new Date(month, day, year);
            printDate(month, day, year);
	}
	public static void printDate(int month, int day, int year) {
		if(month > 9 && day<=9){
			System.out.printf("%2d/0%d/%4d", month, day, year);	
		} else if(day > 9 && month < 10){
			System.out.printf("0%d/%2d/%4d", month, day, year);
		}else if(month >9 && day >9){
			System.out.printf("%2d/%2d/%4d", month, day, year);
		}else{
                    System.out.printf("0%d/0%d/%4d", month, day, year);
                }
	}
}
