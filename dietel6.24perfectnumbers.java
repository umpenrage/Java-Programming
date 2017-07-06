package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.*;
/**
 *
 * @author Mark
 */
public class ispefect {

    public static void main(String[] args){
        
        System.out.println("Please input a number.\nThis program will determine if it is a perfect number.");
        for(int userInput = 1; userInput<9000; userInput++){
            
        
        int sumComparison = ispefect.factorCalculator(userInput);
        if(ispefect.perfect(sumComparison, userInput)==true){
            System.out.printf("%,6d is a perfect number", userInput);
            System.out.println();
            }//end of if statement
        }// end of for statement
    }//end of main method
    public static int factorCalculator(int input){
        int sum=1;//all of the numbers have 1 from the start
        for(int i = 2; i<input; i++){
            //this method will calculate factors 
            int factor=input/i;
            if(input%i == 0){
                sum += factor; //if the remainder = 0 then then 'i' is a factor, thus it is added to the sum variable. 
            }
        }
        return sum;// returns the value of the sum variable in order to compare to the 'userInput' variable
    }
    
    public static boolean perfect(int sum, int userInput){
        
        return sum==userInput;//used to determine whether or not the userInput variable is equivalent to the sum variable
    }
    
    
}
