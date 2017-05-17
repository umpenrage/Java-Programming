import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);//creates input object
		//variable declaration
		
		int gallons=0;
		int mileage=0;
		int totalGallons=0;
		int totalMileage=0;
		//variables declared above
   
    System.out.println("Input the miles and gallons of gas used: input the miles first and then gas");
		mileage=input.nextInt();
		gallons=input.nextInt();
		while(mileage !=-1 || gallons != -1){//Creates sentinel value of -1; loops stops running 
			
				double mpg = mileage/gallons;
				System.out.printf("\t\t\t\tYour MPG is %2.2f" , mpg);
				System.out.println();
				totalGallons += gallons;
				totalMileage +=mileage;
				System.out.println();
				System.out.println("Input the miles and gallons of gas used: input the miles first and then gas");// By placing the  question at the end of loop, errors in calculation are prevented when the user inputs -1 for both mileage and/or gallons 
				mileage=input.nextInt();
				gallons=input.nextInt();
		      
		}
		if(mileage !=0 && gallons != 0){//calculates the average mpg per trip; only displays when mileage and gallons aren't 0
		double totalTripMpg=totalMileage/totalGallons;
	  System.out.printf("Your total MPG for the entire trip is: %2.2f", totalTripMpg);
		}
		else{//Assumes that the user inputted either -1 so both gallons and mileage are equal to zero
		  System.out.println("You did not input any calculable values");
		}
	}
	
	
	
}