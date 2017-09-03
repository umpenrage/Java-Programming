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
public class Card {
    private final String face;
    private final String suit;
    
    public Card(String face, String suit){
        this.face = face;
        this.suit = suit;
        
    }
    public String toString(){
        return face + " of " + suit;
    }
}
