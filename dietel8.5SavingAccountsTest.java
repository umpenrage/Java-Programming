/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Java-programming
 */
public class SavingAccountsTest {
    public static void main(String[] args) {
        SavingsAccount mySavings = new SavingsAccount(4000, .05);
        mySavings.printArray();
        System.out.println();
        SavingsAccount mySavings1 = new SavingsAccount(6000, 0.05);
        mySavings1.printArray();
        System.out.println();
        System.out.println(mySavings1.getAnnualInterestRate());
    }

    
}
