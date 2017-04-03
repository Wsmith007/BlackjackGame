/**
 * Created by WSmith01 on 3/15/2017.
 */
public class Card {

    public static final int SPADES = 0, HEARTS = 1, DIAMONDS = 2, CLUBS = 3, ACE = 1, KING = 13, QUEEN = 12, JACK = 11;
    private final int SUIT;
    private int value;

    public Card(int value, int suit) {
        this.value = value;
        this.SUIT = suit;
    }

    public String getValueString() {
        switch (value) {
            case ACE:
                return "Ace";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                return "??";
        }
    }

    public String getSuitString() {
        switch (SUIT) {
            case SPADES:
                return "Spades";
            case HEARTS:
                return "Hearts";
            case DIAMONDS:
                return "Diamonds";
            case CLUBS:
                return "Clubs";
            default:
                return "???";
        }
    }

    public int getValue() {
        if(value > 10){
            value = 10;
        }
        return value;
    }

    public int getSUIT() {
        return SUIT;
    }

    public String toString() {

        return getValueString() + " of " + getSuitString();
    }
}
