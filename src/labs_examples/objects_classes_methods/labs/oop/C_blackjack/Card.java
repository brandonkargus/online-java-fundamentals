package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    static char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    private int suit;
    private int cardValue;


    public Card(int suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public int getSuit() {
        return this.suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getCardValue() {                 //SHOW in 1-on-1 (4 of 6)
        int value;
        if(this.cardValue > 9){
            value = 10;
        }else{
            value = this.cardValue + 1;
        }
        return value;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
    public char showSuit(int suit){                    //SHOW IN 1-on-1 (1 of 6)
        switch(suit){
            case 0: return '♠';
            case 1: return '♦';
            case 2: return '♥';
            default:return '♣';
        }
    }

    @Override
    public String toString() {
        return "Card is " + cardValue +  showSuit(suit);
    }
}
