import java.util.Scanner;

/**
 * Created by WSmith01 on 3/29/2017.
 */
public class Blackjack {

    private static Blackjack bj;

    public Blackjack() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int money, bet;
        boolean userWins;

        money = 100;

        while (true) {
            System.out.println("You have $" + money);
            do {
                System.out.println("How much do you want to bet? (Enter 0 to end)");
                bet = input.nextInt();
                if (bet < 0 || bet > money) {
                    System.out.println("Your bet must be between 0 and " + money + ".");
                } else if (bet == 0) {
                    userWins = playRound();
                    if (userWins) {
                        money += bet;
                    } else {
                        money -= bet;
                    }
                    if (money == 0) {
                        System.out.println("You are out of money.");
                    }
                    break;
                }
                else {
                    System.out.println("You bet $" + bet);
                    userWins = playRound();
                    if (userWins) {
                        money += bet;
                    } else {
                        money -= bet;
                    }
                    if (money == 0) {
                        System.out.println("You are out of money.");
                    }
                    break;
                }
            } while (bet < 0 || bet > money);

        }

    }

    static boolean playRound() {
        Scanner input1 = new Scanner(System.in);
        final int HIT = 1, STAND = 0;
        Hand userHand = new Hand(), dealerHand = new Hand();
        Deck deck = new Deck();

        //deck.shuffle();
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
            System.out.println(":: Total = " + userHand.getHandValue());
            System.out.println("The dealer's hand shows: " + dealerHand.hand.get(0).toString());
            System.out.println("Enter 1 to hit, or 0 to stay!");
            int response;
            do {
                response = input1.nextInt();
                if (response != 0 || response != 1) {
                    System.out.println("Must enter 0 (STAND) or 1 (HIT)");
                }
            } while (response != 0 || response != 1);

            if (response == 0) {
                break;
            } else {
                Card nextCard = deck.dealCard();
                userHand.hand.add(nextCard);
                System.out.print("Your hand now shows: " + userHand.hand.get(0).toString());
                for (int i = 1; i < userHand.hand.size(); i++) {
                    System.out.print(", " + userHand.hand.get(i).toString());
                }
                System.out.println(":: Total = " + userHand.getHandValue());
                if (userHand.getHandValue() > 21) {
                    System.out.println("You bust!");
                    System.out.println("Dealer has " + dealerHand.hand.get(0).toString());
                    for (int i = 1; i < dealerHand.hand.size(); i++) {
                        System.out.print(", " + dealerHand.hand.get(i).toString());
                    }
                    System.out.println(":: Total = " + dealerHand.getHandValue());
                    return false;
                }
            }
        }

        System.out.println("You Stand!");
        System.out.println("Dealer has " + dealerHand.hand.get(0).toString());
        for (int i = 1; i < dealerHand.hand.size(); i++) {
            System.out.print(", " + dealerHand.hand.get(i).toString());
        }
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

        if (dealerHand.getHandValue() >= userHand.getHandValue()) {
            System.out.println("You lose!");
            return false;
        } else {
            System.out.println("You WIN!");
            return true;
        }
    }
}
