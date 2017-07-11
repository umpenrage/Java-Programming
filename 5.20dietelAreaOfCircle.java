import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input  the radius");
		
		double userInput = input.nextDouble();
		input.nextLine();
		System.out.print("The area of the Circle is ");
		System.out.printf("%,.4f", Main.circleArea(userInput));
		System.out.println();
	
	
	}

	public static double circleArea(double input){
		
		double area = Math.pow(input, 2)*Math.PI;
	
		return area;
	}

}