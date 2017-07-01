/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Mark
 */
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Type in two integers to see if the second input is a multiple on the first input");
       int input1=input.nextInt();
       int input2=input.nextInt();
       input.nextLine();
       int possibleMultiple = Multiples.isMultiple(input1, input2);
       if(possibleMultiple == 0){
           System.out.println(input2 +" is a multiple of " + input1);
       }
       else{
           System.out.println(input2 +" is not a multiple of " + input1);
       }


       
    }// end of main method
    public static int isMultiple(int a, int b){
        int multiple = b%a;         
      return multiple;
    }// end of isMultiple class
}// end of class
