/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Mark
 */
public class rectangle{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int loopVariable=1;
		System.out.println("How big do you want the length of the square to be?");
		int answer= input.nextInt();
		input.nextLine();
		while(loopVariable<=answer){
			System.out.print("*");
                        loopVariable++;
                        
		}//end of while loop
		System.out.println();
                int loopVariable2=1;
                while(loopVariable2<=answer-2){
                    System.out.print("*");
                    int loopVariable3=1;
                    while(loopVariable3<=answer-2){// the reason answer-2 is because the ends are already taken into account with lines 28 and 34
                        System.out.print(" ");
                        loopVariable3++;
                    }//end of while loop
                    System.out.print("*\n");
                    loopVariable2++;
                    
                }//end of side while loop
            int loopVariable4=1;
            while(loopVariable4<=answer){
                System.out.print("*");
                loopVariable4++;
                        
		
            }// end of while loop 
         System.out.println();
        }
        
}
