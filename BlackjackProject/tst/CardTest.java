import junit.framework.TestCase;

/**
 * Created by WSmith01 on 4/1/2017.
 */
public class CardTest extends TestCase {

    private Card c1, c2, c3, c4, c5, c6, c7;

    protected void setUp() throws Exception {

        //Ace of Spades
        c1 = new Card(1,0);
        //Jack of Hearts
        c2 = new Card(11,1);
        //Queen of Diamonds
        c3 = new Card(12,2);
        //King of Clubs
        c4 = new Card(13,3);
        //5 of Spades
        c5 = new Card(5,0);
        //?? of Spades
        c6 = new Card(14,0);
        //3 of ???
        c7 = new Card(3,4);
    }

    public void testValueString() throws Exception {
        assertEquals("Ace is expected, and it says " + c1.getValueString(), "Ace", c1.getValueString());
        System.out.println("Ace is expected, and it says " + c1.getValueString() + " PASS");
        assertEquals("Jack is expected, and it says " + c2.getValueString(), "Jack", c2.getValueString());
        System.out.println("Jack is expected, and it says " + c2.getValueString() + " PASS");
        assertEquals("Queen is expected, and it says " + c3.getValueString(), "Queen", c3.getValueString());
        System.out.println("Queen is expected, and it says " + c3.getValueString() + " PASS");
        assertEquals("King is expected, and it says " + c4.getValueString(), "King", c4.getValueString());
        System.out.println("King is expected, and it says " + c4.getValueString() + " PASS");
        assertEquals("5 is expected, and it says " + c5.getValueString(), "5", c5.getValueString());
        System.out.println("5 is expected, and it says " + c5.getValueString() + " PASS");
        assertEquals("?? is expected, and it says " + c6.getValueString(), "??", c6.getValueString());
        System.out.println("?? is expected, and it says " + c6.getValueString() + " PASS");
        assertEquals("3 is expected, and it says " + c7.getValueString(), "3", c7.getValueString());
        System.out.println("3 is expected, and it says " + c7.getValueString() + " PASS");
        System.out.println("==========================================================");
    }

    public void testSuitString() throws Exception {
        assertEquals("Spades is expected, and it says " + c1.getSuitString(), "Spades", c1.getSuitString());
        System.out.println("Spades is expected, and it says " + c1.getSuitString() + " PASS");
        assertEquals("Hearts is expected, and it says " + c2.getSuitString(), "Hearts", c2.getSuitString());
        System.out.println("Hearts is expected, and it says " + c2.getSuitString() + " PASS");
        assertEquals("Diamonds is expected, and it says " + c3.getSuitString(), "Diamonds", c3.getSuitString());
        System.out.println("Diamonds is expected, and it says " + c3.getSuitString() + " PASS");
        assertEquals("Clubs is expected, and it says " + c4.getSuitString(), "Clubs", c4.getSuitString());
        System.out.println("Clubs is expected, and it says " + c4.getSuitString() + " PASS");
        assertEquals("??? is expected, and it says " + c7.getSuitString(), "???", c7.getSuitString());
        System.out.println("??? is expected, and it says " + c7.getSuitString() + " PASS");
        System.out.println("==========================================================");
    }

    public void testCreateToString() throws Exception {
        assertEquals("Ace of Spades is expected, and it says " + c1.toString(), "Ace of Spades", c1.toString());
        System.out.println("Ace of Spades is expected, and it says " + c1.toString() + " PASS");
        assertEquals("Jack of Hearts is expected, and it says " + c2.toString(), "Jack of Hearts", c2.toString());
        System.out.println("Jack of Hearts is expected, and it says " + c2.toString() + " PASS");
        assertEquals("Queen of Diamonds is expected, and it says " + c3.toString(), "Queen of Diamonds", c3.toString());
        System.out.println("Queen of Diamonds is expected, and it says " + c3.toString() + " PASS");
        assertEquals("King of Clubs is expected, and it says " + c4.toString(), "King of Clubs", c4.toString());
        System.out.println("King of Clubs is expected, and it says " + c4.toString() + " PASS");
        assertEquals("5 of Spades is expected, and it says " + c5.toString(), "5 of Spades", c5.toString());
        System.out.println("5 of Spades is expected, and it says " + c5.toString() + " PASS");
        assertEquals("?? of Spades is expected, and it says " + c6.toString(), "?? of Spades", c6.toString());
        System.out.println("?? of Spades is expected, and it says " + c6.toString() + " PASS");
        assertEquals("3 of ??? is expected, and it says " + c7.toString(), "3 of ???", c7.toString());
        System.out.println("3 of ??? is expected, and it says " + c7.toString() + " PASS");
        System.out.println("==========================================================");
    }
}
