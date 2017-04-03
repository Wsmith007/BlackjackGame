import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by WSmith01 on 3/29/2017.
 */
public class DeckTest extends TestCase {
    private Deck d1, d2;

    //Creates 2 identical deck objects
    protected void setUp() throws Exception {
        d1 = new Deck();
        d2 = d1;
    }

    public void testDeckCreation() throws Exception {
        assertEquals("After creating deck: 52 cards are expected, and there are " + d1.deck.size() + " cards.", 52, d1.deck.size());
        System.out.println("52 cards are expected, and there are " + d1.deck.size() + " cards");
        System.out.println("==========================================================");
    }

    public void testFirstAndLastSuits() throws Exception {
        assertEquals("Ace of Spades is expected, and it says " + d1.deck.get(0).toString(), "Ace of Spades", d1.deck.get(0).toString());
        System.out.println("Ace of Spades is expected, and it says " + d1.deck.get(0).toString() + " PASS");
        assertEquals("King of Spades is expected, and it says " + d1.deck.get(12).toString(), "King of Spades", d1.deck.get(12).toString());
        System.out.println("King of Spades is expected, and it says " + d1.deck.get(12).toString() + " PASS");
        assertEquals("Ace of Hearts is expected, and it says " + d1.deck.get(13).toString(), "Ace of Hearts", d1.deck.get(13).toString());
        System.out.println("Ace of Hearts is expected, and it says " + d1.deck.get(13).toString() + " PASS");
        assertEquals("King of Hearts is expected, and it says " + d1.deck.get(25).toString(), "King of Hearts", d1.deck.get(25).toString());
        System.out.println("King of Hearts is expected, and it says " + d1.deck.get(25).toString() + " PASS");
        assertEquals("Ace of Diamonds is expected, and it says " + d1.deck.get(26).toString(), "Ace of Diamonds", d1.deck.get(26).toString());
        System.out.println("Ace of Diamonds is expected, and it says " + d1.deck.get(26).toString() + " PASS");
        assertEquals("King of Diamonds is expected, and it says " + d1.deck.get(38).toString(), "King of Diamonds", d1.deck.get(38).toString());
        System.out.println("King of Diamonds is expected, and it says " + d1.deck.get(38).toString() + " PASS");
        assertEquals("Ace of Clubs is expected, and it says " + d1.deck.get(39).toString(), "Ace of Clubs", d1.deck.get(39).toString());
        System.out.println("Ace of Clubs is expected, and it says " + d1.deck.get(39).toString() + " PASS");
        assertEquals("King of Clubs is expected, and it says " + d1.deck.get(51).toString(), "King of Clubs", d1.deck.get(51).toString());
        System.out.println("King of Clubs is expected, and it says " + d1.deck.get(51).toString() + " PASS");
        System.out.println("==========================================================");
    }

    public void testShuffle() throws Exception {
        System.out.println("NO SHUFFLE: First Card = " + d1.deck.get(0).toString() + "; Last Card = " + d1.deck.get(d1.deck.size() - 1).toString());
        d1.shuffle();
        System.out.println("SHUFFLE 1: First Card = " + d1.deck.get(0).toString() + "; Last Card = " + d1.deck.get(d1.deck.size() - 1).toString());
        d1.shuffle();
        System.out.println("SHUFFLE 2: First Card = " + d1.deck.get(0).toString() + "; Last Card = " + d1.deck.get(d1.deck.size() - 1).toString());
        d1.shuffle();
        System.out.println("SHUFFLE 3: First Card = " + d1.deck.get(0).toString() + "; Last Card = " + d1.deck.get(d1.deck.size() - 1).toString());
        d1.shuffle();
        System.out.println("SHUFFLE 4: First Card = " + d1.deck.get(0).toString() + "; Last Card = " + d1.deck.get(d1.deck.size() - 1).toString());
        d1.shuffle();
        System.out.println("SHUFFLE 5: First Card = " + d1.deck.get(0).toString() + "; Last Card = " + d1.deck.get(d1.deck.size() - 1).toString());
        System.out.println("==========================================================");
    }

    public void testDealCard() throws Exception {
        Card c1 = d1.dealCard();
        Card c2 = d1.dealCard();
        Card c3 = d1.dealCard();
        Card c4 = d1.dealCard();
        Card c5 = d1.dealCard();
        d2.shuffle();
        Card c6 = d2.dealCard();
        Card c7 = d2.dealCard();
        Card c8 = d2.dealCard();
        Card c9 = d2.dealCard();
        Card c10 = d2.dealCard();

        System.out.println("DEAL BEFORE SHUFFLE:");
        assertEquals("Ace of Spdaes should be dealt, it gave " + c1.toString(), "Ace of Spades", c1.toString());
        System.out.println("Ace of Spdaes should be dealt, it gave " + c1.toString() + " PASS");
        assertEquals("2 of Spdaes should be dealt, it gave " + c2.toString(), "2 of Spades", c2.toString());
        System.out.println("2 of Spdaes should be dealt, it gave " + c2.toString() + " PASS");
        assertEquals("3 of Spdaes should be dealt, it gave " + c3.toString(), "3 of Spades", c3.toString());
        System.out.println("3 of Spdaes should be dealt, it gave " + c3.toString() + " PASS");
        assertEquals("4 of Spdaes should be dealt, it gave " + c4.toString(), "4 of Spades", c4.toString());
        System.out.println("4 of Spdaes should be dealt, it gave " + c4.toString() + " PASS");
        assertEquals("5 of Spdaes should be dealt, it gave " + c5.toString(), "5 of Spades", c5.toString());
        System.out.println("5 of Spdaes should be dealt, it gave " + c5.toString() + " PASS");
        System.out.println();
        System.out.println("DEAL AFTER SHUFFLE:");
        System.out.println("Ace of Spdaes should be dealt, it gave " + c6.toString() + " PASS");
        System.out.println("2 of Spdaes should be dealt, it gave " + c7.toString() + " PASS");
        System.out.println("3 of Spdaes should be dealt, it gave " + c8.toString() + " PASS");
        System.out.println("4 of Spdaes should be dealt, it gave " + c9.toString() + " PASS");
        System.out.println("5 of Spdaes should be dealt, it gave " + c10.toString() + " PASS");
        System.out.println("==========================================================");

    }

    public void testLastCardDeal() throws Exception {

        //the following ints contain the number of cards used after the entire deck has been dealt(cardsUsed1)
        //and the number of cards used after the deck is reshuffled(cardsUsed2)
        int cardsUsed1, cardsUsed2;

        //The following Card object is the first card of the deck the first time through
        Card firstCard1 = d1.dealCard();

        for(int i = 1; i < d1.deck.size(); i++){
            d1.dealCard();
        }
        //Number of cards used after the entire deck has been dealt; Should = 52;
        cardsUsed1 = d1.getCardsUsed();

        //The following Card object is the first card of the deck after hitting on an empty deck and it automatically reshuffles
        Card firstCard2 = d1.dealCard();

        //Number of cards used after hitting on an "empty deck"(or when d.cardsUsed = 52); Should = 1;
        cardsUsed2 = d1.getCardsUsed();

        assertEquals(52,cardsUsed1);
        assertEquals(1,cardsUsed2);
        System.out.println(firstCard1.toString() + " : " + firstCard2);
        System.out.println("==========================================================");
    }
}
