/**
 * SYST 17796 Project Winter 2019 code.
 * Students can modify and extend to implement their game.
 * Virajkumar Padhiyar
 * Jeni Patel
 * Meet Patel
 * Parthkumar Patel
 * 
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author Virajkumar, 2018
 */
    public class Card 
    {
         public Card() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //default modifier for child classes
    private Card_type types;
    private Suits suit;
    int tot = 0;
	int total = 0;
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    public Card (Card_type cardCardType, Suits cardSuit){
    this.types = cardCardType;
    this.suit = cardSuit;
    }

   

    public int getCardType(){
     return types.getcardvalue();
    }

    public String getSuit(){
    return suit.PrintSuitValue();
    }

    public String toString(){ //return String representation of Card
    return types + " of " + suit;
    }
    }