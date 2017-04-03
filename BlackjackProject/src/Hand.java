import java.util.ArrayList;

/**
 * Created by WSmith01 on 3/20/2017.
 */
public class Hand {

    public ArrayList<Card> hand;

    private int handValue, cardsInHand;

    public Hand(){
        hand = new ArrayList<Card>();
        handValue = 0;
    }

    public int getHandValue() {
        handValue = 0;
        int cardValue;
        cardsInHand = hand.size();

        for (int i = 0;  i < cardsInHand;  i++) {
            // Add the value of the i-th card in the hand.
            Card card;    // The i-th card;
            card = hand.get(i);
            cardValue = card.getValue();  // The blackjack value of the i-th card.

            handValue += cardValue;
        }
        return handValue;
    }
}
