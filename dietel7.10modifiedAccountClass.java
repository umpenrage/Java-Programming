/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Java-programming
 */
public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account("Mark", 2300.08);
        System.out.println("Would you like a balance statement?\nType 'yes' or 'no'");
        String balance = input.nextLine();
        if(balance.equalsIgnoreCase("yes")){
        System.out.printf("The balance of the Account is: %,.2f%n",myAccount.getBalance());
        }
        System.out.println("Would you like to deposit some funds?\nType 'yes' or 'no'");
        String deposit = input.nextLine();
        if(deposit.equalsIgnoreCase("yes")){
            System.out.println("How much would you like to deposit?");
            double moreFunds = input.nextDouble();
            input.nextLine();
            myAccount.deposit(moreFunds);
            System.out.printf("The new balance is: %,.2f%n",myAccount.getBalance());
        }
        System.out.println("Would you like to withdraw some money?\nPlease type 'yes' or 'no':");
        String answer = input.nextLine();
        while(answer.equalsIgnoreCase("yes")){
            System.out.println("Please input the amount that you would like to withdraw.");
            double withdrawal = input.nextDouble();
            input.nextLine();
            if(withdrawal > myAccount.getBalance()){
                System.out.println("You have insufficient funds");
                answer = "no";
            }else{
                System.out.printf("Your new balance is %,.2f\n", myAccount.withdraw(withdrawal));
                System.out.println("Would you like another transaction? Please Type 'yes' or 'no'");
                String anotherTransaction = input.nextLine();
                if(anotherTransaction.equalsIgnoreCase("no")){
                    answer = "no";
                }
            }
        }
    }
}
