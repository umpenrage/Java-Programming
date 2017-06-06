import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int passes =0;
		int failures=0;
		int studentCounter=1;
		
		while(studentCounter<=10){
			System.out.println("Enter result (1= pass 2 = fail)");
			int result = input.nextInt();
			input.nextLine();
			if(result != 1){
				if(result !=2){
					boolean startCorrectionLoop =true;
					while(startCorrectionLoop){// originally startCorrectionLoop was equal to true but this caused a logical error. if startCorrectionLoop is always true then there is an infinite loop. getting rid of 'startCorrectionLoop=true" resolved this issue. 
						System.out.println("You have entered an integer that is not 1 for pass and 2 for fail.\nPlease enter 1 or 2");
						int correction = input.nextInt();
						input.nextLine();
						if(correction == 1 ){
							result = correction;
							startCorrectionLoop=false;
						}
						else if(correction == 2){
							result = correction;
							startCorrectionLoop =false;
						}
					}// end of correction while loop
				}// end of inner if statement
			}// end of outer if statement
			
			if(result ==1){
				passes++;
			}
			else{
				failures++;
			}
			studentCounter++;
		}// end of while loop
		System.out.printf("Passed:%d%nFailed:%d%n", passes, failures);
		if(passes > 8){
			System.out.println("Teacher gets a bonus");
		}

		
		
		
		
		
	}// end of main method
	
	
}// end of main class