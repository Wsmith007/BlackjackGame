import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by WSmith01 on 3/15/2017.
 */
public class Deck {

    public ArrayList<Card> deck = new ArrayList<>();
    private int cardsUsed;

    public Deck(){
        int deckIndex = 0;
        for(int suit = deckIndex; suit <= 3; suit++){
            for(int value = 1; value <=13; value++){
                deck.add(deckIndex,new Card(value, suit)); ;
                deckIndex++;
            }
        }
        cardsUsed = 0;
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public Card dealCard(){
        if (cardsUsed == 52){
            shuffle();
            cardsUsed = 1;
            return deck.get(cardsUsed - 1);
        }else
        cardsUsed++;
        return deck.get(cardsUsed - 1);
    };

    public int getCardsUsed() {
        return cardsUsed;
    }
}

