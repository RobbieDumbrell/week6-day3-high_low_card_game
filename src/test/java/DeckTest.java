import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck1;

    @Before
    public void before(){
        deck1 = new Deck();
    }

    @Test
    public void has52CardsToStart(){
        assertEquals(52, deck1.countCards());
    }
}
