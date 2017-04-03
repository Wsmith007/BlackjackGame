import java.util.Scanner;

/**
 * Created by WSmith01 on 3/29/2017.
 */
public class Blackjack {

    public boolean playRound() {
        Scanner input = new Scanner(System.in);
        final String HIT = "hit", STAND = "stand";
        Hand userHand = new Hand(), dealerHand = new Hand();
        Deck deck = new Deck();

        deck.shuffle();
        userHand.hand.add(deck.dealCard());
        dealerHand.hand.add(deck.dealCard());
        userHand.hand.add(deck.dealCard());
        dealerHand.hand.add(deck.dealCard());

        if (dealerHand.getHandValue() == 21) {
            System.out.println("The dealer's hand shows: " + dealerHand.hand.get(0).toString() + " ; " + dealerHand.hand.get(1).toString());
            System.out.print("Your hand shows: " + userHand.hand.get(0).toString() + " ; " + userHand.hand.get(1).toString());
            System.out.println("Dealer wins!");
            return false;
        }
        if (userHand.getHandValue() == 21) {
            System.out.print("Your hand shows: " + userHand.hand.get(0).toString() + " ; " + userHand.hand.get(1).toString());
            System.out.println("The dealer's hand shows: " + dealerHand.hand.get(0).toString() + " ; " + dealerHand.hand.get(1).toString());
            System.out.println("You won!");
            return true;
        }

        while (true) {
            System.out.print("Your hand shows: " + userHand.hand.get(0).toString());
            for (int i = 1; i < userHand.hand.size(); i++) {
                System.out.print(", " + userHand.hand.get(i).toString());
            }
            System.out.println("; Total = " + userHand.getHandValue() + "\n");
            System.out.println("The dealer's hand shows: " + dealerHand.hand.get(0).toString());
            System.out.println("Enter " + HIT + " to hit, or " + STAND + " to stay!");
            String response;
            response = input.next();

            if (response.equalsIgnoreCase(STAND)) {
                break;
            } else {
                Card nextCard = deck.dealCard();
                userHand.hand.add(nextCard);
                if (userHand.getHandValue() > 21) {
                    System.out.println("You bust!");
                    System.out.println();
                    System.out.print("Dealer has " + dealerHand.hand.get(0).toString());
                    for (int i = 1; i < dealerHand.hand.size(); i++) {
                        System.out.print(", " + dealerHand.hand.get(i).toString());
                    }
                    System.out.println(":: Total = " + dealerHand.getHandValue());
                    return false;
                }
            }
        }

        System.out.println("You Stand!");
        System.out.println();
        System.out.print("Dealer has " + dealerHand.hand.get(0).toString());
        for (int i = 1; i < dealerHand.hand.size(); i++) {
            System.out.print(", " + dealerHand.hand.get(i).toString());
        }
        System.out.println();
        while (dealerHand.getHandValue() <= 16) {
            Card nextCard = deck.dealCard();
            System.out.println("Dealer hit and got the " + nextCard.toString());
            dealerHand.hand.add(nextCard);
            if (dealerHand.getHandValue() > 21) {
                System.out.println("Dealer busts!");
                return true;
            }
        }
        System.out.println(":: Dealer's Total = " + dealerHand.getHandValue());
        System.out.println(":: Your Total = " + userHand.getHandValue());


        if (dealerHand.getHandValue() >= userHand.getHandValue()) {
            System.out.println("You lose!");
            return false;
        } else {
            System.out.println("You WIN!");
            return true;
        }
    }
}
