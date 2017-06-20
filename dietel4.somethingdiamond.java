public class Main{//loop to create bottom of diamond
	
	public static void main(String[] args){
		
		for(int outer=10; outer>=1;outer--){
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

