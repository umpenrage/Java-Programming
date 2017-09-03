/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.security.SecureRandom;
/**
 *
 * @author Java-programming
 */
public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();
    
        public DeckOfCards(){
            currentCard = 0;
            String[] faces = {"ace", "duece", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
            
            String[] suits ={"hearts", "diamonds", "clubs", "spades"};
            deck = new Card[NUMBER_OF_CARDS];
            
            for(int count = 0; count < deck.length; count++){
                deck[count] = new Card(faces[count%13], suits[count/13]);//prevents card duplication and inputs values into the Card object deck.
            }
        }
        public void shuffle(){
            for(int first = 0; first < deck.length; first++){
                int second = randomNumbers.nextInt(NUMBER_OF_CARDS);//provides a number 0-51 that 
                Card temp = deck[first];//this works because a card object requires a variable called suit and face. deck[first] has those variables. As long as those variables have been initialized, then temp variable is valid.
                deck[first]=deck[second];//the first index 0 is equal to the card and suit value
                deck[second]= temp; 
                //what prevents the same card and suit from being stored? Does not appear to be a mechanism that will check for equality? The loop on line 25 ensures that there are not any duplicate cards.
                //there was a second variable of currentcard, but it did not appear to do anything. Unsure as to why it was included.?? Still not sure as to why. 
                
            }
        }
        public Card dealCard(){
            System.out.println(currentCard);
            if(currentCard < deck.length){
                
                return deck[currentCard++];//this statement combines two actions. One is it returns the the index based on currentCard's value. The second action increments the value of currentCard by 1. 
                
            }
            else{
                
                return null;
                
            }
    }
}
