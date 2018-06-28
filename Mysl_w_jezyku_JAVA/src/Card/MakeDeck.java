package Card;

public class MakeDeck {
    public static Card[] makeDeck(){
        Card[] cards = new Card[52];
        if (cards[0] == null){
            System.out.println("nie ma jeszcze żadnych kart");
        }
        int index = 0;
        for (int suit = 0; suit <= 3 ; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
        return cards;
    }
    public static void printDeck(Card[] cards){
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }

    public static void main(String[] args) {
        Card[] cards = makeDeck();
        printDeck(cards);
    }
}
