import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Dealer {

    private Deck deck;
    private ArrayList<Player> players;


    public Dealer(){
        this.players = new ArrayList<Player>();
        this.deck = new Deck();
    }

    public Deck getDeck(){
        return this.deck;
    }

    public int countPlayers(){
        return this.players.size();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void deal(){
        deck.shuffle();
        for (Player player: players){
            Card pickedCard = deck.pickCard();
            player.receiveCard(pickedCard);
        }
    }

//    public HashMap<String, ArrayList> getAllHands(){
//        HashMap<String, ArrayList> allHands = new HashMap<>();
//        String name;
//        ArrayList hand;
//        for (Player player: players){
//           name = player.getName();
//           hand = player.getHand();
//           allHands.put(name, hand);
//        }
//        return allHands;
//    }
//
//    // compare the values of the hash
//    // return the name with the highest value
//    public String whoWon(){
//
//    }



}
