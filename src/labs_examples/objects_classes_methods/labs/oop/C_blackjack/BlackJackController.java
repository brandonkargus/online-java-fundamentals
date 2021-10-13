package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackJackController {

    public static void playBlackJack(){
        Scanner scanner = new Scanner(System.in);

        Player player1 = new Player();
        Player player2 = new Player();
        player2.setName("SkyNet CPU");

        System.out.println("Please enter name of player.....");
        player1.setName(scanner.nextLine());
        scanner.close();

        System.out.println("Dealing cards.......");
        System.out.println();
        Deck newDeck = new Deck();
        newDeck.dealCard(player1);
        newDeck.dealCard(player2);



        System.out.println(player1.getName() + " received.... " + player1.toString());           //as far as I got (6 of 6), hand showing up "Null" on printout
        System.out.println("-------------------------------------------------");
        System.out.println(player2.getName() + " received.... " + player2.toString());

    }

    public static void main(String[] args) {

        playBlackJack();

    }
}
