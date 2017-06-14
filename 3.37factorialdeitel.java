//correct method
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double eulerVariable=1;
	int whileLoopVariable=1;
	
	//double completeFunction=0; no longer needed because we were duplicating work. The reason is we are using  this method's eulerVariable to add each interations' totalVariable/factorial yielding the correct results. 
	double factorial=1;
	System.out.println("This program will use the taylor series of e^x to approximate a value");
	System.out.println("What is the exponent value(x) of e^(x)? ");
	int exponentValue=input.nextInt();
	System.out.println("How many iterations would you like to use to approximate the value of e^(x)?");
	int interationVariable= input.nextInt();
	while(whileLoopVariable<=interationVariable){
	 
		double totalVariable=Math.pow(exponentValue,whileLoopVariable);
	 
		factorial*=whileLoopVariable;//creates the proper factorial by multiplying the previous stored variable by this interation's whileLoopVariable
		
		eulerVariable+=totalVariable/factorial;
	
		whileLoopVariable++;
		
		
	}//end of while loop
	
	System.out.printf("The approximation of e to the %d is %3.6f", exponentValue, eulerVariable);
		
	}//end of main method

}// end of Main class
//Another method to calculate factorials. I have added notes that corrected the below class
/* public class Main{
	public static void main(String[] args){
	double eulerVariable=0;
	int whileLoopVariable=1;
	
	double completeFunction=1;
	double factorial=1;
	//sout will go here later to ask the exponential power to be used. for a test we are using 2
	int exponentValue=3;
	//sout will go here to ask the user the interations required. for a test we are using 5
	int interationVariable=20;
	while(whileLoopVariable<=interationVariable){
	 
		factorial*=whileLoopVariable;
		// this variable and calculation yields the correct results

		eulerVariable=factorial;
		
		//This use to have newer values added to the older values of factorial leading to incorrect results. To correct this, I removed the '+=' and replaced it with an '='. The reason for this change is that the factorial is already calculated with the 'factorial *='. By using 'eulerVariable+=' instead 'eulerVariable=' the program was adding the correct factorial to the stored sum of eulerVariable generated from previous iterations. This calculation made the denominator incorrect for each iteration. The fix was to remove the '+=' and replace with just '='.
		
	  double numeratorVariable=Math.pow(exponentValue,whileLoopVariable); 
	  
	  //this was changed to totalVariable in the correct method. This yielded incorrect calculation results because numeratorVariable was continually having values added to it. Due to my failure to consider the mathematics of the problem, this yielded incorrect results. Simply you cannot add numerators together because each denominator is different. numeratorVariable should not have had values added to the stored variable. this has been fixed. 
	
	  completeFunction+=numeratorVariable/eulerVariable;
		//The main issue with this variable is that the numeratorVariable is calculated incorrectly. the euler variable should not be an issue.
		
		whileLoopVariable++;
		
		
	}//end of while loop
	
	System.out.println("The approximation of e to the " + exponentValue+ " is " + completeFunction );
  }//end of main method
}//end of main class
	
	
	
	
	}//end of main method

}// end of Main class */ 