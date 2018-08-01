import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = Deck.populateDeck();
    }

    private static ArrayList<Card> populateDeck(){
        ArrayList<Card> startingDeck = new ArrayList<Card>();

        SuitType[] allSuits = SuitType.values();
        NumberType[] allNumbers = NumberType.values();

        for ( NumberType number : allNumbers ){
            for ( SuitType suit : allSuits ){
                Card card = new Card(suit, number);
                startingDeck.add(card);
            }
        }
        return startingDeck;
    }

    public int countCards(){
        return cards.size();
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card pickCard(){
        return this.cards.remove(0);
    }


}
