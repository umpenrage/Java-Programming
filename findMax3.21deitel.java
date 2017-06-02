import java.util.Scanner;

public class Main{
	
	public static void main(Strings[] args){
		Scanner input = new Scanner(System.in);
		int input1=0;
		int input2=0;
		int input3=0;
		int input4=0;
		int input5=0;
		int input6=0;
		int input7=0;
		int input8=0;
		int input9=0;
		int input10=0;
		int counter=1;
		int MAX;
		while(counter <=10){
			System.out.println("Please input an integer for number " + counter);
			int answer = input.nextInt();
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
		
		MAX = input1;
		if(input2>MAX){
			MAX=input2;
		}
		if(input3>MAX){
			MAX=input3;
		}
		if(input4>MAX){
			MAX=input4;
		}
		if(input5>MAX){
			MAX=input5;
		}
		if(input6>MAX){
			MAX=input6;
		}
		if(input7>MAX){
			MAX=input7;
		}
		if(input8>MAX){
			MAX=input8;
		}
		if(input9>MAX){
			MAX=input9;
		}
		if(input10>MAX){
			MAX=input10;
		}
		
		System.out.println("The max number is " + MAX);
		
	}//end of main methody
}// end of class