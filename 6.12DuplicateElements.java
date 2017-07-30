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
public class duplicateElement {
    

  
  public static void main(String[] args){
    
    int[] array = {1, 4, 3, 7, 9};
    int[] storesDuplicates = new int[5];
    int isDuplicate = 0;//used to indicate the index of where duplicate value is stored
   
    for(int i = 0 ; i< array.length; i++ ){
       
      for(int j = i+1 ; j < array.length; j++) {
          //loop cycles through the array to determine the duplicate values
           if(array[i]==array[j]){
               storesDuplicates[isDuplicate]=array[i];//stores value of duplicate
               isDuplicate++;
           }
      
        }//end of for statement→used to obtain the duplicate values
      }//end of outer for statement
    
    for(int k = 0; k<array.length;k++){
        int duplicate=0;//used to find out which value of the original array is a duplicate
        for(int h = 0; h <array.length; h++ ){
        
            if(storesDuplicates[h]==array[k]){
                duplicate++;
                h=6;//forces loop to end by changing the continuation condition
            }//end of if statement
            
        }//end of inner for loop
        if(duplicate == 0){//means that the inner loop did not find any equal values, so there is not a duplicate. 
            System.out.printf("%d is not a duplicate", array[k]);
            System.out.println();
        }//end of if statement 
    
    }// end of outer for statement
    }// end of main method
}// end of class