/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Virajkumar Padhiyar
 * Jeni Patel
 * Meet Patel
 * Parthkumar Patel
 */
package ca.sheridancollege.project;

import java.util.Random;
/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * 
 */

public class Card_deck {

private Card[] deck;
private static final Random rnd = new Random();

private int cur_card; 
private static int no_of_Card = 52;
	private static final java.util.Random random = new Random();
	private int currentCard;
	/**
	 * index of next Card to be deal (0-51)
	 */
	private static int NUMBER_OF_CARDS = 52; 

public Card_deck(){
    //types of cards of array type
    Card_type [] types = {Card_type.ACE, Card_type.DEUCE, Card_type.THREE, Card_type.FOUR, Card_type.FIVE, Card_type.SIX,
                     Card_type.SEVEN,Card_type.EIGHT, Card_type.NINE, Card_type.TEN, Card_type.JACK, Card_type.QUEEN,
                     Card_type.KING};
    Suits[] suits = {Suits.HEARTS, Suits.SPADES, Suits.DIAMONDS, Suits.CLUBS};

    deck = new Card [no_of_Card]; // array of 52 cars
    cur_card = 0; 

   
    for(int count = 0; count < deck.length; count++)
        deck [count] = new Card(types [count % 13], suits [count / 13]);
}
 //shuffle cards using random function
public void shuffle_Deck(){
    cur_card = 0;

    for (int First = 0; First < deck.length; First++){

        int Sec = rnd.nextInt(no_of_Card); //select random number in b/w 0 to 51

        
        Card temp = deck[First];
        deck [First] = deck [Sec];
        deck [Sec] = temp;
    }
}

public void getCard_Deck(){
    int st = 1;
    for(Card k : deck) {
        System.out.println("" + st + "/52 " + k);
        st++;
    }
}

public Card deal_nextCard(){

    
    Card topCard = this.deck[0];

   
    for(int c_Card = 1; c_Card < no_of_Card; c_Card ++){
        this.deck[c_Card-1] = this.deck[c_Card];
    }
    this.deck[no_of_Card-1] = null;

  
    this.no_of_Card--;

    return topCard;
}

	
	public void DeckOfCards() {
		
		throw new UnsupportedOperationException();
	}

	public void shuffleDeck() {
		
		throw new UnsupportedOperationException();
	}

	public void getCardDeck() {
		
		throw new UnsupportedOperationException();
	}

	public Card dealNextCard() {
		
		throw new UnsupportedOperationException();
	}
}