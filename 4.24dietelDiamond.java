public class Main{
  
	
	public static void main(String[] args){
	  for(int outer1=1; outer1<=10; outer1++){
	    for(int inner4=10; inner4>=outer1; inner4--){
	      System.out.print(" ");
	    }
	    for(int inner5=1; inner5<=outer1; inner5++){
	      System.out.print("*");
	    }
	    for(int inner6=2; inner6<=outer1; inner6++){
	      System.out.print("*");
	    }
	    System.out.println();
	  }	
	
		for(int outer=9; outer>=1;outer--){
			for(int inner2=10; inner2>=outer; inner2 --){
			  System.out.print(" ");
			}
			for(int inner=1; inner<=outer; inner++){
			System.out.print("*");
			}
			for(int inner3=2; inner3<=outer; inner3++){
			  System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
