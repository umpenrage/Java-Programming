import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
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
		int comparisonCounter=2;
		long MAX;
		while(counter <=10){
			System.out.println("Please input an integer for number " + counter);
			long answer = input.nextLong();
			switch(counter){
				case 1: 
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
		
		MAX = 0;
		while(comparisonCounter<=10){
			long comparison=0;
			switch(comparisonCounter){
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
		} //end of whileloop
		
		System.out.println("The max number is " + MAX);
		
	}//end of main methody
}// end of class