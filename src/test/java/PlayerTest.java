import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Card card1;
    Player player1;
    Player player2;

    @Before
    public void before(){
        card1 = new Card(SuitType.CLUBS, NumberType.TWO);
        player1 = new Player("Vicky");
        player2 = new Player("Robbie");
    }

    @Test
    public void hasName(){
        assertEquals("Vicky", player1.getName());
    }

    @Test
    public void hasName2(){
        assertEquals("Robbie", player2.getName());
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, player1.handCount());
    }

    @Test
    public void handCanReceiveCard(){
        player1.receiveCard(card1);
        assertEquals(1, player1.handCount());
    }
}
