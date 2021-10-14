package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int handValue;

    public Hand(){
        getHandValue();
        this.cards = new ArrayList<>();
    }

    public Hand(ArrayList<Card> cards, int handValue) {
        this.cards = cards;
        this.handValue = handValue;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
    public void addCard(Card card){          //look here
        cards.add(card);
    }
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {                              //SHOW in 1-on-1 (5 of 6)
        for(int i = 0; i < cards.size(); i++){
            handValue += cards.get(i).getCardValue();
        }

        return handValue;
    }
    public boolean overTwentyOne(){                    //SHOW in 1-on-1 no "equal to" mentioned (3 of 6)
        return handValue > 21 ?  true : false;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    @Override
    public String toString() {
        return "Hand" +
                " = " + cards +
                ", handValue=" + handValue +
                '}';
    }
}
