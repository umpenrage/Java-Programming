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
public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();
        for(int i = 1; i<=52; i++){
            System.out.printf("%19s", myDeckOfCards.dealCard());
            if(i%4==0){
                System.out.println();
            }
        }
    }
}
