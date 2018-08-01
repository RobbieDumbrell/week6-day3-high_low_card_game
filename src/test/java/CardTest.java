import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card1;

    @Before
    public void before(){
        card1 = new Card(SuitType.HEARTS, NumberType.TEN)
    }

    @Test
    public void cardHasSuit(){
        assertEquals(SuitType.HEARTS, card1.getSuit());
    }

    @Test
    public void cardHasNumber(){
        assertEquals(NumberType.TEN, card1.getNumber());
    }
}
