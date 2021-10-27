package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackJackController {

    public static void playBlackJack() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name......");
        Player player1 = new Player(scanner.nextLine());

        Player player2 = new Player("Skynet CPU");

        System.out.println("Please enter a starting pot.......");

        int pot = scanner.nextInt();
        scanner.nextLine();
        while (pot < 1) {
            System.out.println("Pot must be greater than 0... Please enter another number.");
            pot = scanner.nextInt();
            scanner.nextLine();
        }

        player1.setPotValue(pot);
        player2.setPotValue(pot);

        Deck newDeck = new Deck();


         while (player1.getPotValue() > 0 && player2.getPotValue() > 0)   {
                 // TODO: while loop here with option to end early



        int min = 1;
        int max = player2.getPotValue();
        int player2bet = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Please place your bets.....");
        int player1bet = scanner.nextInt();
        while (player1bet < 1 || player1bet > player1.getPotValue()) {
            System.out.println("Invalid amount, please enter amount greater than zero, and less than or equal to current potValue...");
            player1bet = scanner.nextInt();
        }
        scanner.nextLine();

                                        // TODO how to create new hand and not keep building on previous, same for hand value


        newDeck.dealCard(player1);
        newDeck.dealCard(player2);
        newDeck.dealCard(player1);
        newDeck.dealCard(player2);


        System.out.println(player1.getName() + " has bet " + player1bet);
        System.out.println(player2.getName() + " has bet " + player2bet);

        System.out.println(player1);
        System.out.println();

        System.out.println("Would you like another card?");

        String answer = scanner.nextLine();
        while ((answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) && !player1.getHand().overTwentyOne()) {


            System.out.println("You've asked for another card......");
            newDeck.dealCard(player1);
            System.out.println();
            System.out.println(player1);
            if (!player1.getHand().overTwentyOne()) {

                System.out.println("Would you like another card?");
                answer = scanner.nextLine();

            }

            System.out.println();

        }

        while (player2.computerAI()) {
            System.out.println(player2.getName() + " has asked for another card......");
            newDeck.dealCard(player2);

        }
        System.out.println("------------------------------------------------------------");

        if (player1.getHand().overTwentyOne()) {
            System.out.println(player1.getName() + " has BUSTED!");
        }
        if (player2.getHand().overTwentyOne()) {
            System.out.println(player2.getName() + " has BUSTED!");
        }

        if (player1.getHand().overTwentyOne() && !player2.getHand().overTwentyOne()) {
            System.out.println(player2.getName() + " has won the round!!!!!!");
            player2.setPotValue(player2.getPotValue() + player1bet);
            player1.setPotValue((player1.getPotValue() - player1bet));
        } else if (player2.getHand().overTwentyOne() && !player1.getHand().overTwentyOne()) {
            System.out.println(player1.getName() + " has won the round!!!!!!");
            player1.setPotValue((player1.getPotValue() + player2bet));
            player2.setPotValue(player2.getPotValue() - player2bet);
        } else if (player1.getHand().getHandValue() > player2.getHand().getHandValue() && !player1.getHand().overTwentyOne() && !player2.getHand().overTwentyOne()) {
            System.out.println(player1.getName() + " " + "has won the round!!!!!!");
            player1.setPotValue((player1.getPotValue() + player2bet));
            player2.setPotValue(player2.getPotValue() - player2bet);
        } else if (player2.getHand().getHandValue() > player1.getHand().getHandValue() && !player2.getHand().overTwentyOne() && !player1.getHand().overTwentyOne()) {
            System.out.println(player2.getName() + " " + "has won the round!!!!!!");
            player2.setPotValue(player2.getPotValue() + player1bet);
            player1.setPotValue((player1.getPotValue() - player1bet));
        } else {
            System.out.println("Round was a Tie!");
        }
        System.out.println();
        System.out.println(player1);
        System.out.println(player2);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
             System.out.println();
             System.out.println("Deal another round? (y/n)");


             // TODO need something here to either deal another hand or break out of while



         }
        System.out.println("GAME OVER!");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Final results........");
        System.out.println();
        System.out.println(player1);
        System.out.println(player2);

    }


    public static void main(String[] args) {

        playBlackJack();


    }
}
