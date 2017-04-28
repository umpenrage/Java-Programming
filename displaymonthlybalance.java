public class Main{
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int months = 12;
    
    double rate = .05/12;//declares monthly interest rate
  
    final double rateMultiplier=1+rate;
    
    double monthlyContribution=100;//amount added each month
    
    double balance=0;
    //↑ initially we do not have a balance
    for(int i =1; i<=months; i++){
      //↑ Starts loop to print out monthly balance with interest applied.
      balance = (monthlyContribution+balance)*rateMultiplier;
      
      System.out.printf("The balance of the month %d is %5.3f", i, balance);
      System.out.println();
      
    }
      
      
  }
}