/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Virajkumar Padhiyar
 * Jeni Patel
 * Meet Patel
 * Parthkumar Patel
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.

 */

public enum Suits {

HEARTS(" Hearts"),
SPADES(" Spades"),
DIAMONDS(" Diamonds"),
CLUBS(" Clubs");

private final String suitValue;

private Suits(String suitValue){
    this.suitValue = suitValue;
}

public String PrintSuitValue(){
    return suitValue;
}

	/**
	 * 
	 * @param suitValue
	 */
	private void Suit(String suitValue) {
		// TODO - implement Suits.Suit
		throw new UnsupportedOperationException();
	}
}
