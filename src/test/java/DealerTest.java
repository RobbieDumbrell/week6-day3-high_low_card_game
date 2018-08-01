import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Player player1;
    Player player2;
    Dealer dealer1;
    Deck dealersDeck;

    @Before
    public void before(){

        card1 = new Card(SuitType.CLUBS, NumberType.TWO);
        card2 = new Card(SuitType.CLUBS, NumberType.THREE);
        card3 = new Card(SuitType.SPADES, NumberType.TWO);
        card4 = new Card(SuitType.HEARTS, NumberType.TWO);
        player1 = new Player("Vicky");
        player2 = new Player("Robbie");
        dealer1 = new Dealer();

    }

    @Test
    public void hasFullDeck(){
        dealersDeck = dealer1.getDeck();
        assertEquals(52, dealersDeck.countCards());
    }

    @Test
    public void tableStartsEmpty(){
        assertEquals(0, dealer1.countPlayers());
    }

    @Test
    public void canAddPlayersToTable(){
        dealer1.addPlayer(player1);
        dealer1.addPlayer(player2);
        assertEquals(2, dealer1.countPlayers());
    }

    @Test
    public void canDealCardToPlayer(){
        dealer1.addPlayer(player1);
        dealer1.addPlayer(player2);
        dealer1.deal();
        dealersDeck = dealer1.getDeck();
        assertEquals(50, dealersDeck.countCards());
        assertEquals(1, player1.handCount());
        assertEquals(1, player2.handCount());
    }

    @Test
    public void canGetAllHands(){
        dealer1.addPlayer(player1);
        dealer1.addPlayer(player2);
        dealer1.deal();
        HashMap allHands = dealer1.getAllHands();
        assertEquals(2, allHands.size());
    }

//    @Test
//    public void higherNumberCardWins(){
//        player1.receiveCard(card1);
//        player2.receiveCard(card2);
//        dealer1.addPlayer(player1);
//        dealer1.addPlayer(player2);
//        assertEquals(player2, dealer1.whoWon());
//    }
}