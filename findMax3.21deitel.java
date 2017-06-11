
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		// declares the input variables along with counter variables and the max variable
		long input1=0;
		long input2=0;
		long input3=0;
		long input4=0;
		long input5=0;
		long input6=0;
		long input7=0;
		long input8=0;
		long input9=0;
		long input10=0;
		int counter=1;
		int comparisonCounter=1;
		long MAX = 0;
		while(counter <=10){//Used to assign inputs to their respective input variables
			System.out.println("Please input an integer for number " + counter);
			long answer = input.nextLong();
			switch(counter){ // the counter variable is used to help assign the inputs to the correct variable
				case 1: // on the first run the first number entered will be assigned to variable input1. the same concept follows for the rest.
					input1=answer;
					break;
				case 2: 
					input2=answer;
					break;
				case 3: 
					input3=answer;
					break;
				case 4: 
					input4=answer;
					break;
				case 5: 
					input5=answer;
					break;
				case 6: 
					input6=answer;
					break;
				case 7: 
					input7=answer;
					break;
				case 8: 
					input8=answer;
					break;
				case 9: 
					input9=answer;
					break;
				case 10: 
					input10=answer;
					break;
			
							
			} //end switch case statement
			counter++;
		}// end while loop
		
		 
		while(comparisonCounter<=10){//this loop will compare each number to the variable max. if the number is greater than max, then max is assigned that number. 
			long comparison=0; // intializes the comparison number
			switch(comparisonCounter){// much like above
			  	case 1:
			        comparison=input1;
			        break;
				case 2: 
					comparison=input2;
					break;
				case 3: 
					comparison=input3;
					break;
				case 4: 
					comparison=input4;
					break;
				case 5: 
					comparison=input5;
					break;
				case 6: 
					comparison=input6;
					break;
				case 7: 
					comparison=input7;
					break;
				case 8: 
					comparison=input8;
					break;
				case 9: 
					comparison=input9;
					break;
				case 10: 
					comparison=input10;
					break;
				
			}
			if(comparison>MAX){
				MAX=comparison;
			}
			comparisonCounter++;
		} //end of whileloop that gives the max number
		
		System.out.printf("The max number is %,d", MAX);
		System.out.println();
		
	}//end of main methody
}// end of class
