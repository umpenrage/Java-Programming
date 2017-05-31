import java.util.Scanner; 

public class Main{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int overtimeHours=0;
		int hoursWorked;
		//final double hourlyRate= 19.23; ← was assumping a static hourly rate
		int counter =0;
		boolean rerun=true; // loop variable 
			
			while(rerun){//beginning of while loop.
				counter++; //counter is used to represent the employee's place on the list
				System.out.println("Please input the hourly rate for employee " + counter);
				double hourlyRate = input.nextDouble(); // input hourly rate
				System.out.println("Please input the number of hours worked for the previous two weeks :");
				hoursWorked = input.nextInt(); // the hours worked for the previous two weeks
				input.nextLine();
				overtimeHours = hoursWorked - 80; // determines whether there are any overtime hours	
				if(overtimeHours <0){ // if statement is a catch for people who work less than 80 hours. 
					overtimeHours =0; // overtime hours are set to zero because people who work less than 80 hours would cause the variable to be negative leading to an incorrect calculation. Plus you can't have negative pay. 
				}
				double overtimePay=0;	
						if(overtimeHours>0){
							overtimePay=1.5*hourlyRate*overtimeHours;// originally overtimePay was only declared inside the If statement. The line of code used to calculate gross pay relies upon this variable. If the variable is not declared outside of the if statement, then the variable cannot be used because it is only accessible within the if statement. It is not available outside of the if statement. 
						} else {
							//continue on with the loop
						}
					double grossPay= hoursWorked*hourlyRate + overtimePay;
					
					System.out.printf("The gross pay for %d is %,.2f ", counter, grossPay);
					
					System.out.println();
					
					System.out.println("Would you like to run this script again?(1 for Yes and 2 for No");
						int answer = input.nextInt();
						
							if(answer !=1 && answer != 2){// catches incorrect input
							  System.out.println("You have input an incorrect value");
							  boolean incorrectSelection = true;//loop variable
							  while(incorrectSelection){// starts loop that will hopefully make the user choose the correct integer. Unsure how to make it stop giving errors for string inputs or other kinds of inputs. 
							   System.out.println("Would you like to run this script again?(1 for Yes and 2 for No");
							   int correctSelection = input.nextInt();
							   if(correctSelection == 1 || correctSelection == 2){
							     answer = correctSelection;
							     incorrectSelection = false;//makes loop variable false in order to exit the loop.
							   }
							  }//end of 2nd while loop
							}
				    	if(answer == 2){
									rerun=false;// makes loop variable false in order to exit the loop.
							}
		
		
		
		
		
	}// ends 1st while loop
	

	
	
  }// ends main method
}// ends main class