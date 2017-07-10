package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mark
 */

public class PrimeFinder {

    private static int howManyNums;
//since the loop variable used to calculate the prime numbers is within the isPrime method, we cannot access any variables from isPrime method in the main method. the solution I found was to make a class variable to count the amount of numbers used in the isPrime method. To no ones surprise, n/2 takes 24,985,002  to calculate prime numbers from 2 to 10000. the sqrt(n) takes ~650,000 needed to calculate prime numbers. 
    public static void main(String[] args){
        int primeCounter=0;
        
        for(int userInput = 2; userInput <10000; userInput++){
           
            if(PrimeFinder.isPrime(userInput)== true){
            System.out.printf("%-5d", userInput);
                primeCounter++;
                if(primeCounter%10==0){
                System.out.println();
                }
            }
           
        
       }//end of for loop
        System.out.println();
        System.out.println();
        System.out.printf("It took %,d loops to calculate all the primes\n", howManyNums);
    }//end of main method
    
    public static boolean isPrime(int input){
       int prime=0;
       int conditionalVariable = input/2;// sets up the upper limit. If the lower half does not produce a factor than the remaining half will not produce a factor because you are essentially multiplying lower half by the upper half in order to obtain the number. So testing all values is redundant. 
        for(int i=2; i<= conditionalVariable; i++){
           howManyNums ++;
            //every number is always divisible by 1
             if(input%i == 0){
                 prime = 1;
             }
        
        }
        return prime != 1; 
    }
    public static int howManyNumbers(int i){
        return i;
    }
}
