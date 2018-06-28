package GamesCard;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck("Talia");
        deck.suffle();

        Hand hand = new Hand("Układ");
        deck.deal(hand, 5);
        hand.display();

        Hand drawPile = new Hand("Stos ciągnięcia");
        deck.dealAll(drawPile);
        System.out.printf("Stos ciągnięcia zawiera %d kart.\n", drawPile.size());

        Eights eights = new Eights();
        eights.playGame();
    }
}
