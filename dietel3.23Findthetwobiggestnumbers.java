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
		int compareForMax2=1;
		long MAX = 0;
		long MAX2 = 0;
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
	  	/* while(compareForMax2<=comparisonCounter-1){ //this adjustment fixes the logical error descibed below. Here we set the loop continuation condition equal to the above loops counter -1(due to the counter being incremented before this loop is engaged). This loop will only run once per iteration of the main loop. below compareForMax2 is iterated by 1, so we  each time this loop is ran it is insync with the above loop. 
			  long comparison2=0;
			  switch(compareForMax2){
			  case 1:
			     if(MAX == input1){
			      break;
			    }
			    comparison2=input1;
			   	break;
				case 2: 
				   if(MAX == input2){
			      break;
			    }
					comparison2=input2;
					break;
				case 3: 
				  if(MAX == input3){
			      break;
			    }
					comparison2=input3;
					break;
				case 4: 
				  if(MAX == input4){
			      break;
			    }
					comparison2=input4;
      				//	 if(MAX == comparison2){
      			 //     break;
      			 //   }
					break;
				case 5: 
					if(MAX == input5){
			      break;
			    }
					comparison2=input5;
					break;
				case 6: 
				  if(MAX == input6){
			     break;
			    }
					comparison2=input6;
					break;
				case 7: 
				    if(MAX == input7){
			      break;
			    }
					comparison2=input7;
					break;
				case 8: 
				  if(MAX == input8){
			      break;
			    }
					comparison2=input8;
					break;
				case 9: 
					if(MAX == input9){
			      break;
			    }
					comparison2=input9;
					break;
				case 10: 
					if(MAX == input10){
			      break;
			    }
					comparison2=input10;
					break;
			  }// end of switch case statement
			  
			  if(comparison2>MAX2){
			    MAX2=comparison2;
			  }
			  compareForMax2++;
			}// end of second while loop */
		
	  	
		} //end of whileloop
		
		while(compareForMax2<=10){// originally this loop was in the above loop. However, this failed because of the nature of nested looping. The second loop obtains the value of the maximum number before the main loop does. Therefore this leads to both MAX and MAX2 being the same. The second loop's logic requires it to skip the case where max = input, but since the maximum value was already found, this logic is completely useless. Moving this loop outside the main loop solved the problem. ** see the above comment for a correction that fixes the nest loop issue described. 
			  long comparison2=0;
			  switch(compareForMax2){
			  case 1:
			     if(MAX == input1){
			      break;
			    }
			    comparison2=input1;
			   	break;
				case 2: 
				   if(MAX == input2){
			      break;
			    }
					comparison2=input2;
					break;
				case 3: 
				  if(MAX == input3){
			      break;
			    }
					comparison2=input3;
					break;
				case 4: 
				  if(MAX == input4){
			      break;
			    }
					comparison2=input4;
      				//	 if(MAX == comparison2){
      			 //     break;
      			 //   }
					break;
				case 5: 
					if(MAX == input5){
			      break;
			    }
					comparison2=input5;
					break;
				case 6: 
				  if(MAX == input6){
			     break;
			    }
					comparison2=input6;
					break;
				case 7: 
				    if(MAX == input7){
			      break;
			    }
					comparison2=input7;
					break;
				case 8: 
				  if(MAX == input8){
			      break;
			    }
					comparison2=input8;
					break;
				case 9: 
					if(MAX == input9){
			      break;
			    }
					comparison2=input9;
					break;
				case 10: 
					if(MAX == input10){
			      break;
			    }
					comparison2=input10;
					break;
			  }// end of switch case statement
			  
			  if(comparison2>MAX2){
			    MAX2=comparison2;
			  }
			  compareForMax2++;
			}// end of second while loop
		
	  	
		} //end of whileloop
		
		
		
		
		System.out.printf("The biggest number is %,d", MAX);
		System.out.println();
		System.out.printf("The 2nd biggest number is %,d", MAX2);
		System.out.println();
		
	}//end of main methody
}// end of class