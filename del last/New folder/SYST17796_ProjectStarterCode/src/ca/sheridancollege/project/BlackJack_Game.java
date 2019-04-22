/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Virajkumar Padhiyar
 * Jeni Patel
 * Meet Patel
 * Parthkumar Patel
*/

package ca.sheridancollege.project;
import java.util.Scanner;
/**
 *
 * @author jenip
 */

public class BlackJack_Game {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean s = false;
     //player name 
    System.out.println("What's your name ?");
    String ans = scanner.nextLine();
    Player me = new Player(ans);
    Player dealer = new Player("Dealer");

    
    System.out.println("Want to play new game ? Yes/No");
    ans = scanner.nextLine();

    if (ans.equalsIgnoreCase("Yes")) {

        Card_deck deck1 = new Card_deck();
        Card card1 = new Card(Card_type.ACE, Suits.CLUBS);
        deck1.shuffle_Deck();

        me.addCard(deck1.deal_nextCard());
        me.addCard(deck1.deal_nextCard());
        me.getPlayerHand(true);
        System.out.println(" ");
        dealer.addCard(deck1.deal_nextCard());
        dealer.addCard(deck1.deal_nextCard());
        dealer.getPlayerHand(false);

       
        do {
            System.out.println( me.getPlayerName() + " bust or stay Here? 'bust/stay'");
            ans = scanner.nextLine();
            //if player select bust tthen
            if (ans.equalsIgnoreCase("Bust")) {
                me.addCard(deck1.deal_nextCard());
                System.out.println(me.getHandSum());
                if (me.getHandSum() > 21) {
                    System.out.println(" busted and  total of " + me.getHandSum() + ". Dealer win");
                    System.exit(0);
                }
            }
          //if playr choose to s then below code will be executed
            if (ans.equalsIgnoreCase("stay")) {
                System.out.println("You chosen to stay. Your hand: " + me.getHandSum());
            }

        } while (ans.equalsIgnoreCase("Bust"));

        
        s = false;

        do {
            System.out.println("");
            System.out.println("Dealers turn ");
            //code for draw card
            if (dealer.getHandSum() <= 15) {
                dealer.addCard(deck1.deal_nextCard());
                if(dealer.getHandSum() == 15){
                    System.out.println(" Dealer won.");
                    System.exit(0);
                }
                if (dealer.getHandSum() > 21) {
                    System.out.println("Dealer busted and got a total of " + dealer.getHandSum() + ". " + me.getPlayerName() + " wins ");
                    System.exit(0);
                }
            } else {
                System.out.println("Dealer choosen to stay!");
                int totalDealerSum = dealer.getHandSum();
                int totalPlayerSum = me.getHandSum();

                if(totalDealerSum > totalPlayerSum){
                    System.out.println(" players  decided to stay and The winner is " + dealer.getPlayerName() + " with  total of " +  totalDealerSum + ".");
                } else {
                    System.out.println("players decided to stay and  The winner is " + me.getPlayerName() + " with  total of " + totalPlayerSum + ".");
                }
                s = false;
            }

        } while (s);
    }
}
}

