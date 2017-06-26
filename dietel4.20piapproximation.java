public class Main{
	public static void main(String[] args){
			System.out.println("This program will print an approximation to PI using the 200,000 interations\nThe program will also determine the number of interations to arrive at 3.14159");
			final double  MULTIPLIER=4;
			double Approx=1;
			double piApprox=1;
			for(int i=1; i<=200000; i++){
			  
			 double exponent = Math.pow((-1), i);
	   
	     Approx +=(exponent/((2*i)+1));// getting an odd denominator or number is the formula 2k+1
	     int approx2= (int)(4*Approx*100000);
	
	     if(approx2 == 314159){
	       System.out.printf("It took %,d interations to approximate PI to 3.14159", i);
	      System.out.println();
	       break;
	     }
	   
	        
			}
	  				System.out.println(MULTIPLIER* Approx);

	
	}


}