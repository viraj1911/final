/**
 * SYST 17796 Project Winter 2019 code.
 * Students can modify and extend to implement their game.
 * 
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author Virajkumar Padhiyar
 * Jeni Patel
 * Meet Patel
 * Parthkumar Patel 
 */
public class Player {

private String Player_Name;
private int No_ofCards;
ArrayList<Card> player_Hand;
	private String PlayerName;
	private int playerNumOfCards;

public Player (String name){
    this.Player_Name = name;
    player_Hand = new ArrayList<Card>();

}

public String getPlayerName() {
    return Player_Name;
}

public void addCard(Card newCard){
    player_Hand.add(newCard);
    this.No_ofCards++;
}

public int getHandSum(){
    int totalSum = 0;
    for(Card countSum: player_Hand){
        totalSum = totalSum + countSum.getCardType();
    }
    return totalSum;
}

public void getPlayerHand(boolean hide_Card) {
    System.out.println(this.Player_Name + " Current Hand");
    for ( int i = 0; i < No_ofCards; i++){
        if(i == 0 && !hide_Card){
            
        } else {
            System.out.println(player_Hand.get(i).toString());
        }
    }
}
}







