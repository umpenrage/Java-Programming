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
public class Time2Test {
    public static void main(String[] args) {
       Time2 myTime = new Time2(15,23,10); 
       System.out.println(myTime.toUniversalFormat());
        System.out.println(myTime.toString());
      
    }
    
    
}
