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

    int[] array = {1, 1, 1, 2, 3};
    int[] storesDuplicates = new int[5];
    int isDuplicate = 0;//used to indicate the index of where duplicate value is stored

    for(int i = 0 ; i< array.length; i++ ){

      for(int j = i+1 ; j < array.length; j++) {
          //loop cycles through the array to determine the duplicate values
           if(array[i]==array[j]){
                for(int e=0; e<storesDuplicates.length; e++){
                   int newIndex = 0;
                   for(int w = 0; w < storesDuplicates.length; w++){
                       if(storesDuplicates[e]!=storesDuplicates[w]){
                           newIndex++;
                           w = 6;
                       }//end of if statement
                   }//end of inner for
                if(newIndex ==0){
                    storesDuplicates[isDuplicate] = array[i]; 
                    //stores value of duplicates
                    
                    isDuplicate++;
                    }
                }
            }//end of inner for(j) if statement
        }//end of for statement→used to obtain the duplicate values
        }//end of outer loop statement

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

    }// end of inner for statement
    }
}



    