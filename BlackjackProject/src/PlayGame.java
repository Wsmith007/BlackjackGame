import java.util.Scanner;

/**
 * Created by WSmith01 on 4/3/2017.
 */
public class PlayGame {

    public static void main(String[] args) {
        Blackjack bj = new Blackjack();
        Scanner input = new Scanner(System.in);
        int money, bet;
        boolean userWins;


        money = 100;

        while (money != 0) {
            System.out.println("You have $" + money);
            do {
                System.out.println("How much do you want to bet? (Enter 0 to end)");
                bet = input.nextInt();
                if (bet < 0 || bet > money) {
                    System.out.println("Your bet must be between 0 and " + money + ".");
                } else if (bet == 0) {
                    break;
                } else {
                    System.out.println("You bet $" + bet);
                    userWins = bj.playRound();
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
}
