import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("What length is the square's sides?");
	int sideLength = input.nextInt();// user input for the sideLength
	Main.buildSquare(sideLength);// calls the buildSquare method
	}// end of main method
	
	public static void buildSquare(int sideLength){
		for(int outerLoop=1; outerLoop<=sideLength; outerLoop++ ){//controls how many lines are generated based on user input
			for(int innerLoop = 1; innerLoop<=sideLength; innerLoop++ ){//creates each line of the box
				System.out.print("*");
				if(innerLoop%sideLength==0){
				System.out.println();
				}
			}// end of innerLoop
		}// end of outerLoop
	}//end of buildSquare method
	
	
}// end of class