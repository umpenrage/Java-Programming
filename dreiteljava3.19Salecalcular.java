import java.util.Scanner;

//This program will calculate commission based on the number of items for each person 1, 2, 3 or 4



public class Main{
  
  
  public static void main(String[] args){
  
  double totalPay1=0;
  double totalPay2=0;
  double totalPay3=0;
  double totalPay4=0;
  Scanner input = new Scanner(System.in);
  double totalSoldDollar=0;
  int totalItems;
  final double COMMISSION_RATE=.09;
  
  boolean loop=true;
      while(loop){
        totalSoldDollar=0;// needs to be reset each time the program is looped. if not then it would lead  to spill over, which would cause incorrect calculations.
        System.out.println("Please select employee 1, 2 , 3 or 4 :");
        int selection= input.nextInt(); // user needs to select employee 1, 2, 3 or 4
        input.nextLine(); // used to prevent overwrite of following commands, java does not captor the entire line after nextint, double, etc, so another input would be skipped.
		if(selection <1 && selection >4){// is initiated if user selects a number less than 1 or greater than 5
			boolean notValidSelection = true
			while(notValidSelection){
				System.out.println("You Chose an incorrection selection please select either 1, 2, 3 or 4");
				int selection1 = input.nextInt();
				switch(selection1){
					case 1: 
						selection = 1;
						notValidSelection=false;
						break;
					case 2: 
						selection = 2;
						notValidSelection= false;
						break;
					case 3:
						selection = 3;
						notValidSelection= false;
						break;
					case 4:
						selection = 4;
						notValidSelection= false;
						break;
					default: 
							System.out.println("Not within range");
				} // ends switch statement
				
			} // ends loop
		}// ends if
        System.out.println("How many items do you want to input?:");
        totalItems = input.nextInt();//Used in for loop 
        input.nextLine();
        
        switch(selection){//Same code in each case sequence 
          case 1:
              for(int i=1 ; i <=totalItems; i++){//For loop ends once i = totalitems
                System.out.println("Please input the total dollar amount sold :");
                System.out.print("Item " + i+ " "); // displays the item number entry
                double soldAmount= input.nextDouble();//user inputs the dollar amount of 
                totalSoldDollar+=soldAmount;//calculates total dollar amount sold for an employee. 
                
                
                
              } //ends for statement
              double commission=totalSoldDollar*COMMISSION_RATE;
              totalPay1=200 + commission;
              break;
          case 2:
               for(int i=1 ; i <=totalItems; i++){
                System.out.println("Please input the total dollar amount sold :");
                System.out.print("Item " + i+ " ");
                double soldAmount= input.nextDouble();
                totalSoldDollar+=soldAmount;
                
              }
              commission=totalSoldDollar*COMMISSION_RATE;
              totalPay2=200 + commission;
              break;    
              
          case 3:
               for(int i=1 ; i <=totalItems; i++){
                System.out.println("Please input the total dollar amount sold :");
                System.out.print("Item " + i+ " ");
                double soldAmount= input.nextDouble();
                totalSoldDollar+=soldAmount;
                 
              }
              commission=totalSoldDollar*COMMISSION_RATE;
              totalPay3=200 + commission;
              break;  
              
          case 4:
             for(int i=1 ; i <=totalItems; i++){
                System.out.println("Please input the total dollar amount sold :");
                System.out.print("Item " + i+ " ");
                double soldAmount= input.nextDouble();
                totalSoldDollar+=soldAmount;
                 
              }
              commission=totalSoldDollar*COMMISSION_RATE;
              totalPay4=200 + commission;
              break;  
          
        }
        
        
        System.out.println("Would you like to rerun this to input values for another employee? Type 1 for Yes and 2 for No");//Gives user the option to rerun the program for a different employee or the same employee.
        int runAgain= input.nextInt();
        input.nextLine();
        if(runAgain !=1 && runAgain !=2){//Since there are two selections to run, this if checks to see if the user inputted the correct selections. '1' or '2' are the correct selections
          boolean wrongSelection = true;//initializes the variable for the while loop.
          while(wrongSelection){//While loop continously asks user to  type 1 or 2 in order to proceed through the program. 
            System.out.println("Please type 1 or 2");
            int runAgain1 = input.nextInt();
            if(runAgain1 == 1){
              runAgain = 1;// changes runAgain variable to 1 allowing the program to proceed
              wrongSelection= false;// Switch the variable within the while loop to false allowing exit of the while loop. 
            } 
            else if(runAgain1 == 2){
              runAgain = 2;
              wrongSelection=false;
            } else{
              
            }
            }//ends while loop
          }
          if(runAgain == 2){//used to be an elseif, but that was a logic error . the else if would only run if the preceding if statement is false, because the previous statement is triggered true when an incorrect selection is selected the statement would fail to executed even if runAgain's value becomes 2. An if statement fixes this error.
            loop = false;
          }
          }
          System.out.printf("The paycheck amount for Employee 1 is %,.2f \nThe paycheck amount for Employee 2 is %,.2f \nThe paycheck amount for Employee 3 is %,.2f\n The paycheck amount for Employee 4 is %,.2f", totalPay1, totalPay2, totalPay3, totalPay4);
        }
}