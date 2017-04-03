import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by WSmith01 on 4/2/2017.
 */
public class HandTest extends TestCase {
    private Hand h1;
    private int h1Value;


    protected void setUp() throws Exception {
        h1 = new Hand();
        h1.hand.add(new Card(10,0));
        h1.hand.add(new Card(5,3));
        h1.hand.add(new Card(6,2));
    }

    public void testHandValue() {
        h1Value = h1.getHandValue();
        assertEquals("The value of the hand should be " + h1Value + ", and it's " + h1.getHandValue(), 21, h1Value);
        System.out.println("The value of the hand should be " + h1Value + "; HAND = " + h1Value);
        System.out.println("==========================================================");
    }
}
