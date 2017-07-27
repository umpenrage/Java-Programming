/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


/**
 *
 * @author Mark
 */
public class ArrayPractice {

    public static void main(String[] args){
    int[] sales = {250,300,6000,0 ,0 , 0 , 0, 0 , 0 , 40000};
    //int[] salary = new int[10];
    int[] frequency = new int[11];
    for( int i = 0 ; i<sales.length; i++){
        int saleVariable = sales[i];
        int SalaryVariable = ArrayPractice.salaryMethod(saleVariable);
       
        switch(SalaryVariable){
            case 2: frequency[SalaryVariable]++;
                    break;
            case 3: frequency[SalaryVariable]++;
                    break;
            case 7: frequency[SalaryVariable]++;
                    break;
            case 10: frequency[SalaryVariable]++;
                    break;
        }
       
    }
    for(int j = 2 ; j<frequency.length; j++){
        System.out.printf("For element %d the frequency is %d", j, frequency[j]);
        System.out.println();
    }    
    
    
    }
    public static int salaryMethod(int saleVariable){
        int salaryVariable1 = (int)(saleVariable*.09+200)/100;
        if(salaryVariable1>=10){
            salaryVariable1=10;
        }
        return salaryVariable1;
    }
}
