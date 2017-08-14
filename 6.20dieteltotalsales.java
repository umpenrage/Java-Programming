import java.util.Scanner;

public class Main{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
				
		String[] names = new String[5];
		int[][] product = {{254, 325, 1007, 5007, 6005}, {458, 562, 358, 8009, 9008}, {562, 780, 8002, 9008, 8765},{4587,968,654,589, 849}, {254, 325, 1007, 5007, 6005}};
		for(int i = 0; i < names.length; i++){
			String name = getName();
			names[i]= name; 
			
			
		}
		System.out.println("Employee\t 1\t 2\t 3\t 4\t 5\t\t total");
		for(int i = 0; i < names.length; i++){
		  System.out.printf("%S\t\t", names[i]);
      for(int k = 0; k < product[i].length; k++){
				System.out.printf("%,d\t",product[i][k]);
			}
				
			System.out.println();
			
		  
		}
		
		
	}
	
	
	public static String getName(){//tells user to input names
		System.out.print("Please input a name : ");
		String name = input.nextLine();
		return name;
	}
	
	
	
	
	
}