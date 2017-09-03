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
public class Fibonacci2 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("How many iterations. Use Whole numbers: ");
        double answer = input.nextDouble();
        input.nextLine();
        calculate(answer);
    }
    
    public static void calculate(double input){
        double secondValue=0;
        double firstValue=1;
        for(double i = 0; i< input; i++){
            
                double nextNumber = firstValue + secondValue;
            secondValue=firstValue;
            firstValue = nextNumber;
            
            if(i<1){
                System.out.printf("%-1d %10d %10s", 0, 1, " ");
            }
            System.out.printf("%-,10.0f  ", nextNumber);
            if(i%10==0 && i>1){
                System.out.println();
            }
        }
        
    }
}
