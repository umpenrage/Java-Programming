

public class Main{
	public static void main(String[] args){
		
		int loopVariable=1;
	
	while(loopVariable <=8){//while loop creates 8 lines of 8 *
		int loopVariable1=1;
		if(loopVariable % 2 == 0){//when ever the next line is even there is an indention
  				System.out.print(" ");//Provides the indention
  		}
  		while(loopVariable1<=8){// loop prints out 8 *'s per loop
  	
    		System.out.print("* ");
    		loopVariable1++;
  		}//end of inner while loop
		System.out.println();
		loopVariable++;
		
	
	}//end of while loop
	
	}//end of main method

}//end of class