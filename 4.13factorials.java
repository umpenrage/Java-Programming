public class Main{

	public static void main(String[] args){
		int factorial=1;
		for(int i=1; i<=20; i++){
			factorial*=1;
			System.out.printf("%,d", factorial);
			if(i%5){
				System.out.println();
			}// end of if statement
		}// end of for
}// end of main method
}//end of class