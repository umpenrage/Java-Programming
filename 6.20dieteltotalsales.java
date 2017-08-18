import java.util.Scanner;

public class Main{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		int grandTotal=0;
		String[] names = new String[5];
		int[][] product = {{254, 325, 1007, 5007, 6005}, {458, 562, 358, 8009, 9008}, {562, 780, 8002, 9008, 8765},{4587,968,654,589, 849}, {254, 325, 1007, 5007, 6005}};
		for(int i = 0; i < names.length; i++){
			String name = getName();
			names[i]= name; 
			
			
		}
		
		System.out.printf("\n%S %25d %15d %15d %15d %15d %26S\n","Employee", 1,2,3,4,5, "total");
		
		for(int i = 0; i < names.length; i++){
		  int total = 0;
		  System.out.printf("%-10S\t\t\t", names[i]);
      for(int k = 0; k < product[i].length; k++){
        
				System.out.printf("%-,8d\t",product[i][k]);
        total += product[i][k];
        ;
        if(k==product[i].length-1){
          System.out.printf("\t%-,1d", total);
          grandTotal +=total;
        }
          
      }
			
			System.out.println("");
		
		}
		System.out.print("=====================================================================================================================||===========\n");
    System.out.printf("%-10S\t\t", "Total");
    int k = 0;
    
    for(int i = 0; i<product.length; i++){
      
      int total2 = getColumnSum(product, k);
      System.out.printf("\t%-,8d", total2);
      k++;
    }
    System.out.printf("%15s %-,6d"," ", grandTotal);
  }

	
	public static int getColumnSum(int[][] array, int k){
	  int total = 0;
	  int column = k;
	  for(int row=0 ; row<array.length;row++){
	    total += array[row][column];
	   
	  }
	    return total;

  }
	  

	
	
	public static String getName(){//tells user to input names
		System.out.print("Please input a name : ");
		String name = input.nextLine();
		return name;
	}
	

}
	
	
	
	
