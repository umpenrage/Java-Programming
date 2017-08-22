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
        int answer;
        System.out.println("Please input the last digit desired for your fibonacci sequence");
        
        try{
            answer = input.nextInt();
            input.nextLine();
        }catch(Exception e){
            System.out.println("You have inputted an answer that is greater than 2.2 billion. Converting input to greatest possible integer value");
            answer = 210000000;
        }
        
        if(answer < 1){
            boolean loop = true;
            while(loop){
                int answer1=0;
                if(answer < 1){
                    System.out.println("Please input a whole number greater than 0");
                    answer1 = input.nextInt();
                    input.nextLine();
                }
                if(answer1 >=1 && answer1<= Integer.MAX_VALUE){
                    answer = answer1;
                    loop = false;
                }
            }
        }// end of if statement
        Fibonacci.calculateNthDigit(answer);
        System.out.println();       
    }
    
    public static void calculateNthDigit(int input){
        int[] array = new int[input];
        int lastElement=0;
        for(int i = 0; i< array.length; i++){
            if(i<=1){
              
            array[i]=i;
            
            System.out.printf("%,d ", array[i]);

            }else{
          
                array[i]=array[i-1]+array[i-2];
                if(array[i] >=0 && array[i] <= Integer.MAX_VALUE){
                    System.out.printf("%,d ", array[i]);
                    
                }else{
                    
                    lastElement = i;
                    i = array.length;
                }
                
            }
 
            
        }
       if(array[input-1]==0){
        System.out.printf("\n\nThe last value in this sequence is %,d", array[lastElement-1]);
       }else{
        System.out.printf("\n\nThe last value in this sequence is %,d", array[input-1]);
       }
    }
}

