import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = Deck.populateDeck();
    }

    public static ArrayList<Card> populateDeck(){
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


}
