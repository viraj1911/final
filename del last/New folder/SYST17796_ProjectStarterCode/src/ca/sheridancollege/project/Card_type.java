/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author 
 */
    
public enum Card_type {

ACE(1), DEUCE (2), THREE (3),
FOUR(4), FIVE(5), SIX(6),
SEVEN(7), EIGHT(8), NINE(9),
TEN(10), JACK(10), QUEEN(10),
KING(10);


private final int cardvalue ;

private Card_type(int cardvalue){
    this.cardvalue = cardvalue;
}

public int getcardvalue(){
    return cardvalue;
}

	/**
	 * 
	 * @param cardvalue
	 */
	private void CardType(int cardvalue) {
		// TODO - implement Card_type.CardType
		throw new UnsupportedOperationException();
	}
}
