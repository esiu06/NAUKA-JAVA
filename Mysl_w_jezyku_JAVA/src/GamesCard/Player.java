package GamesCard;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name){
        this.name = name;
        this.hand = new Hand(name);
    }
    public Card play(Eights eights, Card prev){
        Card card = searchForMatch(prev);
        if (card == null){
            card = drawFormatch(eights, prev);
        }
        return card;
    }
    public Card searchForMatch(Card prev){
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            if (cardMatches(card, prev)){
                return hand.popCard();
            }
        }
        return null;
    }
    public Card drawFormatch(Eights eights, Card prev){
        while(true){
            Card card = eights.drew();
            System.out.println(name + " wyciągnął " + card);
            if (cardMatches(card, prev)){
                return card;
            }
            hand.addCard(card);
        }
    }
    public static boolean cardMatches(Card card1, Card card2){
        if (card1.getSuit() == card2.getSuit()){
            return true;
        }
        if (card1.getRank() == card2.getRank()){
            return true;
        }
        if (card1.getRank() == 8){
            return true;
        }
        return false;
    }
    public int score(){
        int sum = 0;
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            int rank = card.getRank();
            if (rank == 8){
                sum -= 20;
            }else if (rank > 10){
                sum -= 10;
            }else {
                sum -= rank;
            }
        }
        return sum;
    }

    public Hand getHand() {
        return hand;
    }

    public void display() {
        hand.display();
    }

    public String getName() {
        return name;
    }

    public void displayScore() {
        System.out.println(name + " ma " + score() + " punktów");
    }
}
