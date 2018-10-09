/*
 * 
 * Mark Umpenhour
 * 
 * Assignment 6: Donations Array
 * 
 * Date: 10/08/2018
 * 
 * This program will track the amount of donations given by individuals
 */
import java.util.Scanner;

public class Donations {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int DONATORS = 15;
		Scanner input  = new Scanner(System.in);
		String[]  donorName= new String[DONATORS];
		double[] amountDonated = new double[DONATORS];
		int[] numDonations = new int[DONATORS];
		double[] totalDonation = new double[DONATORS];
		double grandTotalDonations =0;
		//call method to list the names
		int count = 0;
		while(count < DONATORS) {
			storeNames(donorName, input, count);
			storeAmountDonated(donorName, amountDonated,input, count);
			numberOfDonations(numDonations, input, count);
			calculateDonation(amountDonated, numDonations, totalDonation, count);
			count++;
			input.nextLine(); //needed so that way the \n gets removed and doesn't cause the input to skip
		}
		printDonations(donorName, amountDonated, numDonations, totalDonation);
		
		grandTotalDonations =  calculateGrandTotal(totalDonation);
		
		System.out.printf("The grand total of all donations is : %,4.2f ",grandTotalDonations);
	}//end of main method

	/*
	 * storeAmountDonated will store the amount donated by an individual donor
	 * Parameters: array(String): donorName
	 * 						Scanner:input
	 * 						int: count
	 *						array(double): amountDonated
	 *
	 *Local Variables: double: amount
	 *							bool: loop
	 */


	public static void storeAmountDonated(String donorName[],double amountDonated[], Scanner input,  int count) {
	
			System.out.print(donorName[count] + "'S donation amount: ");
			double amount = input.nextDouble();
			if((int)amount <5 ) {
				boolean loop = true;
				while(loop) {
					System.out.print("You will need to donate at least 5.00: ");
					amount = input.nextDouble();
					if((int)amount >0) {
						loop = false;
					}
					else {
						//loop will continue
					}
				}//end of while loop 
				
			}
			else {
				//do nothing 
			}//end of if statement. 
			amountDonated[count]= amount;
	}//end of store amount donated
	
	/*
	 * numberOfDonations will store the number of donations for a particular donor
	 * 
	 * Parameters: Scanner: input
	 * 						int: count
	 * 						array(int): numDonations
	 * Local Variables: int: donationNum
	 * 							 bool: loop
	 * 							
	 */
	public static void numberOfDonations(int numDonations[], Scanner input, int count) {
			System.out.print("Number of donations :  ");
			int donationNum = input.nextInt();
			if(donationNum <1) {
				boolean loop =true;
				while(loop) {
					System.out.print("You must have at least 1 donation. Number of donations: ");
					donationNum = input.nextInt();
					if(donationNum>=1) {
						loop = false;
					}
					else {
						// loop continues
					}
				}//end of while loop 
			}
			else {
				//do nothing
			}
			numDonations[count] = donationNum;
	}//end of number of donations method

	/*
	 * storeNames will store the name of the donor in the String array
	 *
	 * Parameters: Scanner: input
	 * 					   array(string): donorName
	 * 					   int: count
	 * Local Variables: String: name
	 * 
	 */
	
	public static void storeNames(String donorName[], Scanner input, int count) {
			System.out.print("Donor " + (count+1) + " Name :");
			String name = input.nextLine();
			donorName[count]=name.toUpperCase().trim();
			
	}//end of of store names method
	/*
	 * calculateDonation calculates the grand total donation for an individual donor.
	 * 
	 * Parameters: array(double): amountDonated, totalDonation
	 * 						array(int): numDonations
	 * 						int: count
	 * 
	 */
	public static void calculateDonation(double amountDonated[], int numDonations[], double totalDonation[], int count ) {
			totalDonation[count]= amountDonated[count]*numDonations[count];
	
	}
	/*
	 * calculateGrandTotal calculates the grand total of donations given by all donors.
	 * 
	 * Parameters: array(double): totalDonation
	 * 
	 * Local Variable: double grandTotal;
	 * 
	 */
	public static double calculateGrandTotal(double totalDonation[]) {
		double grandTotal=0;
		for(int i = 0; i < totalDonation.length; i++) {
			grandTotal +=totalDonation[i];
		}
		return grandTotal;
	}
/*
 * printDonations will print the donor and all of their relevant information
 * 
 * Parameters: array(String): donorNames;
 * 						array(double): amountDonated, totalDonation
 * 						array(int):numDonations
 * 
 */
	public static void printDonations(String donorNames[],double amountDonated[], int numDonations[], double totalDonation[]) {
		System.out.println("\nPolical Donations by Donor   ");
		System.out.println("==========================\n");
		for(int i = 0; i<donorNames.length; i++) {
			System.out.println("--------------------------");
			System.out.println("Donor : " +  donorNames[i]);
			System.out.printf("Amount donated:  $ %,5.2f \n", amountDonated[i]);
			System.out.println("Number of donations: " + numDonations[i]);
			System.out.printf("Total Donated : $ %,5.2f \n", totalDonation[i]);
			System.out.println("--------------------------\n");
		}
	}//end of print donations method

}//end of class

