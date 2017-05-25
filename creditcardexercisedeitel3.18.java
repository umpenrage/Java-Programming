import java.util.Scanner;

public class Main{
  
  public static void main(String args[]){
  Scanner input = new Scanner(System.in);
  int creditLimit;
  int balance = 0;
  int charges = 0;
  int payments = 0;
  int newCharges = 0;
  int finalBalance;
  
  System.out.println("Please select one of the following accounts: 425, 470, 438 :");
  
  int account = input.nextInt();
  input.nextLine();
    if(account == 425){ // all the below provides the credit limit for each account
     creditLimit = 4500;
     }
    else if(account == 470){
      creditLimit = 500;
    }
    else if(account == 438){
      creditLimit = 6600;
      
    }
    else{ //this exits the program when user types in any other numbers but 425, 470 or 438
      System.out.println("You have inputted an incorrect account");
      System.exit(1);
    }
    
    System.out.println("What is the beginning balance?");
    balance = input.nextInt();
    input.nextLine();
    System.out.println("Are there any new charges to the card(1 for yes 2 for no)");
    int anyCharges = input.nextInt();
    input.nextLine();
    if(anyCharges == 1){
      
      while(newCharges!=-1){
        
        charges += newCharges;
        System.out.println("Please input the charges. Type '-1' to stop entering charges");
        newCharges = input.nextInt(); 
         
      } 
      System.out.println(charges);
        
      
    }
    else{
        System.out.print("This is the end of the program so far");
      }
    
    
    
    
    

    
    
    
  }
  
  
}