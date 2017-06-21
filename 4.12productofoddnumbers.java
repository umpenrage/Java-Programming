public class Main{

	public static void main(String[] args){
		int productOfOddNumbers=1;
		for(int i=1; i<=20; i++){
			if(i%2==0){
				continue;
			}
			productOfOddNumbers*=i;
			
		}
		System.out.printf("The sum of all the odd numbers 1-20 is %,3d", productOfOddNumbers);
		System.out.println();
	}

}