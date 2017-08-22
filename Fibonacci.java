/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Java-programming
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the last digit desired for your fibonacci sequence");
        double answer = input.nextDouble();
        input.nextLine();
        Fibonacci.calculateNthDigit(answer);
        Fibonacci.returnLast(answer);
    }
    
    public static void calculateNthDigit(double input){
        double[] array = new double[input];   
        for(int i = 0; i< array.length; i++){
          if(i<=1){
              array[i]=i;
          }else{
          
          array[i]=array[i-1]+array[i-2];
          }
          System.out.printf("%.0f ", array[i]);
          
        }
        
    }
    public static double returnLast(double input){
        double[] array = new double[input];   
        for(int i = 0; i< array.length; i++){
          if(i<=1){
              array[i]=i;
          }else{
          
          array[i]=array[i-1]+array[i-2];
          }
    }
        double returnNumber = array[input];
        return returnNumber;
    }
}